package com.example.worldskillsolegchabykin.models;

public class Bankomat {
private String address;
private String type;
private boolean isWorking;
private String workingTime;

    public Bankomat(String address, String type, boolean isWorking, String workingTime) {
        this.address = address;
        this.type = type;
        this.isWorking = isWorking;
        this.workingTime = workingTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }
}
