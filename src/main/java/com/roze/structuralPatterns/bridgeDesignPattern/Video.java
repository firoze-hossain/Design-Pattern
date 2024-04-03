package com.roze.structuralPatterns.bridgeDesignPattern;
//this is one Hierarchy
public abstract class Video {
    //we have bridge here
    //Or we can say we have build has a relationship
    //we don't use Is a relationship(inheritance concept)
    protected VideoProcessor videoProcessor;

    public Video(VideoProcessor videoProcessor) {
        this.videoProcessor = videoProcessor;
    }

    public abstract void play(String videoFile);
}
