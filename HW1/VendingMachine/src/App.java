import Products.product;
import Products.BottleOfWater;
import Products.HotDrink;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        product item1 = new product("Cola", 88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new product("Чипсы", 60.0));
        itemMachin.addProduct(new product("Масло", 50.0));
        itemMachin.addProduct(new product("Хлеб", 40.0));
        itemMachin.addProduct(new product("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500));
        itemMachin.addProduct(new HotDrink("Hot chokolate", 78.6, 200, 90));
        itemMachin.addProduct(new HotDrink("Coffee", 99.50, 200, 85));
        itemMachin.addProduct(new HotDrink("Coffee", 62.0, 100, 85));
        itemMachin.addProduct(new HotDrink("Cappuchino", 88.0, 200, 90));

        for (product prod : itemMachin.getProdAll()) {
            System.out.println(prod.toString());
        }

    }
}