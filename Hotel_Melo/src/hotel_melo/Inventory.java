package hotel_melo;

public class Inventory {
    public Guest guest;
    private double billNo;
    
    public Inventory(Guest guest,int billNo){
        this.guest = guest;
        this.billNo = billNo;
    }
    
    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public double getBillNo() {
        return billNo;
    }

    public void setBillNo(double billNo) {
        this.billNo = billNo;
    }
    
    
}