package com.lql.creator.prototype.demo2;

import java.io.Serializable;

/**
 * Title: Student <br>
 * ProjectName: learn-design <br>
 * description: 学生类 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 17:44 <br>
 */
public class Student implements Serializable {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
