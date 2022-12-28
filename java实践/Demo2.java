public class Demo2 {
    public static void main(String[] args) {
        int totalLevel=10   ;
        for (int i = 1; i <= totalLevel; i++) {
            for(int j=1;j<=totalLevel-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if(j==1||j==2*i-1) {
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=totalLevel-1;i>=0;i--){
           for(int j=0;j<=totalLevel-1-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i-1; j++) {
                if(j==0||j==2*i-2){
                System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
