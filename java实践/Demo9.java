package java实践;

public class Demo9 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double []array={};
        Double res= a01.max(array);
        if(res!=null){
        System.out.println(a01.max(array));
        }else System.out.println("数据不合理");

        System.out.println("========================");

        A02 a02 = new A02();
        String []  str={"apple","bear","peach"};
        String find = "app";
        Integer index = a02.findStr(find,str);
        if(index!=null)
            System.out.println(index);
        else System.out.println("字符串数组为空");
    }
}
class A01{
    public Double max(double[]array) {
        if(array.length>0){
        double max=array[0];
            for (double v : array) {
                if (max < v) {
                    max = v;
                }
            }
            return max;
        }else return null;
    }
}

class A02{
    public Integer findStr(String find,String[]str) {
        if(str.length>0){
            for (int i = 0; i < str.length; i++) {
                if(find.equals(str[i])){
                    return i;
                }
            }return -1;
        }return null;
    }
}

