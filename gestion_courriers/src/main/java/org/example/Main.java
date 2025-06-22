package org.example;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            GestionMessage gm = new GestionMessage();

       //insert
            Message m = new Message("test@gmail.com", "Sujet test", new Date(), "Ceci est un test", 0);
            gm.Envoyer_MSG(m);
            System.out.println("Message envoyé.");

        //affich
            List<Message> messages = gm.Lister();
            for (Message msg : messages) {
                System.out.println(msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
