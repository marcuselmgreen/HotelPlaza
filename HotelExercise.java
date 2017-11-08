import java.util.*;
import java.io.*;
import java.io.BufferedWriter.*;
import java.io.File.*;
import java.io.FileWriter.*;

public class HotelExercise {
   public static void main(String[] args) throws Exception{
      menu();     
   }
   
   public static void menu () throws Exception{
         Director ed = new Director();
         Accountant marie = new Accountant();
         Receptionist mike = new Receptionist();
         Maintenance daniel = new Maintenance();
         int room = 1;
         Scanner console = new Scanner(System.in);
         System.out.println("Hotel booking options:");
         System.out.println("----------------------");
         System.out.println("I: To view our selection of bedrooms");
         System.out.println("C: To create new guest account");
         System.out.println("S: To get information about the workers");
         System.out.println("E: To exit");
         System.out.println("----------");
         String answer = console.next();
         
            if (answer.equalsIgnoreCase("E")) {
            }
            else if (answer.equalsIgnoreCase("S")){
               System.out.println("------------------------------");
               System.out.println("Information about the workers:");
               System.out.println("------------------------------");
               System.out.println();
               Thread.sleep(1000);
               System.out.println("Director Ed:");
               System.out.println("Recieves " + ed.getvacation() + " weeks of vacation");
               System.out.println("Earns " + ed.getsalary() + " dollars a year");
               System.out.println("Works " + ed.gethours() + " hours a week");
               System.out.println();
               Thread.sleep(1000);
               System.out.println("Accountant Marie:");
               System.out.println("Recieves " + marie.getvacation() + " weeks of vacation");
               System.out.println("Earns " + marie.getsalary() + " dollars a year");
               System.out.println("Works " + marie.gethours() + " hours a week");
               System.out.println();
               Thread.sleep(1000);
               System.out.println("Receptionist Mike:");
               System.out.println("Recieves " + mike.getvacation() + " weeks of vacation");
               System.out.println("Earns " + mike.getsalary() + " dollars a year");
               System.out.println("Works " + mike.gethours() + " hours a week");
               System.out.println();
               Thread.sleep(1000);
               System.out.println("Maintenance Daniel:");
               System.out.println("Recieves " + daniel.getvacation() + " weeks of vacation");
               System.out.println("Earns " + daniel.getsalary() + " dollars a year");
               System.out.println("Works " + daniel.gethours() + " hours a week");
               System.out.println();
               Thread.sleep(1000);
               menu();
            }
            else if (answer.equalsIgnoreCase("C")){
               System.out.print("Do you want to become a new guest? type Y for yes or N for no: ");
               answer = console.next();
               if (answer.equalsIgnoreCase("Y")) {
                  System.out.println("Please enter your information:");
                  File file = new File("guestInformation.dat");
                  if (!file.exists()) {
                     file.createNewFile();
                  }
                  FileWriter output = new FileWriter(file.getAbsoluteFile(), true);
                  BufferedWriter bw = new BufferedWriter(output);
                  Scanner scan = new Scanner(System.in);
                  Scanner check = new Scanner(new File("guestInformation.dat"));
                  int id = Guests.getGuestID();
                  System.out.println("Full name: ");
                  String name = scan.nextLine();
                  System.out.println("Address: ");
                  String address = scan.nextLine();
                  System.out.println("Tlf number: ");
                  int tlf = scan.nextInt();
                     while (check.hasNextLine()){
                     int number = check.nextInt();
                     String text = check.nextLine();
                        if (number == id) {
                           id++;
                        }
                  }
                  if (id < 9) {
                  System.out.println("You have guestID# " + id);
                  bw.write(id + " Name: " + name + " Address: " + address + ", Tlf: " + tlf + "\n");
                  bw.close();
                  System.out.println();
                  menu();
                  }
                  else if (id > 8){
                  System.out.println("Too many guests!");
                  System.out.println();
                  menu();
                  }
                  }
               else {
               System.out.println();
               menu();
               }
            }
            else {
            while (answer.equalsIgnoreCase("I") || Integer.parseInt(answer) > 0 && Integer.parseInt(answer) < 7){
               System.out.println("Type M to return to the menu");
               System.out.println("----------------------------");
               System.out.println("*We currently have 6 rooms avaliable*");
               System.out.println("Type a number between 1 - 6 to get some info about the rooms: ");
               answer = console.next();
                  if(answer.equalsIgnoreCase("M")){
                     menu();
                     break;
                  }
                  else {
                     room = Integer.parseInt(answer);
                     hotelRoom r1 = new hotelRoom(room);
                     if (room < 7 && room > 0) {
                        System.out.println("-----------------------------------");
                        System.out.println(r1);
                        System.out.println(ed.getsalary());
                        System.out.println("-----------------------------------");
                        System.out.println();
                     }
                     else {
                     System.out.println("This room doesn't exist");
                     System.out.println();
                     menu();
                     }
                  }
            }
            }
   }
}
