import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

import static model.constants.Colour.green;
import static model.constants.Colour.red;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100.0);
        Apple redApple = new Apple(10, 50.0, red);
        Apple greenApple = new Apple(8, 60.0, green);


        Food[] products = {meat, redApple, greenApple};


        ShoppingCart cart = new ShoppingCart(products);


        System.out.println("Общая сумма товаров без скидки: " + cart.getShoppingCartAmountNoDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + cart.getShoppingCartAmountDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getShoppingCartAmountVegetarian() + " руб.");
    }
}