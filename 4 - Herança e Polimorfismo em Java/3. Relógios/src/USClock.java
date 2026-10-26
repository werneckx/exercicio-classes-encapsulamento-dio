import java.time.Clock;

public non-sealed class USClock extends Clock {

    private String periodIndicator; // AM ou PM

    public void setAfterMidday() {
        this.periodIndicator = "PM";
    }

    public void setBeforeMidday() {
        this.periodIndicator = "AM";
    }

    public void setHour(int hour) {
        setAfterMidday();
        if (hour >= 12 && hour <= 23) {
            setBeforeMidday();
            this.hour = hour - 12;
        } else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock ->
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            case BRClock brClock -> this.setHour(brClock.getHour());
        }
        return null;
    }

    @Override
    public String getTime(){
        return super.getTime() + this.periodIndicator;
    }
}
