package com.lzt.design_patterns.transferobject;

/**
 * Created by viruser on 05/31.
 * StudentVO传输对象
 * StudentBO操作对象
 */
public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        //输出所有的学生
        System.out.println("------------------------------------");
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }

        System.out.println("------------------------------------");
        //更新学生
        StudentVO student =studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        System.out.println("------------------------------------");
        //获取学生
        studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
