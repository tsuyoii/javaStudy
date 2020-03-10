package com.example.one.java01.IOStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//文件加密
public class FileLock {
    public static void main(String[] args){
        File fin = new File("d:/xyz/lol.txt");
        File fout = new File(fin.getParent(),"lol2.txt");
        encodingFile(fin,fout);
    }
    public static void encodingFile(File encodingFile, File encodedFile){
        try(FileReader fr = new FileReader(encodingFile); FileWriter fw = new FileWriter(encodedFile)){
            char[] cs = new char[(int)encodingFile.length()];
            fr.read(cs);
            for(int i=0;i<cs.length;i++){
                if(Character.isLetter(cs[i])||Character.isDigit(cs[i])) {
                    if (cs[i] == '9') {
                        cs[i] = '0';
                        continue;
                    }
                    if (cs[i] == 'z') {
                        cs[i] = 'a';
                        continue;
                    }
                    if (cs[i] == 'Z') {
                        cs[i] = 'A';
                        continue;
                    }
                    cs[i] += 1;
                }
            }
            fw.write(cs);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
