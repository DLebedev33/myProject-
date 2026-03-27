import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100.0);
        Apple redApple = new Apple(10, 50.0, Colour.RED);
        Apple greenApple = new Apple(8, 60.0, Colour.GREEN);


        Food[] products = {meat, redApple, greenApple};


        ShoppingCart shoppingCart = new ShoppingCart(products);


        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getShoppingCartAmountNoDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getShoppingCartAmountDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки: " + shoppingCart.getShoppingCartAmountVegetarian() + " руб.");
    }
}