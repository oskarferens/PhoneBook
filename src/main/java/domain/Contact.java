package domain;


import java.util.Objects;

public class Contact {
    private Long Id;
    private Integer phoneNumber;
    private String firstName;
    private String lastName;
    private String residence;

    public Contact(Integer phoneNumber, String firstName, String lastName, String residence) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
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

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber=" + phoneNumber +
                ", firstName='" + firstName + '\'' +
                ", Id=" + Id +
                ", lastName='" + lastName + '\'' +
                ", residence='" + residence + '\'' +
                '}';
    }

    public void setId(Long id) {
        Id = id;
    }
}
