# 820220523-zhangyousonlin
java实践为主，c++报告随便
时间允许会有数据结构专题或操作系统的源码
=======================
Java实践介绍
1.	demo1为空心三角//要学会化死为活
2.	demo2为空心菱形//理解多重循环嵌套的含义（还有break等标签）
3.	demo3为数组增扩//这是专注于与用户scanner的交互，以及值引用与数组引用，还有do-while的使用，但第二次敲不知道和那个线程冲突了
4.	demo4为数组的缩减//着重强调异常处理，再加上增强循环的使用
5.	demo5为查找主要是equals比较和index的使用技巧
6.	demo6是杨辉三角的打印主要是状态转移方程然后明明写出来了却不敢运行还在分析😂最后还是可以用if-else优化
7.	demo7是向升序数组插入数据if-else if else用的细碎一直报错//开始只有双if//改进后的j用的很妙提示思维不要窄了
8.	demo8是递归专题我一个都没写出来＞﹏＜其分别是汉诺塔与8皇后问题，通过其我了解了return的重要性，并且学会归纳n-1，对于新手是封装细节，其中8皇后问题的c版本已上传有我思考的案例和最简化的版本，要想到数组下标与循环数结合用一维数组代替二维数组，同时flag的使用也很精妙
9.	demo9是异常处理考虑包的使用同时接受null是新知识点且还是return的使用
10.	demo10是剪子石头布问题，结合上述几乎所有，最典型的是-1与2的判断条件与PAT的不同，且那个面向对象思想与c的面向过程的不同确实纠结
11.	extend1是继承主要是复用
12.	person1是多态结合数组（最近在弄计算机网络确实没花时间）
13.	person2是JBK源码的查询记住快捷键同时了解双等于与字符串的等于不同也提供了重写
14.	零钱通项目分为面向过程与面向对象这是程序化思维要分析所需的变量，其中采用switch以前我不屑一顾的循环以及demo3的循环与用户的交互真的很重要，此外还联系到时间的打印，面向对象思想真的重要
15.	房屋出租系统是目前最麻烦的，它把除继承与多态以外的都考虑了主要是其分层模式要掌握具体过程看下一个文档
16.	Static_是比较麻烦的在于区分静态代码块和普通代码块，记忆普通代码块是随着对象的产生而被调用，而静态代码块是类被加载就有且只执行一次且有继承，顺序静态代码块大于普通代码块大于构造器

17.新增的是hashset源码分析耗时极长里面有详细注解
18.补充的chapter14文件夹是collection专题首先分为单列与双列根据collection与map分通过list vector arraylist 到set linkedset hashset 后是map treeset hashmap hashtable 通过debug追源码了解数组+链表+红黑树 （红黑树可以通过算法4的视频）在17中已经写了大概麻烦在于遍历entryset真的向下转型麻烦死了老是Exception in thread "main" java.util.ConcurrentModificationException 和castExcption 报错后面泛型就可以优化了
