public class Staff {
   String title;
   String name;
   int telephone;
   int salary;
   int vacation;
   int hours;
  
   // Constructor
   public Staff() {//String name, String title, int tlf, int salary) {
      //this.name = name;
      //this.title = title;
      //this.telephone = tlf;
      //this.salary = salary;
      //this.vacation = vac;
      //this.hours = hours;
   }
   
   public int getvacation(){
      return 5;
   }
   
   public int getsalary(){
      return 250000;
   }
   
   public int gethours(){
      return 37;
   }
   
   public String toString() {
      System.out.println();
      return ("Salary: " + salary);
   }
}