package controller.comparatorController;

import java.util.Comparator;

public abstract class GeneralComparator<T> implements Comparator<T> {
    // Attribute
    private final boolean isASC;

    // Constructor
    public GeneralComparator(boolean isASC) {
        super();
        this.isASC = isASC;
    }

    // Getter and Setter
    public boolean isASC() {
        return isASC;
    }

    // Method to convert String to Double
    public double convertToDouble(String input) {
        input = input.replace(",", "");
        if (input.charAt(0) == '-' && input.length() != 2) {
            return 0 - Double.parseDouble(input.substring(1, input.length() - 1));
        }
        if (input.charAt(0) == '+' && input.length() != 2) {
            return Double.parseDouble(input.substring(1, input.length() - 1));
        }
        if(!Character.isDigit(input.charAt(0))){
            return 0;
        }

        int index = 0;
        while (index < input.length()
                && (Character.isDigit(input.charAt(index)) || (input.charAt(index) == '.' ))) {
            index++;
        }

        // Sử dụng substring để lấy phần số từ chuỗi
        String numericString = input.substring(0, index);

        // Chuyển chuỗi thành kiểu double
        double result = Double.parseDouble(numericString);
        if (input.charAt(index) == 'K'){
            result = result * 1000;
        }

        if (input.charAt(index) == 'M'){
            result = result * 1000000;
        }
        return result;
    }
}
