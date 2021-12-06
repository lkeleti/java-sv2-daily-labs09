package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String  bandName;
    private LocalDateTime dateOfTheConcert;
    private int price;

    public Ticket(String bandName, LocalDateTime dateOfTheConcert, int price) {
        this.bandName = bandName;
        this.dateOfTheConcert = dateOfTheConcert;
        this.price = price;
    }

    public LocalTime entryTime() {
        return LocalTime.of(dateOfTheConcert.getHour()-1,dateOfTheConcert.getMinute());
    }

    public String getBandName() {
        return bandName;
    }

    public LocalDateTime getDateOfTheConcert() {
        return dateOfTheConcert;
    }

    public int getPrice() {
        return price;
    }
}
