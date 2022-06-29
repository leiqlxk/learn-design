package com.lql.behavior.state;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2021/8/6 14:58 <br>
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(Context.OPENING_SATE);

        context.open();
        context.close();
        context.stop();
        context.run();
    }
}
