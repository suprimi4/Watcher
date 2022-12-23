package com.example.watcher;

public abstract class Observer {
    protected Subject subject ;
    public abstract void update(Subject st);

}
