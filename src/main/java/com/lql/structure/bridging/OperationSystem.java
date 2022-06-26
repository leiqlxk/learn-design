package com.lql.structure.bridging;

/**
 * Title: OperationSystem <br>
 * ProjectName: learn-design <br>
 * description: 抽象化接口，桥接模式使抽象和实现相分离，两个维度可以独立发展互不影响 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 21:40 <br>
 */
public abstract class OperationSystem {
    protected VideoFile videoFile;

    public OperationSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
