package com.example.watcher;


import javafx.scene.text.Text;

public class ObserverHolder {
    int time;
    Text text= new Text();
    IObserver myObserver = new MyObserver();


    public IObserver getObserver() {
        return myObserver;
    }

    private class MyObserver implements IObserver{

        @Override
        public void update(IServer server) {
            time = server.getTimeState();
            System.out.println(time);
            text.setText(""+ time);
        }
    }


}