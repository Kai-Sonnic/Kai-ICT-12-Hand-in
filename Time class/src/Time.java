public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;


    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 59 || minute < 0) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 59 || second < 0) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public Time nextSecond() {
        int newHour, newMinute, newSecond;
        newSecond = this.second + 1;
        newMinute = this.minute;
        newHour = this.hour;
        if (newSecond == 60) {
            newSecond = 0;
            newMinute += 1;
            if (newMinute == 60) {
                newMinute = 0;
                newHour += 1;
                if (newHour == 24) {
                    newHour = 0;
                }
            }
        }
        setTime(newHour, newMinute, newSecond);
        return this;
    }

    public Time previousSecond() {
        int newHour, newMinute, newSecond;
        newSecond = this.second - 1;
        newMinute = this.minute;
        newHour = this.hour;
        if (newSecond == -1) {
            newSecond = 59;
            newMinute -= 1;
            if (newMinute == -1) {
                newMinute = 59;
                newHour -= 1;
                if (newHour == -1) {
                    newHour = 23;
                }
            }
        }
        setTime(newHour, newMinute, newSecond);
        return this;
    }

}