abc/*
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

    // Check phone number
    public boolean checkNumber(String number) {
        return number.startsWith("+27") && number.length() <= 13;
    }

    // Send message
    public String sendMessage(String number, String message) {

        if (message.length() > 250) {
            return "Message too long";
        }

        if (checkNumber(number) == false) {
            return "Invalid phone number";
        }

        count = count + 1;

        return "Message sent successfully";
    }

    // total messages
    public int totalMessages() {
        return count;
    }

    public void storeMessage(String message) {
        System.out.println("Message stored");
    }

    public void showMessages() {
        System.out.println("Showing messages");
    }
}