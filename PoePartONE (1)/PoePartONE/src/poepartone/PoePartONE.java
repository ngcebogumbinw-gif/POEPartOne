/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepartone;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PoePartONE {

    /**
     * @param args the command line arguments
     */
    
 public static void main(String[] args) {
        // TODO code application logic here
         registration register = new registration();
        Scanner scan = new Scanner(System.in);

        System.out.println("\n===== Register =====");

        System.out.println("Please enter the username: ");
        String name = scan.nextLine();

        System.out.println("Enter password");
        String password = scan.nextLine();

        System.out.println("Enter cellphone");
        String cellphone = scan.nextLine();

        System.out.println(register.registerUser(name, password, cellphone));
    }
}