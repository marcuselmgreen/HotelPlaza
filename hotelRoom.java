public class hotelRoom {
   // Fields
   private int roomID;
   int beds;
   boolean internet;
   int price;
   int floor;
      
   public String toString() {
      System.out.println(bed());
      System.out.println(floor());
      System.out.println("Room has internet access: " + internetAccess());
      System.out.println("Price per night: " + price() + " kr");
      return ("RoomID: " + roomID);
   }
   // Constructor
   public hotelRoom(int room) {
      roomID = room;
   }
   // Accessor
   public String bed() {
      if (roomID == 1 || roomID == 2) {
         return ("Room " + roomID + " has one bed");
      }
      else if (roomID == 3 || roomID == 4) {
         return ("Room " + roomID + " has a double bed");
      }
      else {
         return ("Room " + roomID + " is a suite");
      }
   }
   // Accessor
   public boolean internetAccess() {
      return (roomID == 3 || roomID == 4 || roomID == 5 || roomID == 6);
   }
   // Accessor
   public int price() {
      if (roomID == 1 || roomID == 2) {
         return 350;
      }
      else if (roomID == 3 || roomID == 4) {
         return 500;
      }
      else {
         return 750;
      }
   }
   // Accessor
   public String floor() {
      if (roomID == 1 || roomID == 2) {
         return ("This room is located on the first floor");
      }
      else {
         return ("This room is located on the second floor");
      }
   }

   
}