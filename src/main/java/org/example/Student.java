package org.example;

public class Student {

    public Student(String number, String name) {
        this.number = number;
        this.name = name;
    }

    private String number;
    private String name;

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
