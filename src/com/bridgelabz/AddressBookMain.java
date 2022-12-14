
package com.bridgelabz;

        import java.util.Scanner;

public class AddressBookMain {
    public static Person input(Scanner scanner) {

        System.out.println("Please provide first name");
        String firstName = scanner.next();

        System.out.println("Please provide Last name");
        String lastName = scanner.next();

        System.out.println("Please provide address");
        String address = scanner.next();

        System.out.println("Please provide city");
        String city = scanner.next();

        System.out.println("Please provide state");
        String state = scanner.next();

        System.out.println("Please provide zip");
        int zip = scanner.nextInt();

        System.out.println("Please provide phone number");
        String phoneNumber = scanner.next();

        Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);

        return person;
    }


    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        /*
        Contacts added using Constructor and print it using print function of Addressbook.
         */
        Person person = new Person("Vinayak", "Garole", "Ranale", "Nandurbar", "Maharashtra", 425411, "8380867601");
        addressBook.addContact(person);
        System.out.println("Before adding Contacts are");
        addressBook.printAddressBook();
        /*
        Adding new Contact using addContact method and by taking input from the user using Scanner
        and calling input method and printing it
         */
        System.out.println("Please enter details of new contacts you want to add");
        Person person1 = input(scanner);
        addressBook.addContact(person1);
        System.out.println("Before deleting Contacts are");
        addressBook.printAddressBook();

       /*
       deleting existing contact by searching its name
        */
        System.out.println("Please enter name of the person you want to delete");
        System.out.println();
        addressBook.deleteContact("Vinayak");
        System.out.println("After deleting contact details are");
        addressBook.printAddressBook();

    }
}