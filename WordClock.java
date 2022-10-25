import Inheritance1.Clock;

public class WordClock extends Clock {
    private int timeOffset;

    public WordClock(int timeOffset) {

        this.timeOffset = timeOffset;

    }

    public int getHour() {

        int hour = super.getHour() + timeOffset;

        if (hour > 23) {

            while (hour > 23) {

                hour = 23 - hour;

            }

        }

        if (hour < 0) {

            while (hour < 0) {

                hour = 23 + hour;

            }

        }

        return hour;

    }

}
