package GamerWork;

import GamerWork.Entities.IUnit;

public class Seller implements IUnit {
    private int id;
    private String name;
    private String surName;
    private String mission;

    public Seller(){}

    public Seller(int id, String name, String surName, String mission) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.mission = mission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
}
