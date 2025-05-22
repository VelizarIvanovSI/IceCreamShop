package decorations;

import icecream.IceCream;

public class ChocolateSprinkles extends IceCreamDecoration{

    public ChocolateSprinkles(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Шоколадови пръчици";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.25;
    }
}
