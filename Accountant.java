public class Accountant extends Staff {

   public Accountant() {
   
   }
   
   public int getsalary() {
      return 200000 + super.getsalary();
   }
   
   public int getvacation() {
      return 1 + super.getvacation();
   }
}