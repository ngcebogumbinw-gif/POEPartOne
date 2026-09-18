/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepartone;

/**
 *
 * @author Student
 */
public class registration {//start of class
    
    String userName;
    String password;
    String cellphone;

    public boolean checkUserName(String username) {
        return username.contains("@") && username.length() >= 3;
    }

    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[a-zA-Z0-9].*");
    }

    public boolean checkCellPhoneNumber(String cellphone) {
        return cellphone.matches(".*\\+27[0-9]{9}$")
               || cellphone.matches(".*[0-9]{10}$");
    }

    public String registerUser(String username,
                                String password,
                                String cellphone) {

        if (checkUserName(username) &&
            checkPasswordComplexity(password) &&
            checkCellPhoneNumber(cellphone)) {

            this.userName = username;
            this.password = password;
            this.cellphone = cellphone;

            return "Registration was successful";
        } else {
            return "Registration was unsuccessful";
        }
    }

    public boolean registerStatus(String username, String password, String cellphone) {
        return checkUserName(username) &&
               checkPasswordComplexity(password) &&
               checkCellPhoneNumber(cellphone);
    }
}