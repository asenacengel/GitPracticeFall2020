package Day01;

public class Colors {
    public static void main(String[] args) {

        String a = "interned String";
        String b = new String("interned String").intern();
        String c = b.intern();
        System.out.println(b==c);
        System.out.println(a==c);
        System.out.println(b==a);

    }
}
