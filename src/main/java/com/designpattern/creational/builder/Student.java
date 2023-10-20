package com.designpattern.creational.builder;

import lombok.Getter;

@Getter
public class Student {

    private String firstName;
    private String lastName;
    private int rollNumber;
    private double marks;

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }
    private Student(){

    }
    public static class StudentBuilder{
        private Student student;

        public StudentBuilder(){
            student = new Student();
        }

        public StudentBuilder withFirstName(String firstName){
            student.firstName = firstName;
            return this;
        }
        public StudentBuilder withLastName(String lastName){
            student.lastName = lastName;
            return this;
        }

        public StudentBuilder rollNumber(int rollNumber){
            student.rollNumber = rollNumber;
            return this;
        }

        public StudentBuilder withMarks(double marks){
            student.marks = marks;
            return this;
        }

        public Student build(){
            if (!validate())
                throw new InvalidStudentCreation("Empty first name, last name or Roll number");
            return student;
        }

        private boolean validate(){
            if(student.firstName == null || student.lastName == null)
                return false;
            return student.rollNumber != 0;
        }

    }
}
