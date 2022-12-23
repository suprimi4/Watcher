package com.example.watcher;

public interface IServer {
    void attach(IObserver observer);

    void detach(IObserver observer);

    void notifyAllObservers();
    int getTimeState();
}
