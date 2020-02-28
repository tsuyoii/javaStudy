package com.example.one.java00.Array;
//联系二维数组
public class array2D {
    public static void main(String[] args){
        int[][] arr = new int[5][5];
        int max=arr[0][0];
        int tempi=0;
        int tempj=0;
        System.out.println("数组打印");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = (int)(Math.random()*100);
                System.out.print(arr[i][j]+"  ");
                if(arr[i][j]>max){
                    max= arr[i][j];
                    tempi = i;
                    tempj = j;
                }
            }
            System.out.println();
        }
        System.out.println("最大值："+max+"    最大值对应下标"+tempi+"  "+tempj);
    }
}
