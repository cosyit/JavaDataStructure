package com.cosyit.lesson01;

/**
 *  作为一门研究 数据结构的课程，我们不优先使用JDK自带的数据结构。
 *  所以我们自己创建一个数据结构。
 */
public class MyArray {

    private long [] arr; //存储空间。

    private int elements; //有效数据长度。


    public MyArray(){
        arr = new long[50];

    }

    public MyArray(int maxSize){
        arr = new long[maxSize];
    }


    /**
     * 添加数据。
     */
    public void insert(long value){
        //有效数据长度开始为0，当添加了一次数据，有效数据递增一次。
        arr[elements] = value;
        elements++;
    }


    /**
     * 显示所有数据
     */
    public void display(){
        System.out.print("[ ");

        for(int i = 0;i<elements;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("]");
    }


    /**
     * 查找数据
     * 根据值来进行查找，返回该值所在的索引。
     */
    public int search(long value){
        //把这个i 声明到外面，后面出了for循环还要用。
        int i ;

        for( i =0;i<elements;i++){
            if(value == arr[i]){
                break;
            }
        }

        if(i == elements){
            return -1;
        }else {
            return  i;
        }
    }

}
