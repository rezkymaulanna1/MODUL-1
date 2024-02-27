/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Modul1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          boolean runProgram = false;
        
        while(!runProgram){
     Scanner input = new Scanner(System.in);
        
    System.out.println("===== Library System =====");
    System.out.println("1. Login as Student");
    System.out.println("2. Login as Admin");
    System.out.println("3. Exit");
    
    System.out.print("Choose Your Option(1-3): ");
    String userRole = input.next();
    
    switch(userRole){
        case "1" : 
            System.out.print("Enter Your NIM : ");
            String nim = input.next();
            
            if(nim.length()== 15){
                System.out.println("Successful Login as Student");
            }else{
                System.out.println("User Not Found");
            }
            break;
        case "2" : 
            System.out.print("Enter your username (admin): ");
            String username = input.next();
            System.out.print("Enter your password (admin): ");
            String password = input.next();   
            
            if (username.equals("admin") && password.equals("admin")){
                System.out.println("Successful Login as Admin");
            }else{
                System.out.println("Admin User Not Found !!");
            }
            break;
        case "3" : 
            System.out.println("adios");
            System.exit(0);
        default : 
    }
        }
    }
    
}
