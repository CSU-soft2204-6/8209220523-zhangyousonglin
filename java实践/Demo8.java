package java实践;

import static java.lang.Math.abs;

//汉诺塔
public class Demo8 {
    public static void main(String[] args) {
    T t=new T();
    t.move(5,'a','b','c');
    t.queen(1);
        System.out.println(t);
    }
}
class T{
    //num是数量下面理解是从a借助b到c
    public void move(int num,char a,char b,char c){
        if(num==1){
            System.out.println(a+"->"+c);
        }else {
            move(num-1,a,c,b);
            System.out.println(a+"->"+c);
            move(num-1,b,c,a);
        }
    }
    //八皇后
    public void queen(int index){
        int count=0;
        boolean [] hashtable=new boolean[10];
        int [] P = new int[10];
        if(index==9){
            count++;
            return;
        }
        for(int x=1;x<=8;x++){
               if(!hashtable[x]){
                   boolean flag=true;
                   for(int pre=1;pre<index;pre++){
                       if(abs(index-pre)==abs(x-P[pre])){
                           flag = false;
                           break;
                       }
                   }if(flag){
                       P[index]=x;
                       hashtable[x]=true;
                       queen(index+1);
                       hashtable[x]=false;
                   }
            }
        }
    }
}


