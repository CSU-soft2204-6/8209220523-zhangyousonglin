package java实践;

public class Demo6 {
    public static void main(String[] args) {
        int [][]array=new int[10][];
        for(int i=0;i<array.length;i++){
            array[i]=new int [i+1];
            for(int j=0;j<array[i].length;j++){
                array[i][j]=j+1;
            }
        }for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }//铺垫
        int level=10;
        int [][]a=new int [level][];
        for (int i = 0; i < a.length; i++) {
            a[i]=new int [i+1];
        }
        for (int i = 0; i < a.length; i++) {
            a[i][0]=1;
            a[i][i]=1;
        }
        for (int i = 2; i <a.length; i++) {
            for (int j = 1; j <a[i-1].length; j++) {
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();//杨辉三角
        }
    }
}
