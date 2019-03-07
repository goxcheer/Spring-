package abst;

public class Test1 {
    public static void main(String[] args) {
        DefaultFactory factory = new DefaultFactory();
        System.out.println(factory.getPhone());

        System.out.println(factory.getPhone("xiaomi"));
    }
}
