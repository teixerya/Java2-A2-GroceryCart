/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ryanteixeira
 */
public class DryFruit extends Item {

    double weight;
    double priceLb;

    public DryFruit(){
        this.weight = 0;
        this.priceLb = 0;
    }


    DryFruit(String name, double weight, double priceLb){
        super(name);
        this.setWeight(weight);
        this.setPriceLb(priceLb);

    }


//    DryFruit(String cashew, double d, int i) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

    //________________________________

    public void setWeight(double weight){
        this.weight=weight;

    }

    public void setPriceLb(double priceLb){
        this.priceLb=priceLb;
    }

    public double getWeight(double weight){
        return weight;
    }

    public double getPriceLb(double priceLb){
        return priceLb;
    }
    //________________________________

    @Override
    public int getCost() {


        double cost = this.weight * this.priceLb;
        String.format("%.2f", cost);
        return (int) cost;

//        double cost =Math.round((weight*priceLb)*100)/100;
//        return (int)cost;
    }


}

