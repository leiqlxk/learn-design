package com.lql.creator.singleton.demo8;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Title: SerializerDemo <br>
 * ProjectName: learn-design <br>
 * description: 除了枚举以外，别的单例模式可以使用序列化来破坏 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 20:16 <br>
 */
public class SerializerDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        writeObject();

        StaticInnerClassSingleton singleton = readObject();
        StaticInnerClassSingleton singleton1 = readObject();

        System.out.println(singleton == singleton1);

    }

    private static StaticInnerClassSingleton readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("d:/test.txt")));

        StaticInnerClassSingleton o = (StaticInnerClassSingleton) in.readObject();
        return o;
    }

    private static void writeObject() throws IOException {
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

        ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get("d:/test.txt")));
        out.writeObject(instance);
    }
}
