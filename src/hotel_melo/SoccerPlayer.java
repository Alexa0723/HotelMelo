/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_melo;

/**
 *
 * @author ivane
 */
public class SoccerPlayer extends Guest {
    String position;

    public SoccerPlayer(String name) {
        super(name);
    }
    
    
    @Override
    public double getDiscount(){
        return 0.2;
    }
}
