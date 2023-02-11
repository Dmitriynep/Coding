public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.addProducts(54);
        order1.addProducts(600);
        System.out.println(order1.getProductsCount());

        Order order2 = new Order();
        order2.addProducts(100);
        order2.addProducts(150);
        order2.addProducts((5*5));
        System.out.println(order2.getProductsCount());

    }
}