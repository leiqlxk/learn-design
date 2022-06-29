package com.lql.behavior.state;

/**
 * Title: Context <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:52 <br>
 */
public class Context {

    public final static Lift OPENING_SATE = new Opening();
    public final static Lift CLOSING_SATE = new Closing();
    public final static Lift STOPPING_SATE = new Stopping();
    public final static Lift running_SATE = new Running();

    private Lift currentState;

    public void setCurrentState(Lift currentState) {
        this.currentState = currentState;
        currentState.setContext(this);
    }

    public Lift getCurrentState() {
        return currentState;
    }

    public void open() {
        this.currentState.open();
    }

    public void close() {
        this.currentState.close();
    }

    public void stop() {
        this.currentState.stop();
    }

    public void run() {
        this.currentState.run();
    }
}
