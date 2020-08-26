/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneSearch;

import PhoneSearch.domain.Contact;
/**
 *
 * @author Evan
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UI {

    private List<Contact> contacts;
    private Scanner reader = new Scanner(System.in);
    private Map<String, Contact> numbers;

    public UI() {
        this.contacts = new ArrayList<Contact>();
        this.numbers = new HashMap<String, Contact>();
    }

    public void start() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
        this.commandCenter();
    }

    public void commandCenter() {
        String input;

        while (true) {
            System.out.print("\ncommand: ");
            input = reader.nextLine();

            if (input.equals("x")) {
                break;
            } else if (input.equals("1")) {
                addNumber();
            } else if (input.equals("2")) {
                searchForNumber();
            } else if (input.equals("3")) {
                searchByNumber();
            } else if (input.equals("4")) {
                addAddress();
            } else if (input.equals("5")) {
                personInfo();
            } else if (input.equals("6")) {
                remove();
            } else if (input.equals("7")) {
                filterSearch();
            }
        }
    }

    public void addNumber() {
        String name;
        String number;
        System.out.print("whose number: ");
        name = reader.nextLine();
        Contact contact = new Contact(name);
        if (!this.contacts.contains(contact)) {
            this.contacts.add(contact);
        }

        for (Contact c : this.contacts) {
            if (c.getName().equals(name)) {
                System.out.print("number: ");
                number = reader.nextLine();
                c.addNumber(number);
                this.numbers.put(number, c);
                break;
            }
        }
    }

    public void addAddress() {
        String name;
        String address;
        System.out.print("whose address: ");
        name = reader.nextLine();
        Contact contact = new Contact(name);
        if (!this.contacts.contains(contact)) {
            this.contacts.add(contact);
        }

        for (Contact c : this.contacts) {
            if (c.getName().equals(name)) {
                System.out.print("street: ");
                address = reader.nextLine();
                System.out.print("city: ");
                address += " " + reader.nextLine();
                c.addAddress(address);
                break;
            }
        }
    }

    public void searchForNumber() {
        String name;
        System.out.print("whose number: ");
        name = reader.nextLine();
        Contact contact = new Contact(name);
        if (!this.contacts.contains(contact)) {
            System.out.print("  not found\n");
            return;
        }

        for (Contact c : this.contacts) {
            if (c.getName().equals(name)) {
                for (String number : c.getNumbers()) {
                    System.out.println(" " + number);
                }
                break;
            }
        }

    }

    public void searchByNumber() {
        String number;
        System.out.print("number: ");
        number = reader.nextLine();

        if (!this.numbers.containsKey(number)) {
            System.out.print("  not found\n");
            return;
        }
        System.out.println(" " + this.numbers.get(number).getName());
    }

    public void personInfo() {
        String name;
        System.out.print("whose information: ");
        name = reader.nextLine();
        Contact contact = new Contact(name);
        if (!this.contacts.contains(contact)) {
            System.out.print("  not found\n");
            return;
        }

        for (Contact c : this.contacts) {
            if (c.getName().equals(name)) {
                System.out.println(c);
                break;
            }
        }

    }
    
    public void filterSearch(){
        String filter;
        System.out.print("keyword (if empty, all listed): ");
        filter = reader.nextLine();
       Collections.sort(contacts);
       boolean found = false;
        for(Contact c: this.contacts){
            if(c.toString().contains(filter) || c.getName().contains(filter)){
                found = true;
                System.out.println("\n " + c.getName() + "\n" + c);
            }
        }
        if(found == false){
            System.out.println("  not found\n");
        }
    }
    
    public void remove(){
        String name;
        System.out.print("whose information: ");
        name = reader.nextLine();
        
        for (Contact c : this.contacts) {
            if (c.getName().equals(name)) {
                
                this.numbers.values().removeAll(Collections.singleton(c.getName()));
                this.numbers.keySet().removeAll(c.getNumbers());
                this.contacts.remove(c);
                break;
            }
        }
    }
}
