package icecream;

public class StrawberryIceCream implements IceCream {

    @Override
    public String getDescription() {
        return "Ягодов сладолед";
    }

    @Override
    public double getPrice() {
        return 2.10;
    }
}
