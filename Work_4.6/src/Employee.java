public class Employee {
    private String name;
    private String email = "Не задан";
    private int phoneNmbr;


    public Employee (String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Employee (String name, int phoneNmbr) {
        this.name = name;
        this.phoneNmbr = phoneNmbr;
    }
    public Employee (String name, String email, int phoneNmbr) {
        this.name = name;
        this.email = email;
        this.phoneNmbr = phoneNmbr;
    }

    public void printInfo () {
        System.out.println ("Имя: " + name + "\n" + "E-mail: " + email + "\n" + "Телефон " + ((phoneNmbr>0) ? phoneNmbr : "не указан"));

    }
}
