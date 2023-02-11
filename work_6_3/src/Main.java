public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("1st Product",33);
        Product product2 = new Product("2nd Product",55);
        Product product3 = new Product("3rd Product",102);

        System.out.println("nmbr of Products: " + Product.getCount());
        System.out.println("Average price of all Products: " + Product.getAveragePrice());

    }
}