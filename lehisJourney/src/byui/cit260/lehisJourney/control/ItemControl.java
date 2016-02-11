/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.control;

/**
 *
 * @author Melissa Case
 */
public class ItemControl {
 
     public double calcBasketVolume(double height, double width, double length){
         
        if (height < 8 || height > 36) { // height is incorrect
          return -1;
     }
        if (width < 12 || width > 24){
         return -1;
     }
        if (length < 12 || length > 36){
          return -1;
         
     }
        double plates = 6912;
        double volume = (length * width * height);
        double platesFit = (plates / volume);
        
        if (platesFit <=4.5){        
        }
            return platesFit;
    
}
    public double calcLabansChallenge(double height, double diameter){
    
    if (height < 36 || height > 48){
    return -1;
}
    if (diameter < 24 || diameter > 30){
    return -1;
}
    double r = diameter / 2;
    double volume = (Math.PI * r * r * height);
    
    if (volume == 25861.59){
    }
        return volume;
}
  
}
