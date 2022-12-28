import com.sun.jdi.PathSearchingVirtualMachine;
public class DEMO1 {
   public static void main(String[]args){
       int totalLevel=10;
       for (int i = 1; i <= totalLevel; i++) {
           for (int j = 1; j <=totalLevel+1-i ; j++) {
               System.out.print(" ");
           }
           for (int k =1 ; k <=2*i-1 ; k++) {
               if(k==1||k==2*i-1){
               System.out.print("*");
               }else System.out.print(" ");
           }
           System.out.println();
       }
       for (int i = 0; i < 2*totalLevel+1; i++) {
           System.out.print("*");
       }
       System.out.println();
   }
}
