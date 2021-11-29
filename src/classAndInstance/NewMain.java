package classAndInstance;

/**
 *
 * @author tadaki
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassA a = new ClassA("First");
        ClassA b = new ClassB("Second", 0);
        ClassB c = new ClassB("Third", 1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
