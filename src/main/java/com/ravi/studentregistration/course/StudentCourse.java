package com.ravi.studentregistration.course;

import com.ravi.studentregistration.entity.StudentStatus;

public class StudentCourse {

    private int courseId;
    private String courseName;
    private String description;
    private String duration;
    private String instructor;
    private String startDate;
    private String endDate;
    private StudentStatus status;

    public StudentCourse() {}

    public StudentCourse(int courseId, String courseName, String description, String duration, String instructor, String startDate, String endDate, StudentStatus status) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.duration = duration;
        this.instructor = instructor;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", instructor='" + instructor + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status=" + status +
                '}';
    }
}

