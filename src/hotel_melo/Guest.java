package hotel_melo;
import java.util.Scanner;


public class Guest extends Person implements Users{

    public Guest(String name) {
        super(name);
    }
    
    
    public void orderFood(Chef chef, Inventory bill,Recepcionist recepcionist){
        
        double sobreCargo = Recepcionist.calcularSobrecargo(chef);
        Recepcionist.printOpcions(getName());
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
            
        while(opcion != 0 ){
            opcion = scanner.nextInt();
            
            if (opcion == 1){
            Recepcionist.elegirComida(opcion,bill);
            }
        
            if (opcion == 2){
            Recepcionist.elegirComida(opcion,bill);
            }
        
            if (opcion == 3){
            Recepcionist.elegirComida(opcion,bill);
            }
        }
        
       
       bill.setBillNo(bill.getBillNo()+bill.getBillNo()*sobreCargo);
       System.out.println("la cuenta parcial es: " + bill.getBillNo());
    }
    
    @Override
    public double getDiscount(){
        return 0;
    }
    
}
