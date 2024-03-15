import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers in the list.");
        int n = scanner.nextInt();

        List<Integer> candles = new ArrayList<>();
        for(int i = 0; i < n; i++){
            System.out.print(i + 1 + " ");
            candles.add(scanner.nextInt());
        }

        System.out.println(getMax(candles));

    }

    public static int getMax(List<Integer> candles){
        int max = 0;

        for(int h:candles){
            if(h > max){
                max = h;
            }
        }

        int count = 0;
        for(int h: candles){
            if(h == max){
                count++;
            }
        }
        return count;
    }
}
