package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Phones phone1 = new MobilePhone("Samsung", "pink", "steal", 15);
        Phones phone2 = new MobilePhone("iPhone", "red", "gorilla glass", 98);
        Phones phone3 = new MobilePhone("Oppo", "blue", "aluminium", 24);

        Contact contact1=new Contact("Vasile", "0783409456");
        Contact contact2=new Contact("Ion", "0783409486");
        Contact contact3=new Contact("Radu", "0723409456");
        Contact contact4=new Contact("Gigi", "0783309556");
        Contact contact5=new Contact("Sebi", "0783409456");
        Contact contact6=new Contact("Andrei", "0783409456");

        Message message1=new Message("Hello1");
        Message message2=new Message("Nice to meet you1");
        Message message3=new Message("Can we go outside?");
        Message message4=new Message("Eat something?");
        Message message5=new Message("How was your day?");
        Message message6=new Message("How do you do?");

        phone1.createContact(contact1);
        phone1.createContact(contact3);
        phone1.createContact(contact6);
        System.out.println("CONTACTS phone 1");

        System.out.println();
        phone1.seeAllContacts();
        System.out.println();


        phone1.sendTextMessage(contact2,message4);
        phone1.sendTextMessage(contact3,message5);
        phone1.sendTextMessage(contact6,message6);
        phone1.sendTextMessage(contact1,message2);
        phone1.sendTextMessage(contact2,message1);

        System.out.println("MESSAGES");
        phone1.seeAllMessages(contact1);
        phone1.seeAllMessages(contact2);
        phone1.seeAllMessages(contact3);
        phone1.seeAllMessages(contact4);
        phone1.seeAllMessages(contact5);
        phone1.seeAllMessages(contact6);

        System.out.println();

        phone1.makeCall(contact1);
        phone1.makeCall(contact2);
        phone1.makeCall(contact3);
        phone1.makeCall(contact4);
        phone1.makeCall(contact5);
        phone1.makeCall(contact6);

        System.out.println("CALLS");
        phone1.seeAllCalls();
        System.out.println();


    }
}
