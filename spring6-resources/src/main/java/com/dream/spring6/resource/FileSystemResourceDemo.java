package com.dream.spring6.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystem;

/**
 * @Author : huzejun
 * @Date: 2023/2/23-18:00
 */

//访问系统资源
public class FileSystemResourceDemo {

    public static void main(String[] args) {

//        loadFileResource("E:\\logs\\dream.txt");
        loadFileResource("dream.txt");
    }

    public static void loadFileResource(String path) {
        //创建对象
        FileSystemResource resource = new FileSystemResource(path);

        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());

        try {
            InputStream in = resource.getInputStream();
            byte[] b = new byte[1024];
            while (in.read(b)!=-1){
                System.out.println(new String(b));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
