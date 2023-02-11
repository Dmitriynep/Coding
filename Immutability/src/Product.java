public class Product {

        private final String name;

    public String getBarCode() {
        return barCode;
    }

    private final String barCode;

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;



        public Product(String name, String barCode) {
            this.name = name;
            this.barCode = barCode;

        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }



}
