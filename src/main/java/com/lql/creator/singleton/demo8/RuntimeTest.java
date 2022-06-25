package com.lql.creator.singleton.demo8;

import org.omg.CORBA.CharSeqHolder;
import sun.awt.CharsetString;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Title: RuntimeTest <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/25 20:31 <br>
 */
public class RuntimeTest {

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        Process ipconfg = runtime.exec("ipconfg");

        InputStream inputStream = ipconfg.getInputStream();

        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);

        System.out.println(new String(bytes, "GBK"));
    }
}
