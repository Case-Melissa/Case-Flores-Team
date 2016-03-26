

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lehisJourney.model;

/**
 *
 * @author Melissa Case
 */
public class InventoryItem {

    String description;
    int quantityInStock;
    int requiredAmount;
    
    
    public static InventoryItem[] createItemList() {
        //Create and array of inventory items
        InventoryItem[] inventory
                = new InventoryItem[14];

        InventoryItem oil = new InventoryItem();
        oil.setDescription("Oil");
        oil.setQuantityInStock(0);
        oil.setRequiredAmount(2);
        inventory[0] = oil;

        InventoryItem flour = new InventoryItem();
        flour.setDescription("Flour");
        flour.setQuantityInStock(0);
        flour.setRequiredAmount(2);
        inventory[1] = flour;

        InventoryItem clothes = new InventoryItem();
        clothes.setDescription("Clothes");
        clothes.setQuantityInStock(0);
        clothes.setRequiredAmount(8);
        inventory[2] = clothes;

        InventoryItem tents = new InventoryItem();
        tents.setDescription("Tents");
        tents.setQuantityInStock(0);
        tents.setRequiredAmount(2);
        inventory[3] = tents;

        InventoryItem stakes = new InventoryItem();
        stakes.setDescription("Stakes");
        stakes.setQuantityInStock(0);
        stakes.setRequiredAmount(8);
        inventory[4] = stakes;

        InventoryItem berries = new InventoryItem();
        berries.setDescription("Berries");
        berries.setQuantityInStock(0);
        berries.setRequiredAmount(16);
        inventory[5] = berries;

        InventoryItem honey = new InventoryItem();
        honey.setDescription("honey");
        honey.setQuantityInStock(0);
        honey.setRequiredAmount(2);
        inventory[6] = honey;

        InventoryItem wheat = new InventoryItem();
        wheat.setDescription("Wheat");
        wheat.setQuantityInStock(0);
        wheat.setRequiredAmount(5);
        inventory[7] = wheat;

        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(16);
        inventory[8] = water;

        InventoryItem unknown_plants = new InventoryItem();
        unknown_plants.setDescription("Unknown Plants");
        unknown_plants.setQuantityInStock(0);
        unknown_plants.setRequiredAmount(5);
        inventory[9] = unknown_plants;

        InventoryItem goat_skin = new InventoryItem();
        goat_skin.setDescription("Goat Skin");
        goat_skin.setQuantityInStock(0);
        goat_skin.setRequiredAmount(1);
        inventory[10] = goat_skin;

        InventoryItem camel_skin = new InventoryItem();
        camel_skin.setDescription("Camel Skin");
        camel_skin.setQuantityInStock(0);
        camel_skin.setRequiredAmount(1);
        inventory[11] = camel_skin;

        InventoryItem goat_hair = new InventoryItem();
        goat_hair.setDescription("Goat Hair");
        goat_hair.setQuantityInStock(0);
        goat_hair.setRequiredAmount(1);
        inventory[12] = goat_hair;

        InventoryItem camel_hair = new InventoryItem();
        camel_hair.setDescription("Camel Hair");
        camel_hair.setQuantityInStock(0);
        camel_hair.setRequiredAmount(1);
        inventory[13] = camel_hair;

        return inventory;
    }

    private void setDescription(String oil) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        description = oil;
    }

    private void setQuantityInStock(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        quantityInStock = i;
    }

    private void setRequiredAmount(int i) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        requiredAmount = i;
    }
    public String getDescription(){
     
        return description;
    }
    public int getRequiredAmount(){
    
        return requiredAmount;
    }
    public int getQuantityPrintInStock(){
    
        return quantityInStock;
    }
}

