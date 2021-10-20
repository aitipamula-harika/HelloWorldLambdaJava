package book;

public class HelloWorld {
    public String handler(String name) {
        String name = System.getenv("name");
        return "Hi," + name;
    }
}
