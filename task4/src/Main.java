
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileInputStream("file.txt"));
        int l =0;
        // Подсчет длины массива
        while(sc.hasNextInt()){
            sc.nextInt();
            l++;
        }
        sc.close();
        // Запись массива
        Scanner sc1 = new Scanner(new FileInputStream("file.txt"));
        int[] nums = new int[l];
        int sum = 0;
        for (int i =0; i<l; i++){
            int c = sc1.nextInt();
            nums[i]=c;
            sum+=c;
        }
        sc1.close();
        //Поиск медианы и подсчет операций
        int a = sum/l;
        int count = 0;


        for (int i =0; i<l; i++){
            count+=Math.abs(nums[i]-a);
        }
        System.out.println(count);

    }
}