package com.example.one.java01.IOStream;

import java.io.*;

//复制文件
public class CopyFile {
    public static void main(String[] args){

    }
    //复制文件
    public static void copyFile(String srcFile,String destFile){
        File src = new File(srcFile);
        File dest = new File(destFile);
        try(FileReader fr = new FileReader(src);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(dest);
            PrintWriter pw = new PrintWriter(fw)){
            String line = null;
            while((line=br.readLine())!=null){
                pw.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //复制文件夹
    public static void copyFolder(String srcFolder,String destFolder){
         File src = new File(srcFolder);
         File dest = new File(destFolder);
         if(!dest.exists())dest.mkdirs();
         if(src.isDirectory()){
             File[] fs = src.listFiles();
             for(File f:fs){
                 String destPath = destFolder+"/"+f.getName();
                 if(f.isDirectory())
                     copyFolder(f.getPath(), destPath);
                 if(f.isFile())
                     copyFile(f.getPath(), destPath);
             }
         }
    }
}
