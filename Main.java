public class Main {

    public String method(){
        System.out.println("Bye");
        return "Hii";
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        Main m1 = new Main();
        m1.method();
        String n = m1.method();
        System.out.println(n);
    }
}
