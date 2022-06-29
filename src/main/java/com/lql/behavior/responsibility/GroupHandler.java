package com.lql.behavior.responsibility;

/**
 * Title: GroupHandler <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:40 <br>
 */
public class GroupHandler extends Handler{
    public GroupHandler() {
        super(NUM_ONE, NUM_TWO);
    }

    @Override
    public void handler(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getDay() + "天，原因：" + leaveRequest.getContent());
        System.out.println("小组长审批通过");
    }
}
