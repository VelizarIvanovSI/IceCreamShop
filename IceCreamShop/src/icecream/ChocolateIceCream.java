package icecream;

public class ChocolateIceCream implements IceCream {

    @Override
    public String getDescription() {
        return "Шоколадов сладолед";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }
}
