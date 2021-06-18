package com.omsu.patterns.generative.prototype;

public class Hospital extends Building{
    private int workers;

    public Hospital(Hospital hospital) {
        super(hospital);
        workers = hospital.workers;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    @Override
    public Building clone() {
        return new Hospital(this);
    }
}
