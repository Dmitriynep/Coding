public class Printer {
    String queue = "";
    int countPrntdPages = 0;
    int pagesInQueue = 0;

    public void append (String text) {
        append(text,"Документ без имени",1);

    }
    public void append (String text, String name) {
        append(text,name,1);

    }
    public void append (String text, int countPages) {
        append(text,"Документ без имени",countPages);

    }
    public void append (String text, String name, int countPages) {
        queue = queue + "\n" + name + " - " + text;
        pagesInQueue = pagesInQueue + countPages;

    }

    public void clear () {
        queue = "";
        pagesInQueue = 0;
    }

    public void print () {
        System.out.println(queue);
//        System.out.println("Количетсво страниц в очереди: " + pagesInQueue);
        countPrntdPages = countPrntdPages + pagesInQueue;

        clear();
    }
    public int getPendingPagesCount () {
        return pagesInQueue;

    }
    public int printedPagesAllTime () {
        return countPrntdPages;

    }
}
