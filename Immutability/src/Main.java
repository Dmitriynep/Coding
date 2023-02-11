public class Main {
    public static void main(String[] args) {

        Book aliceInWonderLand = new Book("aliceInWonderLand","Lewis Carroll",550,"978-5-699-12014-7");
        System.out.println("Книга: " + aliceInWonderLand.getName() + " Автор: " + aliceInWonderLand.getAuthor() + " кол-во страниц: " + aliceInWonderLand.getNmbrPages() + " isbn книги: " + aliceInWonderLand.getIsbn());



/*
        Product notebookSony = new Product("Sony VAIO SV-D1121P2R/B","a213424b");
        notebookSony.setPrice(550);

        System.out.println("Название: " + notebookSony.getName() + " Цена - " + notebookSony.getPrice()+ " у.е." + " barcode товара: " + notebookSony.getBarCode());

*/

    }
}