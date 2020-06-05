import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(""+getIntenger(20));
    }

    public static int getIntenger(int num) {
        List<Integer> integers = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                integers.add(i);
            }

            if( i %3==0 || i%5==0){
                continue;
            }

            integers.add(i);

        }

        return integers.size();
    }

}