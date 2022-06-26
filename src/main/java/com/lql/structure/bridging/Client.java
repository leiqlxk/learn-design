package com.lql.structure.bridging;

/**
 * Title: client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 21:44 <br>
 */
public class Client {

    public static void main(String[] args) {
        OperationSystem windows = new Windows(new AVIFile());
        windows.play("test.avi");
    }
}
