package com.lql.behavior.state;

/**
 * Title: Lift <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:51 <br>
 */
public abstract class Lift {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public void open() {
        throw new UnsupportedOperationException("不支持的操作");
    }

    public void close() {
        throw new UnsupportedOperationException("不支持的操作");
    }

    public void stop() {
        throw new UnsupportedOperationException("不支持的操作");
    }

    public void run() {
        throw new UnsupportedOperationException("不支持的操作");
    }
}
