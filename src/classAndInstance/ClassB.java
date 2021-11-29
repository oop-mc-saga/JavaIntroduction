package classAndInstance;

/**
 *
 * @author tadaki
 */
public class ClassB extends ClassA {

    final private int n;

    public ClassB(String label, int n) {
        super(label);
        this.n = n;
    }

    public int getN() {
        return n;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + String.valueOf(n);
    }
}
