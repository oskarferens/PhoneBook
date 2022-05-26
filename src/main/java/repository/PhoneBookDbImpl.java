 package repository;

import domain.Contact;

import java.util.*;

 public class PhoneBookDbImpl implements PhoneBookDb{

    private final Map<Long, Contact> contactDb = new HashMap<>();
    private long counter = 0;

    public void save(Contact contact) {
        if (contactDb.containsValue(counter)) {
            contactDb.put(counter++,contact);
        } else {
            contactDb.put(counter,contact);
        }
    }

    @Override
    public void deleteContact(Long Id) {
        Contact contact = contactDb.get(Id);
        if (contact != null) {
            contactDb.remove(Id);
        }
    }

    @Override
    public Optional<Contact> findById(Long Id) {
        return Optional.of(contactDb.get(Id));
    }

    @Override
    public List<Contact> findAll() {
        return new ArrayList<>(contactDb.values());
    }
}
