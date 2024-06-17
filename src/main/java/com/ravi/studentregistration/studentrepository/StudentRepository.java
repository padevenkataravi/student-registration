package com.ravi.studentregistration.studentrepository;

import com.ravi.studentregistration.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository {
   private static List<Student> students = new ArrayList<>();


   public Student saveStudent(Student student) {
      students.add(student);
      return student;
   }

   public Student getStudent(int id) {
      Student res = students.get(id);
      return res;
   }

   public List<Student> getStudents() {
      return students;
   }

   public Student updateStudent(Student student) {
      for(Student s : students){
         if (s.getStudentId() == student.getStudentId()) {
           if(student.getEmail() != null){
              s.setEmail(student.getEmail());
           }
           if(student.getFirstName() != null){
              s.setFirstName(student.getFirstName());
           }
           if(student.getLastName() != null){
              s.setLastName(student.getLastName());
           }
           if(student.getAddress() != null){
              s.setAddress(student.getAddress());
           }
           if(student.getPhoneNumber() != null){
              s.setPhoneNumber(student.getPhoneNumber());
           }
           if(student.getStatus() != null){
              s.setStatus(student.getStatus());
           }
           if(student.getDateOfbirth() != null){
              s.setDateOfbirth(student.getDateOfbirth());
           }
           if (student.getEnrollmentDate() != null){
              s.setEnrollmentDate(student.getEnrollmentDate());
           }

                      return s;
         }
      }
      throw null;
   }

   public Student deleteStudent(int id) {
      Student student = students.remove(id);
      return student;
   }
}
