package ues.ids.za20003;

public class Exercise6 {

    public static int calculateSum(int n) {
        int sum = 0;
        int multiple;
        for (int i = 0; i < n; i++) {
            multiple = i * 5;
            sum += multiple;
        }
        return sum;
    }
}
