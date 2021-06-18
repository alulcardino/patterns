package com.omsu.patterns.generative.prototype;

public class School extends Building{
    private int workers;

    public School(School school) {
        super(school);
        workers = school.workers;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    @Override
    public Building clone() {
        return new School(this);
    }
}
