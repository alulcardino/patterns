package com.omsu.patterns.behaviour.mediator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Signal implements Mediator {
    Su27 su27;
    Boeing747 boeing747;

    public void setSu27(Su27 su27) {
        this.su27 = su27;
    }

    public void setBoeing747(Boeing747 boeing747) {
        this.boeing747 = boeing747;
    }

    @Override
    public void send(Dispatcher dispatcher, String message) {
        Map<Dispatcher, Double> map = new HashMap<>();
        map.put(su27, Location.dist(dispatcher.getPoint2D(), su27.getPoint2D()));
        map.put(boeing747, Location.dist(dispatcher.getPoint2D(), boeing747.getPoint2D()));
        Optional<Map.Entry<Dispatcher, Double>> entry = map.entrySet()
                .stream().filter(x -> x.getValue() != 0)
                .min(Comparator.comparingDouble(Map.Entry::getValue));
        Dispatcher notifable = entry.get().getKey();

        if(dispatcher == su27) {
            notifable.notify("From Su-27. SOS. " + dispatcher.getPoint2D().toString() + " " + message);
        } else if(dispatcher == boeing747) {
            notifable.notify("From Boeing747. SOS. " + dispatcher.getPoint2D().toString() + " " + message);
        }
    }
}
