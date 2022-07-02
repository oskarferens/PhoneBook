package service;

import repository.PhoneBookDbImpl;
import domain.Contact;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class ContactService {

    private final PhoneBookDbImpl db;
    private Scanner scanner;

    public ContactService(PhoneBookDbImpl db, Scanner scanner) {
        this.db = db;
        this.scanner = scanner;
    }

    public void saveContact () {
        System.out.println("wprowadz imie");
        String name = scanner.nextLine();
        System.out.println("wprowadz nazwisko");
        String lastname = scanner.nextLine();
        System.out.println("wprowadz numer telefonu");
        int phoneNumber = scanner.nextInt();
        System.out.println("wprowadz adres zamieszkania");
        scanner.nextLine();
        String residence = scanner.nextLine();

        Contact contact = new Contact(phoneNumber,name,lastname,residence);
        Long id = db.save(contact);
        contact.setId(id);

        System.out.println("Saved contact " + contact + " pod id " + id);
    }

    public void findById() {
        System.out.println("Wpisz numer Id");
        long Id = scanner.nextLong();
        db.findById(Id).ifPresentOrElse(
                System.out::println,() -> System.out.println("not found")
        );
    }

    public void deleteContact () {
        System.out.println("Wpisz numer Id do usuniecia");
        long IdToDelete = scanner.nextLong();
        db.deleteContact(IdToDelete);
        System.out.println("Kontakt o Id: " + IdToDelete + " zostal usuniety");
    }

    public void findAll() {
        List<Contact> all = db.findAll();
        for (Contact contact : all) {
            System.out.println(contact);
        }
    }

    private void splitAndSave(String line) {
        String[] split = line.split(",");
        String s = split[0];
        int i = Integer.parseInt(s);
        Contact contact = new Contact(i,split[1],split[2],split[3]);
        Long id = db.save(contact);
        contact.setId(id);
    }

    public void importContacts() {
        Scanner scanner = new Scanner(System.in);
        Path pathToFile = Path.of("C:\\Users\\oskar\\IdeaProjects\\PhoneBookDirectory\\src\\main\\resources\\PhoneDbServiceContactFile.txt");
        System.out.println(pathToFile.getFileName());

        try (Stream<String> stream = lines(pathToFile)){
            stream.filter(a -> !a.isEmpty()).forEach(a -> splitAndSave(a));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
