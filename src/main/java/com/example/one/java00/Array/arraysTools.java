package com.example.one.java00.Array;

import java.util.Arrays;

//Arrsys工具类的使用
public class arraysTools {
    public static void main(String[] args){
        int[] arr = new int[]{18,3,5,92,33,21,5};
        int[] brr = new int[]{18,3,5,92,33,21,5};
        int[] crr = new int[]{18,3,5,92,33,21,4};
        int[] drr = new int[]{};
        arraysTools tool = new arraysTools();
        drr = tool.ArraysCopyOfRange(arr, 2, 7);
        tool.ArraystoString(drr);
        tool.Arrayssort(brr);
        tool.ArraysbinarySearch(arr,5);
        tool.Arraysequals(arr, brr);
        tool.Arraysfill(drr,7);



        //作业，二维数组复制到一维数组中并排序
        arrays2Dsort zuoye = new arrays2Dsort();
        zuoye.sort2D(zuoye.randomFill());
    }
    //数组复制，System.arraycopy(src,srcPos,dest,destPos,length)需要知道多个参数，
    //Arrays.copyOfRange(src,from,to)只需要知道原数组，以及起始位置
    public int[] ArraysCopyOfRange(int[] src,int from,int to){
//        int[] res = new int[to-from-1];
        int[] res = Arrays.copyOfRange(src,from,to);
        System.out.println("复制后的数组："+Arrays.toString(res));
        return res;
    }

    //字符串转换，将数组转换为字符串，便于一次性展示，不需要for循环遍历
    public void ArraystoString(int[] src){
        String content = Arrays.toString(src);
        System.out.println("转换字符串toString后："+content);
    }
    //排序sort
    public int[] Arrayssort(int[] src){
        Arrays.sort(src);
        System.out.println("sort排序后的数组："+Arrays.toString(src));
        return src;
    }
    //搜索binarySearch
    public void ArraysbinarySearch(int[] src,int item){
        System.out.println("binarySearch查找到的数据"+item+"出现位置"+Arrays.binarySearch(src, item));
    }
    //判断是否相同equals
    public boolean Arraysequals(int[] src1,int[] src2){
        boolean res = Arrays.equals(src1,src2);
        System.out.println("经equals判断"+Arrays.toString(src1)+"  "+Arrays.toString(src2)+"这两个数组中的数据是否相同:"+res);
        return res;
    }
    //填充fill,填充同一个数据在数组中
    public int[] Arraysfill(int[] src,int item){
        Arrays.fill(src,item);
        System.out.println("待填充的数据:"+item+"填充后的数组："+Arrays.toString(src));
        return src;
    }
}

class arrays2Dsort{
    //随机数填充数组
    public int[][] randomFill(){
        int[][] frr = new int[5][8];
        System.out.println("二维数组");
        for(int i=0;i<frr.length;i++){
            for(int j=0;j<frr[i].length;j++){
                frr[i][j] = (int)(Math.random()*100);
                System.out.print(frr[i][j]+"  ");
            }
            System.out.println();
        }
        return frr;
    }
    public void sort2D(int[][] src){
//        int[] temp = new int[40];
        int[] temp = new int[src.length*src[0].length];
        for(int i=0;i<src.length;i++){
            //System.arraycopy(src[i],0,temp,i*8,8);
            System.arraycopy(src[i],0,temp,i*src[0].length,src[0].length);
//            这是错误的int[] temp = Arrays.copyOfRange(src,src[i][0],src[i].length);
        }
        arraysTools tool = new arraysTools();
        tool.Arrayssort(temp);
    }
}
