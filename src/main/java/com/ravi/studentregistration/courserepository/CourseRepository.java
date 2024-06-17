package com.ravi.studentregistration.courserepository;

import com.ravi.studentregistration.course.StudentCourse;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {

    private static List<StudentCourse> courses = new ArrayList<>();

    public StudentCourse saveCourse(StudentCourse course) {
        courses.add(course);
        return course;
    }

    public StudentCourse getCourseById(int id) {
        StudentCourse cours = courses.get(id);
        return cours;
    }

    public StudentCourse updateCourse(StudentCourse course) {
        for (StudentCourse c : courses) {
            if (c.getCourseId() == course.getCourseId()) {
                if (course.getCourseName() != null) {
                    c.setCourseName(course.getCourseName());
                }
                if (course.getDescription() != null) {
                    c.setDescription(course.getDescription());
                }
                if (course.getDuration() != null) {
                    c.setDuration(course.getDuration());
                }
                if (course.getInstructor() != null) {
                    c.setInstructor(course.getInstructor());
                }
                if (course.getStartDate() != null) {
                    c.setStartDate(course.getStartDate());
                }
                if (course.getEndDate() != null) {
                    c.setEndDate(course.getEndDate());
                }
                if (course.getStatus() != null) {
                    c.setStatus(course.getStatus());
                }
                return c;
            }

        }
        throw null;
    }


    public StudentCourse deleteCourse(int id) {
        StudentCourse course = courses.get(id);
        courses.remove(course);
        return course;
    }
    public List<StudentCourse> getAllCourses() {
        return courses;
    }
}
