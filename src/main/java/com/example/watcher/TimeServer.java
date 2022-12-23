package com.example.watcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TimeServer implements  IServer{
    private Timer timer;
    private TimerTask task;
    int delay;
    int period;
    int timeState;
    List<IObserver> observers = new ArrayList<>();

    public int getTimeState() {
        return timeState;
    }

    public void setTimeState(int timeState) {
        this.timeState = timeState;
    }

    public TimeServer(int delay, int period) {

        this.timer = new Timer();
        this.delay = delay;
        this.period = period;
        this.timeState = 0;

        task = new TimerTask() {

            public void run() {

                tick();

            }

        };

        timer.schedule(task, delay, period);

    }

    private  void tick() {

        timeState++;

        notifyAllObservers();
    }


    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(IObserver observer: observers){
            observer.update(this);
        }
    }
}