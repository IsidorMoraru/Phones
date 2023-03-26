package org.example;

import java.util.ArrayList;
import java.util.List;

public class Contact {


    public String name;
    public String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name=name;

        if(phoneNumber.length()!=10){
            this.phoneNumber=null;
        }
        else{
            this.phoneNumber=phoneNumber;
        }
    }


    @Override
    public String toString() {
        return "Contact{" +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
