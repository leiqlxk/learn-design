package com.lql.behavior.iterator;

import java.util.List;

/**
 * Title: StudentIterator <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:45 <br>
 */
public class StudentIterator implements Iterator{
    private List<Student> students;

    private int positon = 0;

    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return this.positon < this.students.size();
    }

    @Override
    public Student next() {
        return this.students.get(this.positon++);
    }
}
