public class Guests {
   // Fields
   static int guestID;
   private String firstName;
   private String lastName;
   private String address;
   private int telephone;
   
   public String toString() {
      System.out.println();
      return ("Guest# " + guestID);
   }
   // Constructor
   public Guests(String first, String last, String add, int tlf) {
      this.firstName = first;
      this.lastName = last;
      this.address = add;
      this.telephone = tlf;
   }
   // Getter
   public static int getGuestID() {
      guestID++;
      return guestID;
   }
}