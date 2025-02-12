package opgave01;

public class Person implements NameFormatter {
    private String firstName;
    private String middleName;
    private String surname;

    public Person(String firstName, String middleName, String surname) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
    }

    public void printName(NameFormatter formatter) {
        System.out.println(formatter.format(firstName, middleName, surname));
    }

    @Override
    public String format(String firstName, String middleName, String surname) {
        return firstName + middleName + surname;
    }
}
