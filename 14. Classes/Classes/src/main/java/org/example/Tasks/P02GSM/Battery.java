package org.example.Tasks.P02GSM;

public class Battery {
    private String model;
    private String idleTime;
    private int hoursTalks;
    private Display display;

    public Battery(String model, String idleTime, int hoursTalks, Display display) {
        this.model = model;
        this.idleTime = idleTime;
        this.hoursTalks = hoursTalks;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(String idleTime) {
        this.idleTime = idleTime;
    }

    public int getHoursTalks() {
        return hoursTalks;
    }

    public void setHoursTalks(int hoursTalks) {
        this.hoursTalks = hoursTalks;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}
