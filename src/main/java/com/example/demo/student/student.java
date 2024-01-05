package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
//đánh dấu một class Java là một entity , cho JPA biết đối tượng này tương ứng với một bảng trong cơ sở dữ liệu
@Table
//tạo table trong MySql
public class student
{
    @Id
//    đặt ID làm khóa chinhs trong MySql
    @GeneratedValue(strategy = GenerationType.AUTO)
    // tuwj động tăng giá trị của khóa chính
    @Column(name = "id")
    // tạo cột trong MySql
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    @Transient
    private int age;
    @Column(name = "dob")
    private LocalDate dob;
    @Column(name = "email")
    private String email;

    public student() {
    }

    public student(Long id, String name,  LocalDate dob, String email) {
        this.id = id;
        this.name = name;

        this.dob = dob;
        this.email = email;
    }

    public student(String name, LocalDate dob, String email) {
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
