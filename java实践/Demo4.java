package java实践;
import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args) {
        int []a={1,3,54,7};
        Scanner myScanner =new Scanner(System.in);
        System.out.println("输出原数组");
        for(int x:a){
            System.out.print(x+" ");
        }
        do{ int len=a.length;
            int []array=new int[len-1];
            for(int i=0;i<len-1;i++){
                array[i]=a[i];
            }a=array;
            System.out.println("是否继续缩减y/n");
            char key=myScanner.next().charAt(0);
            if(key=='n')break;
            if(array.length==0) {
                System.out.println("数组为空");
                break;
            }
           for(int x:array) {
               System.out.print(x+" ");
           }
        }while(true);
    }
}
