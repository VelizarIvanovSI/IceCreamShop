package decorations;

import icecream.IceCream;

public class ChocolateGlaze extends IceCreamDecoration{

    public ChocolateGlaze(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +  "Шоколадова глазура";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.50;
    }
}
