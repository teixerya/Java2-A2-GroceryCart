/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Item.java - Item abstract superclass
/**
 * Abstract superclass for Item hierarchy
 */
public abstract class Item {
    protected String name;
    /**
     * Null constructor for Item class
     */public Item() {
        this("");
    }
    /**
     * Initializes Item data
     */
    public Item(String name) {
        if (name.length() <= BulkShoppe.MAX_ITEM_NAME_SIZE)
            this.name = name;
        else
            this.name = name.substring(0,BulkShoppe.MAX_ITEM_NAME_SIZE); }
    /**
     * Returns name of Item
     * @return name of Item
     */
    public final String getName() {
        return name;
    }
    /**
     * Returns cost of Item
     ////// * @return cost of Item
     */
    public abstract int getCost();

}
