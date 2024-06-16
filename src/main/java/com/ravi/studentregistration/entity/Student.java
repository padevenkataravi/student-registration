package com.ravi.studentregistration.entity;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String dateOfbirth;
    private String email;
    private String phoneNumber;
    private Address address;
    private String enrollmentDate;
  //  private enum status;


    public Student(){}

    public Student(String enrollmentDate, Address address, String phoneNumber, String email, String dateOfbirth, String lastName, String firstName, int studentId) {
        this.enrollmentDate = this.enrollmentDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfbirth = dateOfbirth;
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentId = studentId;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfbirth='" + dateOfbirth + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                '}';
    }
}
