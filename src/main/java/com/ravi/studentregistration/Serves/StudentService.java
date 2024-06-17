package com.ravi.studentregistration.Serves;

import com.ravi.studentregistration.entity.Student;
import com.ravi.studentregistration.studentrepository.StudentRepository;

public class StudentService {
    public static void main(String[] args) {


    private StudentRepository studentRepository;

    public StudentService() {
        this.studentRepository = new StudentRepository();
    }

    public Student saveStudent(Student student) {
        Student saveStudent = studentRepository.saveStudent(student);
        System.out.println("Student saved: " + saveStudent);
        return saveStudent;
    }

    public Student getStudentById(int id) {
        Student student = this.studentRepository.getStudent(id);
        if(student == null){
            throw new RuntimeException("Student not found");
        }
        return student;
    }
    public void deleteStudent(String studentId) {
        Student student = studentRepository.getStudentById(studentId);
        if (student == null) {
            throw new RuntimeException("Student with ID " + studentId + " not found");
        }

        studentRepository.deleteStudent(id);
        System.out.println("Student deleted: " + id);
    }

    public List<Student> getAllStudents() {
        List<Student> allStudents = studentRepository.getAllStudents();
        return allStudents;
    }
}

}
