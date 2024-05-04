import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Mateusz", 21);
            System.out.println("Imie: " + person.getName());
            System.out.println("Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Testowa treść wiadomości email");
    }
}