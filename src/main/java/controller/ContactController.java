package controller;

import repository.PhoneBookDbImpl;
import service.ContactService;
import java.util.Scanner;

import static Dictionary.ContactDictionary.addContactMessage;
import static Dictionary.ContactDictionary.welcomeMessage;

public class ContactController {

    private ContactService service;
    private PhoneBookDbImpl db;
    private Scanner scanner;

    public ContactController() {
        this.scanner = new Scanner(System.in);
    }

    public void startApplication() {
        boolean working = true;
        db = new PhoneBookDbImpl();
        service = new ContactService(db,scanner);
        int option = 0;
        scanner = new Scanner(System.in);

        while(working) {
            showWelcomeMessage(welcomeMessage);
            showAddContactMessage(addContactMessage);
            option = scanner.nextInt();
            switch (option) {
                case 1: service.saveContact();
                    break;
                case 2: service.findAll();
                    break;
                case 3: service.deleteContact();
                    break;
                case 4: service.findById();
                    break;

                default:
                    working = false;
                    System.out.println("You didn't choose anything");
                    break;
            }
        }
    }
    private void showWelcomeMessage(final String welcomeMessage) {
        System.out.println(welcomeMessage);
    }

    private void showAddContactMessage(final String showAddContactMessage) {
        System.out.println(showAddContactMessage);
    }
}

/*while(working) {
        System.out.println("Wybierz opcje do wyboru");
        scanner = new Scanner(System.in);
        System.out.println("1 - dodaj kontakt");
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
        }*/
