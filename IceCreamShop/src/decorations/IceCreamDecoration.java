package decorations;

import icecream.IceCream;

public abstract class IceCreamDecoration implements IceCream {

    protected IceCream iceCream;

    public IceCreamDecoration(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice();
    }
}
