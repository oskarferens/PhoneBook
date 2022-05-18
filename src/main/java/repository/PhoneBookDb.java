package repository;

import domain.Contact;

import java.util.List;
import java.util.Optional;

public interface PhoneBookDb {

    void save(Contact contact);

    void deleteContact(Long Id);

    Optional<Contact> findById(Long Id);

    List<Contact> findAll();

    void create(Contact contact);
}
