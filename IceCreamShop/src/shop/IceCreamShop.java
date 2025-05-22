package shop;

public class IceCreamShop {

    private static IceCreamShop instance;

    private IceCreamShop() {
        System.out.println("Магазинът е отворен!");
    }

    public static IceCreamShop getInstance() {
        if (instance == null) {
            instance = new IceCreamShop();
        }
        return instance;
    }

    public void serve(String description, double price) {
        System.out.println("Сервираме: " + description);
        System.out.println("Цена: " + price + " лв.");
    }
}
