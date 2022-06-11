// BulkShoppe.java - constants and method to format cents as dollars and cents 
public class BulkShoppe {
    public final static double TAX_RATE = 6.5;
    // 6.5%
    public final static String STORE_NAME = "Bulk Shoppe";
     public final static int MAX_ITEM_NAME_SIZE = 30;
    public final static int COST_WIDTH = 6;

    public static String centsToDollarsAndCents(int cents) {
        String s = "";
        if (cents < 0) {
            s += "-";
            cents *= -1;
        }

        int dollars = cents / 100;
        cents = cents % 100;

        if (dollars > 0) {
            s += dollars;
            s += ".";
        }

        if (cents < 10) {
            s += "0";

        }
        s += cents;

        return s;
    }
}