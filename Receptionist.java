public class Receptionist extends Staff {
   public Receptionist() {
   
   }
   
   public int getvacation() {
      return 1 + super.getvacation();
   }
   
   public int gethours() {
      return 5 + super.gethours();
   }
}