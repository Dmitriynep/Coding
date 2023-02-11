public class Basket {

    private static String items = "";

    public static void main(String[] args) {




    }

    public static void add(String name, int price) {
        items = items + "\n" + name + " - " + price;

    }

    public static void clear () {
        items = "";
    }

    public static void print (String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        }
        else {
            System.out.println(items);
        }
    }
    add(name: "Колбаса", price: 76);
    add(name: "Молоко", price: 55);

}
