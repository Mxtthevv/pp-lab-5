import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Mateusz", 21);
            System.out.println("Imie: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }

        Person[] people = new Person[5];
        int b = 10;
    
        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Adam Kowalski", 20);
            people[2] = new Person("Bartek Nowak", 40);
            people[3] = new Person("Czarek Nowacki", 35);
            people[4] = new Person("Daniel Wysocki", 26);
    
            for (Person person : people) {
                int value = MathUtils.add(person.getAge(), b);
                System.out.println("Wiek " + person.getName() + ": " + value);
    
                Messenger messenger = new EmailMessenger();
                messenger.sendMessage("Wiek " + person.getName() + " to: " + value);
            }
        } catch (InvalidAgeException e) {
            System.err.println("Wiek jest nieprawidłowy: " + e.getMessage());
        }
    }
}