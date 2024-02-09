package org.example.Tasks.P02GSM;

import java.sql.Time;
import java.util.Date;

public class Call {
    private Date date;
    private Time time;
    private int minutes;

    public Call(Date date, Time time, int minutes) {
        this.date = date;
        this.time = time;
        this.minutes = minutes;
    }


}
