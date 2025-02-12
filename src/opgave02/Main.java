package opgave02;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PeopleArray<Person> peopleArray = new PeopleArray();
        addPeople(peopleArray);
        System.out.println();

        //Den første person der hedder Klaus
        System.out.println("Den første person der hedder Klaus: " + peopleArray.findFirst(person -> person.getName().equals("Klaus")));

        //Den første person der har et navn med længxden 4
        System.out.println("Den første person der har et navn med længden 4: " + peopleArray.findFirst(p -> p.getName().length() == 4));
        //Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1

        System.out.println("Den Første person med alderen 44: " + peopleArray.findFirst(    person -> person.getAge() == 44));
        System.out.println("Den Første person med mere end et i: " + peopleArray.findFirst(person -> person.countOccurrenceOfI() > 1));
        System.out.println("Den Første person hvis alder er lig med navnets længde: " + peopleArray.findFirst(person -> person.getName().length() == person.getAge()));


        //Get all
        List<Person> people = peopleArray.findAll(p -> p.getAge() > 30);
        System.out.println("\nAlle personer hvis navn indeholder i: " + peopleArray.findAll(person ->person.getName().toLowerCase().contains("i")));
        System.out.println("Alle personer hvis navn starter med S: " + peopleArray.findAll(person -> person.getName().charAt(0) == 'S'));
        System.out.println("Den alle personer der har et navn med længden 5: " + peopleArray.findAll(p -> p.getName().length() == 5));
        System.out.println("Den alle personer med en alder imellem 6-40: " + peopleArray.findAll(p -> p.getAge() >= 6 && p.getAge() < 40));

    }

    private static void addPeople(PeopleArray peopleArray) {
        peopleArray.addItem(new Person("Bent", 25));
        peopleArray.addItem(new Person("Susan", 34));
        peopleArray.addItem(new Person("Mikael", 60));
        peopleArray.addItem(new Person("Klaus", 44));
        peopleArray.addItem(new Person("Birgitte", 17));
        peopleArray.addItem(new Person("Liselotte", 9));
    }
}
