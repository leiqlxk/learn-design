package com.lql.creator.prototype.demo2;

import java.io.Serializable;

/**
 * Title: Citation <br>
 * ProjectName: learn-design <br>
 * description: 浅拷贝时，学生类只拷贝了引用，即多个多个对象会引用同一个学生对象 <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/26 17:42 <br>
 */
public class Citation implements Cloneable, Serializable {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show() {
        System.out.println(student.getName() + "同学：在2022学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
