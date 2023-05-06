package com.flaviumircia.backendlab4.user;

import jakarta.persistence.*;

@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator="user_sequence"
    )
    Long id;
    String studentName;
    String laboratoryGroup;
    String hashedPassword;
    String post;

    public User(Long id, String studentName, String laboratoryGroup, String hashedPassword, String post) {
        this.id = id;
        this.studentName = studentName;
        this.laboratoryGroup = laboratoryGroup;
        this.hashedPassword = hashedPassword;
        this.post = post;
    }

    public User(String studentName, String laboratoryGroup, String hashedPassword, String post) {
        this.studentName = studentName;
        this.laboratoryGroup = laboratoryGroup;
        this.hashedPassword = hashedPassword;
        this.post = post;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getLaboratoryGroup() {
        return laboratoryGroup;
    }

    public void setLaboratoryGroup(String laboratoryGroup) {
        this.laboratoryGroup = laboratoryGroup;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", laboratoryGroup='" + laboratoryGroup + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
