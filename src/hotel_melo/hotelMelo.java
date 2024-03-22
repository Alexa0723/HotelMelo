
package hotel_melo;
import java.util.*;


public class hotelMelo {
    public static void main(String[] args) {
        
            Random random = new Random();
            System.out.println("Facturación por alimentos 24 de marzo de 2024 , Hotel Melo");
            System.out.println("----------------------------------");
    
            
            //Creamos los empleados
            Recepcionist recepcionist = new Recepcionist();
            Chef chef= new Chef("Frances");
            
            //Creamos un cliente tipo guest
            Guest guest1= new Guest("Pepe");
            Inventory inventoryGuest1 = new Inventory(guest1,0) ;
            
            //Creamos un cliente soccerPlayer
            SoccerPlayer soccerPlayer=new SoccerPlayer("Messi1"
                    + "");
            Inventory inventorySoccerPlayer = new Inventory(soccerPlayer,0);
            
            
            int n= random.nextInt(3);
            if (n == 0){
                System.out.println("Hellow SoccerPlayer");
                soccerPlayer.orderFood(chef,inventorySoccerPlayer,recepcionist);
                recepcionist.generateFoodBill(inventorySoccerPlayer);
            }
            else{
                System.out.println("Hello guest");
                guest1.orderFood(chef,inventoryGuest1,recepcionist);
                recepcionist.generateFoodBill(inventoryGuest1);
            }
            
    }
}
