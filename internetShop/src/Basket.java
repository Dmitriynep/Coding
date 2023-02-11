public class Basket {

    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private static int count = 0;

    private static int timeout;

    static {
        int secondsInHour = 3600;
        int hoursInDay = 24;
        int daysInWeek = 7;
        int daysInMonth = 30;
        timeout = secondsInHour * hoursInDay *
                (Period.type = PeriodType.WEEK ? daysInWeek : daysInMonth); //Class Period and enum PeriodType не заданы
    }

    public Basket() {
        increaseCount(1);
        limit = 1000000;
        items = "\n" + "Список товаров:" + "\n";
    }

    public Basket(int totalPriceLimit) {
        this();
        limit = totalPriceLimit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);

    }

    public void add (int count, String name){

    }



    public void add(String name, int price, int count) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + count * price >= limit) {
            return;
        }
        items = items + "\n" + name + " - " + count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
