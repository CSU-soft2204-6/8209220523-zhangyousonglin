package java实践;

import java.util.Random;
import java.util.Scanner;

public class Demo10 {
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入次数");
        int times = myScanner.nextInt();
        int [] count = new int[3];
        for(int i=0;i<times;i++) {
            System.out.println("请输入剪刀石头布分别用0 1 2代替：");
            int gamer = myScanner.nextInt();
            Random r = new Random();
            int computer = r.nextInt(3);
            Mora mora = new Mora(gamer,computer,count);
            mora.over();
        }
    }
}
class Mora{
    public int gamer;
    public int computer;

    public int[]count=new int [100];

    public Mora(int gamer,int computer,int[]count) {
        this.gamer = gamer;
        this.computer = computer;
        this.count = count;
    }

    Scanner myScanner = new Scanner(System.in);

    //gamer，computer分别表示玩家和电脑输出以0，1，2分别代表剪刀石头布
    //count数组分别记录输赢平

    public void over(){
        int sub = gamer - computer;
        if(gamer==computer){
            count[2]++;
            System.out.print("平手"+"\t"+"  ");
            System.out.println("玩家获胜次数："+count[1]+"\t"+"电脑获胜次数："+count[0]);
            return;
        }
        if(sub==-1||sub==2){
            count[1]++;
            System.out.print("玩家胜"+"\t");
        }else {
            count[0]++;
            System.out.print("电脑胜"+"\t");
        }
        System.out.println("玩家获胜次数："+count[1]+"\t"+"电脑获胜次数："+count[0]);
      }
    }