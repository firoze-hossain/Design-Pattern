package com.roze.structuralPatterns.flyweightDesignPattern;

import javax.swing.*;

import com.roze.structuralPatterns.flyweightDesignPattern.ShapeFactory.ShapeType;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMainApp extends JFrame {
    private static final long serialVersionUID = -1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;
    private static final ShapeType[] shapes = {ShapeType.LINE, ShapeType.OVAL_FILL, ShapeType.OVAL_NOFILL};
    private static final Color[] colors = {Color.RED, Color.GREEN, Color.YELLOW};

    public ClientMainApp(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        Container contentPane = getContentPane();
        JButton startButton = new JButton("Draw");
        final JPanel jPanel = new JPanel();
        contentPane.add(jPanel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = jPanel.getGraphics();
                for (int i = 0; i < 20; ++i) {
                    Shape shape = ShapeFactory.getShape(getRandomShape());
                    shape.draw(g, getRandomX(), getRandomY(), getRandomWIDTH(), getRandomHEIGHT(), getRandomCOLOR());
                }
            }
        });
    }

    private ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWIDTH() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHEIGHT() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomCOLOR() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        ClientMainApp drawing = new ClientMainApp(500, 600);
    }
}
