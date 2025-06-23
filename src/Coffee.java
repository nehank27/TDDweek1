public class Coffee extends Beverage{

    public static final int COFFEE_PRICE = 300;
    public static final int COFFEE_SUGAR = 100;

    public Coffee(double sugar){
        super(sugar);
    }
    public Coffee(){
        super(COFFEE_SUGAR);
    }

    public int getPrice() {
        return COFFEE_PRICE;
    }
}
