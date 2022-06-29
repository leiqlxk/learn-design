package com.lql.behavior.responsibility;

/**
 * Title: LeaveRequest <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 20:30 <br>
 */
public class LeaveRequest {
    private String name;
    private int day;
    private String content;

    public LeaveRequest(String name, int day, String content) {
        this.name = name;
        this.day = day;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
