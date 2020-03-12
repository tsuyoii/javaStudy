package com.example.one.java01.IOStream;

//自动创建有一个属性的类文件
//法一
//public class CreatClass {
//    public static void main(String[] args){
//        System.out.println("请输入类的名称");
//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
//        System.out.println("请输入属性的类型");
//        String type = scan.nextLine();
//        System.out.println("请输入属性的名称");
//        String attrname = scan.nextLine();
//        System.out.println("替换后的内容为");
//        File f = new File("D:/one/src/main/java/com/example/one/java01/IOStream/"+name+".java");
//        try(FileWriter fw = new FileWriter(f);
//            PrintWriter pw = new PrintWriter(fw)){
//            pw.println("public class "+name+"{");
//            pw.println("    public "+type+" "+attrname+";");
//            pw.println("    public "+name+"() {");
//            pw.println("    }");
//            pw.println("    public void set"+name+"("+type+" "+attrname+"){");
//            pw.println("    this."+attrname+" = "+attrname+";");
//            pw.println("    }");
//            pw.println("    public "+type+" get"+name+"(){");
//            pw.println("    return this."+attrname+";");
//            pw.println("    }");
//            pw.println("}");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}


import java.io.*;
import java.util.Scanner;

//法二
public class CreatClass {
    public static void main(String[] args){
        System.out.println("请输入类的名称");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("请输入属性的类型");
        String type = scan.nextLine();
        System.out.println("请输入属性的名称");
        String attrname = scan.nextLine();
        //为了设置set和get方法，需要提出类名首字母大写
        char[] chars = attrname.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        String Uattrname = String.valueOf(chars);

        System.out.println("替换后的内容为");
        File template = new File("D:/one/src/main/java/com/example/one/java01/IOStream/template.txt");
        File f = new File("D:/one/src/main/java/com/example/one/java01/IOStream/"+name+".java");
        try(FileReader fr = new FileReader(template);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw)){
            String readline = null;
            while((readline = br.readLine())!=null){
                if(readline.contains("@class@"))
                    readline = readline.replaceAll("@class@", name);
                if(readline.contains("@type@"))
                    readline = readline.replaceAll("@type@", type);
                if(readline.contains("@property@"))
                    readline = readline.replaceAll("@property@", attrname);
                if(readline.contains("@Uproperty@"))
                    readline = readline.replaceAll("@Uproperty@", Uattrname);

                pw.println(readline);
                System.out.println(readline);
            }
            br.read();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("内容保存在："+f.getAbsoluteFile());
        }
    }
}
