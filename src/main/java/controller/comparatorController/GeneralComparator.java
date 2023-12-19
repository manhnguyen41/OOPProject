package controller.comparatorController;

import java.util.Comparator;

public abstract class GeneralComparator<T> implements Comparator<T> {
    // Attribute
    private boolean isASC;

    // Constructor
    public GeneralComparator(boolean isASC) {
        super();
        this.isASC = isASC;
    }

    // Getter and Setter
    public boolean isASC() {
        return isASC;
    }

    public void setASC(boolean ASC) {
        isASC = ASC;
    }
}
