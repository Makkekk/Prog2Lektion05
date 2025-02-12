package opgave02;

import java.util.Locale;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int countOccurrenceOfI() {
        String fullName = name.toLowerCase();
        int count = 0;
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == 'i') {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return String.format("Person[%s,%d]", name, age);
    }
}
