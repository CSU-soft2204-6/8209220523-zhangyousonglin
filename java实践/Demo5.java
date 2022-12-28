package java实践;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String []names={"apple","bear","grape","peach"};
        System.out.println("请输入名字");
        String next=myScanner.next();
        int len=names.length;
        int index=-1;
        for(int i=0;i<len;i++){
            if(next.equals(names[i])){
                index = i;
                System.out.println("已找到"+next+" 下标为"+index);
                break;
            }
        }if(index==-1) System.out.println("没找到");
    }
}
