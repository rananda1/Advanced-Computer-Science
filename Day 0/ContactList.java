import java.util.ArrayList;
import java.util.Collections;
import java.util.AbstractList;

public class ContactList extends AbstractList {

    // instance variable
    private ArrayList<Contact> contactList;

    // constructor
    // to-do: initializes an empty contact list
    public ContactList() {
        contactList = new ArrayList<Contact>();
    }

    // methods

    // to-do: findInsertLocation(String name)
    /**
     * returns the location in the contact list where the name should go to keep the
     * list
     * alphabetized
     */
    private int findInsertLocation(Contact name) {
        // You can use a sequential search here. But for a Stretch Challenge, try to do
        // a binary search.
        if (name == null) {
            throw new IllegalArgumentException("Parameter cannot be null.");
        }

        int num = 0;
        for (int i = 0; i < contactList.size(); i++) {
            if ((contactList.get(i).toString().compareTo(name.toString())) < 0) {
                num += 1;
            }
            // if ((contactList.get(i).toLowerCase().compareTo(name.toLowerCase())) == 0) {
            // num = i;
            // return i;
            // }
        }

        return num;
        // return -1;
    }

    // to-do: add(String name)
    /**
     * adds a name to the contact list so that the list remains alphabetized, it
     * prints out which
     * name is being added, also the method prevents duplicate names from being
     * added
     */

    public boolean add(Contact name) {

        if (name == null) {
            throw new IllegalArgumentException("Parameter cannot be null.");
        }

        if (!has(name)) {
            System.out.println("+ Adding " + name);
            contactList.add(findInsertLocation(name), name);
            return true;
        }

        return false;
    }

    // to-do: add(ArrayList<String> names)
    /* this method adds a list of names to the contact list */
    public void add(ArrayList<Contact> names) {

        if (names == null) {
            throw new IllegalArgumentException("Parameter cannot be null.");
        }

        for (int i = 0; i < names.size(); i++) {
            add(names.get(i));
        }

    }

    // to-do: remove(String name)
    /** removes name from the contact list and keeps list alphabetized */
    public boolean remove(Contact name) {

        if (name == null) {
            throw new IllegalArgumentException("Parameter cannot be null.");
        }

        if (has(name)) {
            System.out.println("- Removing " + name);
            contactList.remove(name);
            return true;
        }

        return false;

    }

    // to-do: remove(ArrayList<String> names)
    /* this method removes a list of names from the contact list */
    public void remove(ArrayList<Contact> names) {

        if (names == null) {
            throw new IllegalArgumentException("Parameter cannot be null.");
        }

        for (int i = 0; i < names.size(); i++) {
            remove(names.get(i));
        }

    }

    /** returns a String containing all of the words in list */
    public String toString() {

        String arrayString = "";
        for (int i = 0; i < contactList.size(); i++) {
            arrayString += ", " + contactList.get(i);
        }
        if (arrayString.length() > 2) {
            arrayString = "[" + arrayString.substring(2) + "]";
        } else {
            arrayString = "[" + arrayString + "]";
        }

        return "Contact List: " + arrayString;
    }

    // to-do: get(int index)
    /** returns the name at the specified index */
    public Contact get(int index) {

        if (index < 0 || index >= contactList.size()) {
            throw new IllegalArgumentException("Must be a valid index.");
        }

        return contactList.get(index);

    }

    // to-do: size()
    /** returns the number of names in the contact list */
    public int size() {
        return contactList.size();
    }

    // to-do: clear()
    /** removes all names from the contact list */
    public void clear() {
        contactList = new ArrayList<Contact>();
        System.out.println("Clearing the contact list");
    }

    public boolean has(Contact name) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i) == name) {
                return true;
            }
        }
        return false;
    }

    public void sortByFirstName() {
        Collections.sort(contactList);
    }

    // bubble sort class modified for strings

    private int[] nums;
    private boolean sorted;

    public void checkSorted() {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                sorted = false;
                return;
            }
        }
        sorted = true;
    }

    public void sort() {
        while (!sorted) {
            for (int i = 0; i < nums.length - 1; i++) {
                swap(i);
            }
            checkSorted();
        }
        sorted = true;
    }

    public void swap(int index) {
        if (nums[index] > nums[index + 1]) {
            int num = nums[index + 1];
            nums[index + 1] = nums[index];
            nums[index] = num;
        }
    }
}