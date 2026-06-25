package exceptions;

public class Main {
    static void main(String[] args) {
        try {
            System.out.println("hello world");
            System.exit(2);
        }catch (Exception e){}
        finally {
            System.out.println("Finally");
        }
    }
}
