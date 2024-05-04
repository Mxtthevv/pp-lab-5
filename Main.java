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

        int result = MathUtils.add(30, 54);
        System.out.println("Wynik dodawania: " + result);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Wynik dodawania liczb 30 i 54 to: " + result);
    }
}