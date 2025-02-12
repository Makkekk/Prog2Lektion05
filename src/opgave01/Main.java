package opgave01;

public class Main {
    public static void main(String[] args) {
        Person mikael = new Person("Mikael", "Lynghøj", "Christensen");

        mikael.printName((first, middle, surname) -> (first + " " + middle.charAt(0) + ". " + surname));

        mikael.printName((firstName, middle,surname) -> firstName.charAt(0) + ". " + surname);

    }

}
