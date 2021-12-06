package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class FrontOfStageTicket extends Ticket{
    private String extraCode;

    public FrontOfStageTicket(String bandName, LocalDateTime dateOfTheConcert, int price, String extraCode) {
        super(bandName, dateOfTheConcert, price);
        this.extraCode = extraCode;
    }

    @Override
    public LocalTime entryTime() {
        return LocalTime.of(getDateOfTheConcert().getHour()-2, getDateOfTheConcert().getMinute());
    }
}
