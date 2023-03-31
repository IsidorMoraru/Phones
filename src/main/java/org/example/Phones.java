package org.example;

import java.util.*;

public abstract class Phones {

    List<Contact> contactList = new ArrayList<>();
    HashMap<Contact, List<Message>> listMessageToContact = new HashMap<>();

    List<String> callList = new ArrayList<>();
    final String brand;
    final String color;
    final String material;

    public double baterryLife;

    public Phones(String brand, String color, String material, double bateryLife) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.baterryLife = bateryLife;
    }

    public void createContact(Contact contact) {
        if (contactList.contains(contact)) {
            System.out.println("Contact exist already");
        }
        contactList.add(contact);
    }



    public void seeAllContacts() {
        for (Contact contact : contactList) {
            System.out.println("Name: " + contact.name + "/ PhoneNumber:" + contact.phoneNumber);
        }
    }



    public void sendTextMessage(Contact contact, Message message) {
        if (baterryLife < 0) {
            System.out.println("The phone have no baterry");
        } else {

            if (contactList.contains(contact)) {
                List<Message> messageList = listMessageToContact.get(contact);

                if (messageList == null) {
                    messageList = new ArrayList<>();
                    listMessageToContact.put(contact, messageList);

                }
                messageList.add(message);
                baterryLife = baterryLife - 2;
            } else {
                System.out.println("Contact doesn't exist.");
            }
        }
    }

    public void seeAllMessages(Contact contact) {
        List<Message> messageList = listMessageToContact.get(contact);
        if (messageList != null) {
            for (Message message : messageList) {
                System.out.println(message.toString() + "sent to" + contact);
            }
        } else {
            System.out.println("No messages for contact " + contact.getName());
        }
    }

    public void makeCall(Contact contact) {
        if(baterryLife < 0)
        {
            System.out.println("Charge!");
        }
        else
        {
            if (contactList.contains(contact)) {

                String call = "You called " + contact;
                baterryLife = baterryLife - 5;
                callList.add(call);
            }

        else{
            System.out.println("Contact doesn't exist");

        }

    }}


    public void seeAllCalls() {
        for (String calls : callList) {
            System.out.println(calls);
            System.out.println(baterryLife);
        }

    }



}


