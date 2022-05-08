package controller.repository;

import domain.Contact;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PhoneBookDbImpl implements PhoneBookDb{

    private final Map<Long, Contact> contactDb = new HashMap<>();

    public void save(Contact contact) {
        contactDb.put(1L, contact);
    }

    @Override
    public void deleteContact(Long Id) {
        contactDb.get(Id);
    }

    @Override
    public Optional<Contact> findById(Long Id) {
        return Optional.of(contactDb.get(Id));
    }

    @Override
    public List<Contact> findAll() {
        return null;
    }

}
