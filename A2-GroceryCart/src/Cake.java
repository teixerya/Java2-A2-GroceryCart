

/**
 * Derived class from the Item class
 * A Cake item has a cost.
 * e.g. new Cake("Choc. Chip Cake",999);
 *
 * @author
 */
public class Cake extends Item {

    private int price = 0;

    // no-arg constructor
    public Cake(){};

    //initializing Fuit data
    public Cake(String name, int price){
        super(name);
        this.price = price;
    }

    //setter/getter

    // @return price of Cake
    public int getPrice() {
        return price;
    }

    // @set cost of Cake
    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public int getCost(){

        return this.getPrice();

    }

    @Override
    public String toString(){
        return "";
    }

} //end of class

