package com.lql.structure.bridging;

/**
 * Title: AviFile <br>
 * ProjectName: learn-design <br>
 * description: avi功能实现具体类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 21:39 <br>
 */
public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件："+ fileName);
    }
}
