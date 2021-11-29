package classAndInstance;

/**
 *
 * @author tadaki
 */
public class ClassA {

    final private String label;

    public ClassA(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String toString() {
        return label;
    }
}