package opgave03;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;

public class Opgave03 {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.addAll(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)));
        System.out.println(runners);
        System.out.println();

        runners.forEach(runner -> System.out.println(runner.getName() + " - " + runner.getLapTime()));

        System.out.println("Runners with a laptime over 30");
        runners.forEach(runner -> {
            if (runner.getLapTime() > 30) {
                System.out.println(runner.getName() + " - " + runner.getLapTime());
            }
        });

        System.out.println("sorteret løbere efter tid");
        runners.sort((runner1, runner2) -> Integer.compare(runner1.getLapTime(),runner2.getLapTime()));

        runners.forEach(runner -> System.out.println(runner.getName() + " - " + runner.getLapTime()));

    }
}
