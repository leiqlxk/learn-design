package com.lql.behavior.responsibility;

/**
 * Title: Handler <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:32 <br>
 */
public abstract class Handler {
    public final static int NUM_ONE = 1;
    public final static int NUM_TWO = 3;
    public final static int NUM_THREE = 7;

    protected int startNum;
    protected int endNum;

    protected Handler nextHandler;

    public Handler(int startNum) {
        this.startNum = startNum;
    }

    public Handler(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }

    public abstract void handler(LeaveRequest leaveRequest);

    public void submit(LeaveRequest leaveRequest) {
        if(0 == this.startNum){
            System.out.println("请填写请假天数");
            return;
        }

        if (this.startNum <= leaveRequest.getDay()) {
            this.handler(leaveRequest);

            if (this.nextHandler != null && leaveRequest.getDay() > endNum) {
                this.nextHandler.submit(leaveRequest);
            }else {
                System.out.println("结束流程");
            }
        }
    }
}
