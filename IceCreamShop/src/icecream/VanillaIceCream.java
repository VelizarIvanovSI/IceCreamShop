package icecream;

public class VanillaIceCream implements IceCream {

    @Override
    public String getDescription() {
        return "Ванилов Сладолед";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }
}
