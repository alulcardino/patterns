package com.omsu.patterns.structual.facade;

public class Human {
    Brain brain = new Brain();
    Liver liver = new Liver();
    Lungs lungs = new Lungs();
    Heart heart = new Heart();

    void live() {
        brain.makeMistake();
        brain.think();
        liver.neutralization();
        lungs.breathe();
        lungs.exhale();
        heart.beat();
        heart.stop();
    }
}
