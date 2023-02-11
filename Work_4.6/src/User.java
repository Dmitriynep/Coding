public class User {
    String name;
    int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String showName () {
        return name;
    }
    public int showAge () {
        return age;
    }

}
