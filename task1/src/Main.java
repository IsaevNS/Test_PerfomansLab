
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину интервалов");
        int n = sc.nextInt();
        System.out.println("Введите количество интервалов");
        int m = sc.nextInt();
        sc.close();

        int[] nums = new int[n];
        for (int i=0; i<n;i++){
            nums[i] = i+1;
        }
        int current = 0;
        System.out.print(nums[current]);
        current = (current + m-1) % n;
        while (nums[current]!=nums[0]) {
            System.out.print(nums[current]);
            current = (current + m-1) % n;
        }

    }
}
