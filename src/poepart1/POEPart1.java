/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class POEPart1 {

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
    }
}



    
        
    
        
