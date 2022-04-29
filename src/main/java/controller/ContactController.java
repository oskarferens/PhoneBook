package controller;

import controller.repository.PhoneBookDbImpl;
import domain.Contact;
import service.ContactService;
import java.util.Scanner;

public class ContactController {
    private ContactService service; //service to referencja
    private PhoneBookDbImpl db;
    private Scanner scanner;

    public ContactController() {
        this.scanner = new Scanner(System.in);
    }

    public void startApplication() {
        boolean working = true;
        db = new PhoneBookDbImpl();
        service = new ContactService(db);

        while(working) {
            System.out.println("Wybierz opcje do wyboru");
            scanner = new Scanner(System.in);
            System.out.println("1 - dodaj kontakt");
            //int chooseNumber = scanner.nextInt();
            System.out.println("wpisz imie");
            String name = scanner.nextLine();
            System.out.println("wpisz nazwisko");
            String lastName = scanner.nextLine();
            System.out.println("wpisz miejsce zamieszkania");
            String residence = scanner.nextLine();
            System.out.println("wpisz numer telefonu");
            Integer phoneNumber = scanner.nextInt();
            Contact contact = new Contact(phoneNumber,name,lastName,residence);
            service.saveContact(contact);
            Contact contact1 = service.findById(1L).get();
            System.out.println(contact1);
            service.deleteContact(1L);
            System.out.println(db.findAll());
        }

    }

}
