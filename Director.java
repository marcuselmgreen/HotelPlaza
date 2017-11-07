public class Director extends Staff {

   public Director() {
      super();
   }
   
   public int getsalary(){
      return 350000 + super.getsalary();
   }
   
   public int gethours() {
      return 15 + super.gethours();
   }

}