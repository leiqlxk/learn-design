package com.lql.creator.prototype.demo2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 17:47 <br>
 */
public class Client {

    public static void main(String[] args) throws Exception {
        // 浅拷贝测试
        Student student = new Student("张三");
        Citation citation = new Citation();
        citation.setStudent(student);
        citation.show();

        System.out.println("=======");
        Citation clone = citation.clone();
        clone.getStudent().setName("李四");
        // 此时两者都为李四
        citation.show();
        clone.show();

        System.out.println("===================");
        // 深拷贝
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("D:/test.txt")));
        objectOutputStream.writeObject(citation);
        ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get("D:/test.txt")));
        Citation citaion1 = (Citation) objectInputStream.readObject();
        citaion1.getStudent().setName("王五");

        citation.show();
        citaion1.show();
    }
}
