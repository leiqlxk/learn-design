package com.lql.behavior.responsibility;

/**
 * Title: GeneralManager <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:44 <br>
 */
public class GeneralManager extends Handler{
    public GeneralManager() {
        super(NUM_THREE);
    }

    @Override
    public void handler(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getDay() + "天，原因：" + leaveRequest.getContent());
        System.out.println("总经理审批通过");
    }
}
