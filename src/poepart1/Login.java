/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart1;

/**
 *
 * @author Student
 */
public class Login {
    
    String storedUsername;
    String storedPassword;

    // Check username
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Check password
    public boolean checkPasswordComplexity(String password) {

        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {      
            char c = password.charAt(i);       

            if (Character.isUpperCase(c)) {
                hasCapital = true;
            }

            if (Character.isDigit(c)) {    
                hasNumber = true;        
            }

            if (!Character.isLetterOrDigit(c)) { // ✅ FIXED
                hasSpecial = true;
            }
        }

        return password.length() >= 8 && hasCapital && hasNumber && hasSpecial; // ✅ FIXED
    }

    // Check phone number
    public boolean checkCellPhoneNumber(String number) {
        return number.startsWith("+27") && number.length() == 12;
    }

    // Register user
    public String registerUser(String username, String password, String number) {

        if (checkUserName(username) == false) {
            return "Username is wrong.";
        }

        if (checkPasswordComplexity(password) == false) {
            return "Password is wrong.";
        }

        if (checkCellPhoneNumber(number) == false) {
            return "Cell number is wrong.";
        }

        storedUsername = username;
        storedPassword = password;

        return "User registered successfully.";
    }

    // Login check
    public boolean loginUser(String username, String password) {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }

    // Login message
    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
            return "Login successful.";
        } else {
            return "Login failed.";
        }
    }
}
    

