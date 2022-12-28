import java.util.Arrays;
import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int []a={1,2,3};
        do {
            int len =a.length+1;
            int []array=new int[len];
            for (int i = 0; i < a.length; i++) {
                array[i] = a[i];
            }
            System.out.println("请输入想扩充的整数");
            int next = myScanner.nextInt();
            array[len-1]=next;
            a=array;
            for(int x:array){
                System.out.print(x+" ");
            }
            System.out.println();
            System.out.println("是否继续扩容y/n");
            char key=myScanner.next().charAt(0);
            if(key=='n') break;
        }while(true);
    }
}