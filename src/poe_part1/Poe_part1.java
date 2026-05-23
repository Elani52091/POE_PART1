/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe_part1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Poe_part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

        Scanner input = new Scanner(System.in);
        Login login = new Login(); 

        System.out.println("REGISTER");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter phone (+27): ");
        String phone = input.nextLine();

        String registerResult = login.registerUser(username, password, phone);
        System.out.println(registerResult); 
        
        System.out.println("\nLOGIN");
        
        System.out.print("Enter user name: ");
        String loginUsername = input.nextLine();
        
        System.out.print("Enter password: ");
        String loginPassword = input.nextLine();
        
        String loginResult = login.returnLoginStatus(loginUsername, loginPassword);
        System.out.println(loginResult); 
        
        if (login.loginUser(loginUsername, loginPassword));
        
        Message msg = new Message();
        
        int option = 0;
        
        while (option != 3) {
            
            System.out.println("Welcome to QuickChat");
            System.out.println("1. Send Message");
            System.out.println("2. Show Message");
            System.out.println("3. Quit");
            
            System.out.println("Choose option: ");
            option = input.nextInt();
            input.nextLine();
            
        if (option == 1) {
            System.out.println("Enter recipient (+27): ");
            String number = input.nextLine();
            
            System.out.println("Enter message: ");
            String message = input.nextLine();
            
            System.out.println("1. Send");
            System.out.println("2. Store");
            System.out.println("3. Discard");
            
            int choice = input.nextInt();
            input.nextLine();
            
            if (choice == 1) {
                System.out.println(msg.sendMessage(number,message ));
                
            }else if (choice == 2 ) {
                msg.storeMessage(message);
                System.out.println("Message stored");
                
            } else {
                System.out.println("Message discared");
            }
        
        } else if (option == 2) {
            
            msg.showMessages();
            
        } else if (option == 3) {
            
            System.out.println("Goodbye");
            
        } else {
            
            System.out.println("Invalid option");
        }        
        }
                    
        }
}

        
        


