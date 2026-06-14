/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe_part1;


/**
 *
 * @author Student
 */
public class Message {
   int count = 0;
   int index = 0;
   
    String[] sentMessages = new String[100];
    String[] storedMessages = new String[100];
    String[] messageIDs = new String[100];
    String[] messageHashes = new String[100];
    String[] recipients = new String[100];

    // Check number
    public boolean checkNumber(String number) {

        return number.startsWith("+27") && number.length() <= 13;
    }

    // Send message
    public String sendMessage(String number, String message) {

        if (message.length() > 250) {
            return "Message too long";
        }

        if (!checkNumber(number)) {
            return "Invalid phone number";
        }

        sentMessages[index] = message;
        recipients[index] = number;

        messageIDs[index] = "MSG" + index;
        messageHashes[index] = "HASH" + index;

        count++;
        index++;
        storeMessage(message);

        return "Message sent successfully";
    }

    // Store message
    public void storeMessage(String message) {

        storedMessages[index] = message;
        index++;

        System.out.println("Message stored");
    }

    // Show messages
    public void showMessages() {

        for (int i = 0; i < index; i++) {

            if (sentMessages[i] != null) {
                System.out.println(sentMessages[i]);
            }
        }
    }

    // Longest message
    public String longestMessage() {

        String longest = "";

        for (int i = 0; i < index; i++) {

            if (sentMessages[i] != null &&
                sentMessages[i].length() > longest.length()) {

                longest = sentMessages[i];
            }
        }

        return longest;
    }
    public String searchMessageID(String id) {

    for (int i = 0; i < index; i++) {

        if (messageIDs[i] != null &&
            messageIDs[i].equals(id)) {

            return sentMessages[i];
        }
    }

    return "Message not found";
}
    public void searchRecipient(String recipient) {

    for (int i = 0; i < index; i++) {

        if (recipients[i] != null &&
            recipients[i].equals(recipient)) {

            System.out.println(sentMessages[i]);
        }
    }
}
    public String deleteMessage(String hash) {

    for (int i = 0; i < index; i++) {

        if (messageHashes[i] != null &&
            messageHashes[i].equals(hash)) {

            sentMessages[i] = "";

            return "Message successfully deleted";
        }
    }

    return "Hash not found";
}
    public void displayReport() {

    for (int i = 0; i < index; i++) {

        if (sentMessages[i] != null &&
            !sentMessages[i].equals("")) {

            System.out.println("Hash: " +
                    messageHashes[i]);

            System.out.println("Recipient: " +
                    recipients[i]);

            System.out.println("Message: " +
                    sentMessages[i]);

            System.out.println();
        }
    }
}
}