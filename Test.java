import Inheritance1.Clock;

public class Test {
    public static void main(String[] args) {

        Clock c = new Clock();

        System.out.printf("%02d:%02d\n", c.getHour(), c.getMinute());

        WordClock worldClock = new WordClock(3);

        System.out.println(worldClock.getTime());

    }

}
