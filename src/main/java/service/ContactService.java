package service;

import repository.PhoneBookDbImpl;
import domain.Contact;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

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
        String residence = scanner.nextLine();
        Contact contact = new Contact(phoneNumber,name,lastname,residence);
        Long id = db.save(contact);
        System.out.println("Saved contact " + contact + " pod id " + id);
        /*
        Po save kontakt ma id null, napraw :)
        Po save kontakt nadpisuje poprzednie id zamiast wrzucić do kolejnego, napraw :)
         */
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
        /*
        Zwrocic informacje na konsole "Usunieto kontakt o ID : 20"
         */
    }

    public void findAll() {
        System.out.println(db.findAll());
        /*
        Zwrocic wszystkie kontakty + rozmiar tabelii kontaktow
        Wszystkie kontakty (20):
        -cont 1
        -cont 2
         */
    }
}
