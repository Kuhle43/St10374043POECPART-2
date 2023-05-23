/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainprogram;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class Report {
  String Task_name;
  String Task_Descript; 
  String full_Name; 
  String stat; 
  String  Task_ID;
  String  print;
  
 long start;
 long end;
 
 
 int num;
 int count;
 int task_number;
 int task_duration;
 int Status;
 int total_hours;
 int menu;
 
 string name [] = new String[999];   
 string Descript[]= new String[999];
 string DName[] = new String[999];
 string ID[]=new String[999];
 string status[] =new String[999];
 
int number[= new int[999];
int duration[]= new int[999];

pulic void menus(){
    JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");
     String menuChoice = JOptionPane.showInputDialog("Menu:\n 1.Add Task\n 2.Show Report\n 3.Quit");
     
     if (menuChoice=null){
      System.exit(0);
      
      
     }
try{
    menu=Integer.parseInt(menuChoice);
    switch  (menu){
        case 1:
            String numbTask=JOptionPane.showInputDialog("How many tasks do you want enter?");
            num=Integer.parseInt(numTasks);
            
            start = System.currentTimeMillis();
            for(int i=0; i<num;i++){
           TaskDetails();
           name[i]=Task_name;
           Descript[i]=Task_Descript;
            DName[i]=full_Name;
            number[i]=task_number;
            duration[i]=task_duration;
            ID[i]=TaskID();
            
                   
            




