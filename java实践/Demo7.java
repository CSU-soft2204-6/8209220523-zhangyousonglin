package java实践;

public class Demo7 {
    public static void main(String[] args) {
       int []array={10,12,45,90};
       int insertValue=100;
       int len = array.length;
       int []newArray=new int [len+1];
       int index=-1;
        for (int i = 0; i < len; i++) {
            if(insertValue<=array[i]){
                index=i;
                break;
            }
        }if(index==-1) index=len;
        /*
        for (int i = 0; i < len+1; i++) {
            if(i<index) newArray[i]=array[i];
            else if(i==index) newArray[i]=insertValue;
            else newArray[i]=array[i-1];
        }*/
        //update
        for(int i=0,j=0;i<len+1;i++){
            if(i!=index){
                newArray[i]=array[j];
                j++;
            }else newArray[i]=insertValue;
        }
        array=newArray;//垃圾处理机制
        for(int x:newArray){
            System.out.print(x+" ");
        }
    }
}
