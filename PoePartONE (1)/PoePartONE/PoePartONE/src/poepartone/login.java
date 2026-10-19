/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepartone;

/**
 *
 * @author Student
 */
public class login extends registration {

     public boolean loginUser(String name, String password) { 
        if (name.equals(this.userName) &&
            password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }

    public String returnLoginStatus(boolean loginStatus) {
        if (loginStatus) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }
}
