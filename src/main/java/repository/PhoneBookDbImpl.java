 package repository;

import domain.Contact;

import java.util.*;

 public class PhoneBookDbImpl implements PhoneBookDb{

    private final Map<Long, Contact> contactDb = new HashMap<>();
    private long counter = 0;

     public Long save(Contact contact) {
         if (contactDb.containsKey(counter)) {
             contactDb.put(++counter,contact);
         } else {
             contactDb.put(counter,contact);
         }
         return counter;
     }

    @Override
    public void deleteContact(Long Id) {
        Contact contact = contactDb.get(Id);
        if (contact != null) {
            contactDb.remove(Id);
        } else {
            System.out.println(" Id doesn't exist ");
        }
    }

    @Override
    public Optional<Contact> findById(Long Id) {
        return Optional.ofNullable(contactDb.get(Id));
    }

    @Override
    public List<Contact> findAll() {
        return new ArrayList<>(contactDb.values());
    }



}
