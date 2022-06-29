package com.lql.behavior.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Title: StudentContainer <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:47 <br>
 */
public class StudentContainer {

    private List<Student> students;

    public StudentContainer() {
        students = new ArrayList<>();
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public void remove(Student student) {
        this.students.remove(student);
    }

    public Iterator iterator() {
        return new StudentIterator(this.students);
    }
}
