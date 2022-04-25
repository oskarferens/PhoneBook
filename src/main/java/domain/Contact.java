package domain;

import java.util.Objects;

public class Contact {
    private Integer phoneNumber;
    private String firstName;
    private Long Id;
    private String lastName;
    private String residence;

    public Contact(Integer phoneNumber, String firstName, Long id, String lastName, String residence) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        Id = id;
        this.lastName = lastName;
        this.residence = residence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber) && Objects.equals(firstName, contact.firstName) && Id.equals(contact.Id) && Objects.equals(lastName, contact.lastName) && Objects.equals(residence, contact.residence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
