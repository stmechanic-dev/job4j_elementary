package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String clinic;

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }

    public void treatment() {

    }
}