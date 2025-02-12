package opgave04;

import opgave03.Runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Opgave04 {
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


        //Opgave A fejlen sker fordi der itereres imens der bliver fjernet emner fra loopet
        // OBS: Throws exception.

        Iterator<Runner> iterator = runners.iterator();
        while (iterator.hasNext()) {
            Runner runner = iterator.next();
            if (runner.getLapTime() > 40) {
                iterator.remove(); // Safely remove the element
            }
        }

        //or runners.removeIf(runner -> runner.getLapTime() > 40);


        //opgave 3

        boolean removed = removeIf(runners, runner -> runner.getLapTime() >= 40);

        public static boolean removeIf (List <Runner> runners, Predicate <Runner> filter){
            Iterator<Runner> iterator2 = runners.iterator();
            boolean removed = false;

            while (iterator.hasNext()) {
                Runner runner = iterator.next();
                if (filter.test(runner)) {
                    iterator.remove();  // Fjerner løberen, hvis den tilfredsstiller filteret
                    removed = true;      // Sæt removed til true, hvis en løber blev fjernet
                }
            }

            return removed;  // Returner true hvis nogen blev fjernet, ellers false
        }


        System.out.println(runners);
        System.out.println();

    }
}
