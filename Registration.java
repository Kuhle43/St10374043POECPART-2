/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainprogram;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.regex.Pattern;
 
/**
 *
 * @author lab_services_student
 */
public class Registration {

    private String Name;
    private String last;
    private String First;
    private String Pass;

    private Registration() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 public static void MainProgram getMethod = new MainProgram();
 
 static void RegisterUser(){
   throw new UnsupportedOperationException("Not supported yet".);
 }
 
 
public boolean passwordComplexity(String password){
Pattern number = Pattern.compile("[0-9]");
Pattern upperLetter= Pattern.compile("[A-z]");
Pattern lowerLetter = Pattern.compile("[a-z]");
Pattern character = Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);

if (password.length()>8 && character.matcher(password).find()&& upperLetter.matcher(password).find()&& lowerLetter.matcher(password).find()&& number.matcher(password).find()){
Pass = password;
JOptionPane.showMessageDialog(null,"Password Successfully captured");
JOptionPane.showMessageDialog(null, "Password MEETS complexity requirements");
return true;
}else{
    JOptionPane.showMessageDialog(null,"Password is not correctly formatted.Please make sure that the password contains at last 8 characters");
    return false;
}
}

public Registration(String FirstName,String Surname){
    this.First= FirstName;
    this.last= Surname;
}

public boolean checkUserName(String UserName){
    Pattern underScore = Pattern.compile("[_]");
    if (underScore.matcher(UserName).find ()&& UserName.Length()==5){
   JOptionPane.showMessageDialog(null,"Username is correctly formatted"); 
   Name =UserName;
   return true;
    }else{
        JOptionPane.showMessageDialog(null,"Username is correctly formatted. Please make sure your username contains an underscore");     
    return false;
    }
}
    
public static void RegisterUser(Scanner rc){
    Registration getMethod = new Registration();
    String UserName;
    
    while(true){
        try{
            UserName = JOptionPane.showInputDialog("Enter your username");
            if(getMethod.checkUserName(UserName)){
          String password =JOptionPane.showInputDialog(null, "Enter your password");
            if (getMethod.passwordComplexity(password)){    
          JOptionPane.showMessageDialog(null, "Registration successfull");
          Report read = new Report();
          read.menus();
          break;
            }
        }
    } catch (HeadlessException e){
        Report read = new Report();
        read.menus();
        break;
        
    }
    }
}


public boolean LoginUser(String logUser, String logPassword){
    return false;
 
}
}