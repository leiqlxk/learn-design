package com.lql.behavior.iterator;

/**
 * Title: Client <br>
 * ProjectName: learn-design <br>
 * description: TODO <br>
 *
 * @author: leiql <br>
 * @version: 1.0 <br>
 * @since: 2022/6/29 21:49 <br>
 */
public class Client {

    public static void main(String[] args) {
        StudentContainer studentContainer = new StudentContainer();
        Student student = new Student("张三", "001");
        Student student1 = new Student("李四", "002");
        Student student2 = new Student("王五", "003");
        Student student3 = new Student("赵六", "004");

        studentContainer.add(student);
        studentContainer.add(student1);
        studentContainer.add(student2);
        studentContainer.add(student3);

        Iterator iterator = studentContainer.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
