package com.itheima.pattern.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;

public class RunTimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime =Runtime.getRuntime();
//        参数要的是命令

        Process process=runtime.exec("ipconfig");
        InputStream is=process.getInputStream();
        byte[] arr=new byte[1024*1024*100];
        int len=is.read(arr);
        System.out.println(new String(arr,0,len,"GBK"));
    }
}
