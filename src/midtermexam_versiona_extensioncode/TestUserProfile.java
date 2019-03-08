/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class TestUserProfile {
    public static void main(String[] args ) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter name:");
        String UserID = in.nextLine();
       
        System.out.println("Choose your favourite genres from: Comedy, Drama,"
                + "Action, or Mystery");
       String genre = in.nextLine();
       
       UserProfile u1 = new UserProfile(UserID, genre);
       System.out.println("User profile created: " + u1);
    }
}
