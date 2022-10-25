package Inheritance2;

import Inheritance1.Clock;

public class WorldClock extends Clock {
    private int offset;

    public WorldClock(int offset) {

        this.offset = offset % 24;

    }
    public int getHours() {

        int hr = super.getHour();

        hr += offset;

        if (hr > 23) {

            hr = hr - 24;

        }

        else if (hr < 0) {

            hr = hr + 24;

        }

        return hr;

    }

}
