package helloworld;

public class Main {


    public static void main(String[] args) {

        Main obj = new Main();
        String str = obj.getString();
        System.out.println(str);
    }

    public String getString() {

        return "Hello World!";

    }
}
