package com.roze.behavioral.observerDesignPattern;

public class ObserverApplication {
    public static void main(String[] args) {
        NewsAgencyObservable observable = new NewsAgencyObservable();
        ChannelObserver observer = new ChannelObserver();
        observable.addObserver(observer);
        observable.setNews("Hello Firoze");
        System.out.println(observer.getNews());
    }
}
