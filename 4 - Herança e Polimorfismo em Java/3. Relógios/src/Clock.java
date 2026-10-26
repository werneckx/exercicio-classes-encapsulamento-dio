public sealed abstract class Clock {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 24) {
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        if (hour >= 60) {
            this.hour = 60;
            return;
        }
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String getTime(){
        return hour + ":" + minute + ":" + second
    }

    abstract Clock convert(Clock clock)
}
