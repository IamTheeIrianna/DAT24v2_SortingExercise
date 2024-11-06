
public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;
    private double height;

    public Person(String firstName, String lastName, int age, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }
@Override
public String toString(){
        return "Fornavn: " + getFirstName() + ", Efternavn: " + getLastName() + ", Alder: " + getAge() + ", Højde: " + getHeight();
}
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

}

