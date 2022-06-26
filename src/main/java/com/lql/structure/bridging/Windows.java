package com.lql.structure.bridging;

/**
 * Title: Windows <br>
 * ProjectName: learn-design <br>
 * description: 抽象化实现 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 21:42 <br>
 */
public class Windows extends OperationSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        super.videoFile.decode(fileName);
    }
}
