package hotel_melo;
import java.util.*; 

public class Recepcionist{
    String name;
    
    
    static void calculateFoodBill(Inventory bill, FoodItem elementoAleatorio) {
        bill.setBillNo(bill.getBillNo() + elementoAleatorio.getPrice());
    }
    
    public void generateFoodBill(Inventory bill){
        double total = bill.getBillNo()*(1-bill.getGuest().getDiscount());
        System.out.println("---------------------------------------------------------");
        System.out.println("Tiene un descuento del: "+ bill.getGuest().getDiscount());
        System.out.println("Total facturacion comida: " + total + " pesos");
    }
    
    static void printOpcions(String name){
        System.out.println("-----------------------------");
        System.out.println("Hola " + name + " Seleccione la comida que quiere llevar: ");
        System.out.println("Opcion0. Facturar comida");
        System.out.println("Opcion1. Desayuno");
        System.out.println("Opcion2.Almuerzo");
        System.out.println("Opcion3.Comida");
        System.out.println("---------------------------");
    }
    
    static double calcularSobrecargo(Chef chef){
        if (chef.getLocation().equalsIgnoreCase("Frances")){
            System.out.println("hay sobrecargo por el chef del 15%");
            return 0.15;
        }else{
            return 0;
        }
    }
    
    static void elegirComida(int opcion,Inventory bill){
        ArrayList<FoodItem> Menu = new ArrayList<>();
        Random random = new Random();
        
        FoodItem e1 = new FoodItem(100,"arroz con huevo","Desayuno");
        FoodItem e2 = new FoodItem(150,"huevo napolitano","Desayuno");
        FoodItem e3 = new FoodItem(200,"Panqueque","Desayuno");
        
        FoodItem e4 = new FoodItem(100,"bandeja paisa","Almuerzo");
        FoodItem e5 = new FoodItem(150,"Arroz con pollo","Almuerzo");
        FoodItem e6 = new FoodItem(200,"Sancocho","Almuerzo");
        
        FoodItem e7 = new FoodItem(100,"bandeja paisa","Comida");
        FoodItem e8 = new FoodItem(150,"Arroz con pollo","Comida");
        FoodItem e9 = new FoodItem(200,"Sancocho","Comida");
        
        Menu.add(e1);
        Menu.add(e2);
        Menu.add(e3);
        Menu.add(e4);
        Menu.add(e5);
        Menu.add(e6);
        Menu.add(e7);
        Menu.add(e8);
        Menu.add(e9);
        



        int indiceAleatorio = random.nextInt(Menu.size());
        FoodItem elementoAleatorio;
        
        switch (opcion){
            case 1:
                
                int indiceAleatorio1 = random.nextInt(3);
                elementoAleatorio = Menu.get(indiceAleatorio);
                calculateFoodBill(bill,elementoAleatorio);
                System.out.println("Se ha agregado: " + elementoAleatorio.getName()+ " a la cuenta, y su precion es: " + elementoAleatorio.getPrice());
                
                break;
                
            case 2:
                
                int indiceAleatorio2 = random.nextInt(3)+3;
                elementoAleatorio = Menu.get(indiceAleatorio);
                calculateFoodBill(bill,elementoAleatorio);
                System.out.println("Se ha agregado: " + elementoAleatorio.getName()+ " a la cuenta, y su precion es: " + elementoAleatorio.getPrice());
                break;
                
            case 3:
                
                int indiceAleatorio3 = random.nextInt(6)+3;
                elementoAleatorio = Menu.get(indiceAleatorio);
                calculateFoodBill(bill,elementoAleatorio);
                System.out.println("Se ha agregado: " + elementoAleatorio.getName()+ " a la cuenta, y su precion es: " + elementoAleatorio.getPrice());
                break;
                
        }
    }
}
