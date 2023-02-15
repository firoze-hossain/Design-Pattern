package com.roze.mediator;

import com.roze.components.*;

import javax.swing.*;

public class Editor implements Mediator {
    private Title title;
    private TextBox textBox;
    private AddButton addButton;
    private DeleteButton deleteButton;
    private SaveButton saveButton;
    private List list;
    private Filter filter;

    private JLabel titleLabel = new JLabel("Title:");
    private JLabel textLabel = new JLabel("Text");
    private JLabel label = new JLabel("Add or select existing note to proceed");

    @Override
    public void addNewNote(Note note) {
        title.setText("");
        textBox.setText("");
        list.addElement(note);
    }

    @Override
    public void deleteNote() {
        list.deleteElement();
    }

    @Override
    public void getInfoFromList(Note note) {
        title.setText(note.getName().replace('*', ' '));
        textBox.setText(note.getText());
    }

    @Override
    public void saveChanges() {
        try {
            Note note = (Note) list.getSelectedValue();
            note.setName(title.getText());
            note.setText(textBox.getText());
            list.repaint();
        } catch (NullPointerException e) {

        }
    }

    @Override
    public void markNote() {
        try {
            Note note = list.getCurrentElement();
            String name = note.getName();
            if (!name.endsWith("*")) {
                note.setName(note.getName() + "*");
            }
            list.repaint();
        } catch (NullPointerException e) {

        }
    }

    @Override
    public void clear() {
        title.setText("");
        textBox.setText("");
    }

    @Override
    public void sendToFilter(ListModel listModel) {
        filter.setList(listModel);
    }

    @Override
    public void setElementsList(ListModel list) {

    }

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        switch (component.getName()) {
            case "AddButton":
                addButton = (AddButton) component;
                break;
            case "DelButton":
                deleteButton = (DeleteButton) component;
                break;
            case "Filter":
                filter = (Filter) component;
                break;
            case "List":
                list = (List) component;
                this.list.addListSelectionListener(listSelectionEvent -> {
                    Note note = (Note) list.getSelectedValue();
                    if (note != null) {
                        getInfoFromList(note);
                    } else {
                        clear();
                    }
                });
                break;
            case "SaveButton":
                saveButton = (SaveButton) component;
                break;
            case "TextBox":
                textBox = (TextBox) component;
                break;
            case "Title":
                title = (Title) component;
                break;
        }
    }

    @Override
    public void hideElements(boolean flag) {

    }

    @Override
    public void createGUI() {

    }
}
