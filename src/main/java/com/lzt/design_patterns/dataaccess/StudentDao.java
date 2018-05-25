package com.lzt.design_patterns.dataaccess;

/**
 * Created by viruser on 05/25.
 */
import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
