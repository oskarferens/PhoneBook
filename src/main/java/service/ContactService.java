package service;

import repository.PhoneBookDbImpl;
import domain.Contact;

import java.util.Optional;

public class ContactService {
    private final PhoneBookDbImpl db;

    public ContactService(PhoneBookDbImpl db) {
        this.db = db;
    }

    public void saveContact (Contact contact) {
        db.save(contact);
    }

    public Optional<Contact> findById(Long Id) {
        return db.findById(Id);
    }

    public void deleteContact (Long Id) {
        db.deleteContact(Id);
    }
}
