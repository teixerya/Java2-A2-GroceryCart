/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author
 */
public class Checkout extends java.lang.Object {

    private ArrayList<Item> checklist;
    private double TAX_RATE= BulkShoppe.TAX_RATE;

    public Checkout(){
        checklist= new ArrayList<Item>();
    }


    public ArrayList<Item> getChecklist() {
        return checklist;
    }


    /**
     * Item is added to the end of the list of items.
     *
     */
    public void enterItem(Item item){

        this.checklist.add(item);

    }

    public void printList(){
        for(Item item: checklist){
            System.out.println(item);
        }
    }
    //_______________________________________________
    /**
     * Clears the Checkout to begin checking out a new set of items
     */
    public void clear(){
        this.checklist.clear();
    }

    //_______________________________________________
    /**
     * Returns the number of Item's in the list
     */
    public int numberOfItems(){
        int checklistSize2 = this.checklist.size();
        return checklistSize2;
    }

    //_______________________________________________
    /**
     * Returns total cost of items in cents (without tax)
     */
    public int totalCost(){

        int cartSum = 0;

        for (Item item: checklist)
            cartSum= cartSum + item.getCost();
        return cartSum;
    }

    //_______________________________________________
    /**
     * Returns total tax on items in cents
     */
    public int totalTax(){
        int tax = (int)(totalCost() * (TAX_RATE/100)) ;
        return tax;
    }
    //_______________________________________________
    /**
     * Returns a String representing a receipt for the current list of
     * Item's with the name of the store, the items purchased, the tax,
     * and the total cost, for example,
     */
    public String toString(){

        String s2= "";

        for(Item item: checklist){
            s2 +=  item.getName() + "\n";
        }

        return s2;

    }


    //_______________________________________________
//    clone(){
//
//    }
//
//    equals(){
//
//    }
//
//    getClass(){
//
//    }





}
