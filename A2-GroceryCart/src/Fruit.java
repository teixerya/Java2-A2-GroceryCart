

/**
 * Derived class from the Item class
 * A Fruit item has a number and a price per dozen
 * which are used to determine its cost.
 * e.g. new Fruit("Banana", 4, 399));
 *
 * @author
 */
public class Fruit extends Item {

    private int number = 0;
    private int price = 0;

    // no-arg constructor
    public Fruit(){};

    //initializing Fuit data
    public Fruit(String name, int number, int price){
        super(name);
        this.number = number;
        this.price = price;

    }

    //setter/getter

    // @return number of Fruit
    public int getNumber() {
        return number;
    }

    // @set number of Fruit
    public void setNumber(int number) {
        this.number = number;
    }

    // @return price of DryFruit
    public int getPrice() {
        return price;
    }

    // @set price of DryFruit
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        String cents = BulkShoppe.centsToDollarsAndCents(this.getPrice());
        return String.format("%d @ %s /dz.%n", this.getNumber(), cents);
    }
    @Override
    public int getCost(){
        return (int)Math.round(this.getNumber()*((double)this.getPrice()/12));
    }
}//end of class

