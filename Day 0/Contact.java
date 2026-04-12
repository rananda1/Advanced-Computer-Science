public class Contact implements Comparable {

    private String firstName;
    private String lastName;
    private String telephoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        if (telephoneNumber.charAt(3) == '-' && telephoneNumber.charAt(7) == '-' && telephoneNumber.length() == 12) {
            this.telephoneNumber = telephoneNumber;
        } else {
            throw new IllegalArgumentException("Must be correct format.");
        }
    }

    public Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (telephoneNumber.charAt(3) == '-' && telephoneNumber.charAt(7) == '-' && telephoneNumber.length() == 12) {
            this.telephoneNumber = telephoneNumber;
        } else {
            throw new IllegalArgumentException("Must be correct format.");
        }

    }

    public int compareTo(Object other) {
        Contact contact = (Contact) other;
        if (getFirstName().compareTo(contact.getFirstName()) != 0) {
            return getFirstName().compareTo(contact.getFirstName());
        }
        if (getLastName().compareTo(contact.getLastName()) != 0) {
            return getLastName().compareTo(contact.getLastName());
        }
        if (getTelephoneNumber().compareTo(contact.getTelephoneNumber()) != 0) {
            return getTelephoneNumber().compareTo(contact.getTelephoneNumber());
        }
        return 0;
    }

    public int compareToLast(Object other) {
        Contact contact = (Contact) other;
        if (getLastName().compareTo(contact.getLastName()) != 0) {
            return getLastName().compareTo(contact.getLastName());
        }
        if (getFirstName().compareTo(contact.getFirstName()) != 0) {
            return getFirstName().compareTo(contact.getFirstName());
        }
        if (getTelephoneNumber().compareTo(contact.getTelephoneNumber()) != 0) {
            return getTelephoneNumber().compareTo(contact.getTelephoneNumber());
        }
        return 0;
    }

    // public int compareToNumber(Object other) {
    // Contact contact = (Contact) other;
    // if (getTelephoneNumber().compareTo(contact.getTelephoneNumber()) != 0) {
    // return getTelephoneNumber().compareTo(contact.getTelephoneNumber());
    // }
    // if (getFirstName().compareTo(contact.getFirstName()) != 0) {
    // return getFirstName().compareTo(contact.getFirstName());
    // }
    // if (getLastName().compareTo(contact.getLastName()) != 0) {
    // return getLastName().compareTo(contact.getLastName());
    // }
    // if (getFirstName().compareTo(contact.getFirstName()) != 0) {
    // return getFirstName().compareTo(contact.getFirstName());
    // }
    // return 0;
    // }

    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + "  Telephone Number: " + getTelephoneNumber();
    }

}
