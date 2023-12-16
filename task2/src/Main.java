import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc1 = new Scanner(new FileInputStream("file1.txt"));
        float x0 = sc1.nextFloat();
        float y0 = sc1.nextFloat();
        float r = sc1.nextFloat();


        Scanner sc2 = new Scanner(new FileInputStream("file2.txt"));
        while(sc2.hasNextFloat()){
            float x = sc2.nextFloat();
            float y = sc2.nextFloat();
            cringle(x,y,x0,y0,r);
        }

    }
    static void cringle(float x, float y, float x0, float y0, float r){
        if( (x-x0)*(x-x0) + (y-y0)*(y-y0) == r*r){
            System.out.println(0);
        }
        if( (x-x0)*(x-x0) + (y-y0)*(y-y0) < r*r){
            System.out.println(1);
        }
        if( (x-x0)*(x-x0) + (y-y0)*(y-y0) > r*r){
            System.out.println(2);
        }
    }
}