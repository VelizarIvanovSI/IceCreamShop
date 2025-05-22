import decorations.ChocolateSprinkles;
import decorations.ChocolateGlaze;
import factory.IceCreamFactory;
import factory.IceCreamType;
import icecream.IceCream;
import shop.IceCreamShop;

public class Main {
    public static void main(String[] args) {

        IceCreamShop shop = IceCreamShop.getInstance();

        IceCream iceCream = IceCreamFactory.createIceCream(IceCreamType.VANILLA);
        iceCream = new ChocolateGlaze(iceCream);
        iceCream = new ChocolateSprinkles(iceCream);

        IceCream iceCream1 = IceCreamFactory.createIceCream(IceCreamType.STRAWBERRY);
        iceCream1 = new ChocolateGlaze(iceCream1);

        IceCream iceCream2 = IceCreamFactory.createIceCream(IceCreamType.VANILLA);
        iceCream2 = new ChocolateGlaze(iceCream2);


        shop.serve(iceCream.getDescription(), iceCream.getPrice());
        shop.serve(iceCream1.getDescription(), iceCream1.getPrice());
        shop.serve(iceCream2.getDescription(), iceCream2.getPrice());
    }
}
