package com.example.watcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Subject {
    Timer timer;
    private List<Observer> observers = new ArrayList<Observer>();
    int state;
    int d,p;
    public Subject(){
        this.state = 0;
        this.d = 0;
        this.p = 0;
    }


}
