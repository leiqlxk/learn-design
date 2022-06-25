package com.lql.creator.singleton.demo8;

import java.io.IOException;
import java.io.InputStream;

/**
 * Title: RuntimeTest <br>
 * ProjectName: learn-design <br>
 * description: runtime单例类测试 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 20:31 <br>
 */
public class RuntimeTest {

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        Process ipconfg = runtime.exec("ipconfig");

        InputStream inputStream = ipconfg.getInputStream();

        byte[] bytes = new byte[1024 * 1024* 100];
        int length = inputStream.read(bytes);

        System.out.println(new String(bytes, 0, length,"GBK"));
    }
}
