package com.roze.structuralPatterns.bridgeDesignPattern;
//Bridge design pattern solves problem when we use huge classes
//It creates Hierarchy of different classes(creates Has a relationship instead of Is a relationship)
//By using this pattern we can gain abstraction
//it reduces the creation of exponential subset of classes
//In this implementation we have used only two hierarchies,
//for this we have gain endless combination and permutation of classes
public class Main {
    public static void main(String[] args) {
        Video youtubeVideo = new YoutubeVideo(new MP4VideoProcessor());
        youtubeVideo.play("ArRahman.mp4");
        Video netflixVideo=new NetflixVideo(new HDVideoProcessor());
        netflixVideo.play("AlQadr.mp4");
    }
}
