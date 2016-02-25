/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.view;

/**
 *
 * @author Sylvia
 */
public class CollectingFoodWaterView {
   
    private final String menu = "\n"
          + "\nB - Look for Berries"
          + "\nH - Seek for Honey"
          + "\nE - Find some Wheat"
          + "\nW - Search for Water"
          + "\nU - Look for Unknown plants"
          + "\nQ - Quit";
          
          public CollectingFoodWaterView(){
         
      }
          
       public void  displayMenu(){   
           
           char selection = ' ';
           
           do{
              System.out.println(menu);
              
//             String input = getInput();
 //            selection = input.charAt(0);
             
             doAction(selection);
             
           } while(selection != 'Q');
}
       public void doAction(char selection){
           
           switch(selection){
               case 'B':
                  lookBerries();
                   break;
               case 'H':
                   seekHoney(); 
                    break;
                case 'E':
                    findWheat();
                    break;
                case 'W':
                    searchWater();
                    break;
                case 'U':
                    lookUnknownPlants();
                    break;
                case 'Q':
                    break;
                default:
                    System.out.println("Invalid option");
                    break; 
           }
    }

    private void lookBerries() {
        System.out.println ("Look for Berries");
    }

    private void seekHoney() {
       System.out.println ("Seek for Honey");
    } 

    private void findWheat() {
        System.out.println ("Find some Wheat");
    }

    private void searchWater() {
        System.out.println ("Search for Water");
    }

    private void lookUnknownPlants() {
        System.out.println ("Look for Unknown Plants");
    }
       
}
