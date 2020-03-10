package com.example.one.java01.IOStream;

import java.io.*;

//移除注释
public class DelZhushi {
    public static void main(String[] args){
        File f = new File("d:/xyz/lol.txt");
        removeComments(f);
    }
    public static void removeComments(File javaFile){
        StringBuffer sb = new StringBuffer();
        try(FileReader fr = new FileReader(javaFile);
            BufferedReader br = new BufferedReader(fr)
            ){
            while(true){
                String line = br.readLine();
                if(line==null){
                    break;
                }
                if(!line.trim().startsWith("//")){
                    sb.append(line).append("\r\n");
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        try(FileWriter fw = new FileWriter(javaFile);
            PrintWriter pw = new PrintWriter(fw)){
            pw.println(sb);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
