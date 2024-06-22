package com.example.restapp.data;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

 @Entity
 @Table(name = "register")

public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "pid")

    private int pid;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "contactnumber")
    private int contactnumber;

    @Column(name = "email")
    private String email;

    @Column(name = "chronicdiseases")
    private String chronicdiseases;

    @Column(name = "otherdiseases")
    private String otherdiseases;

    @Lob
    @Column(name = "report", columnDefinition = "LONGBLOB")
    private byte[] report;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "confirmpassword")
    private String confirmpassword;

    public int getId() {
        return pid;
    }

    public void setId(int id) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(int contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChronicdiseases() {
        return chronicdiseases;
    }

    public void setChronicdiseases(String chronicdiseases) {
        this.chronicdiseases = chronicdiseases;
    }

    public String getOtherdiseases() {
        return otherdiseases;
    }

    public void setOtherdiseases(String otherdiseases) {
        this.otherdiseases = otherdiseases;
    }
     public byte[] getReport() {
         return report;
     }

     public void setReport(byte[] report) {
         this.report = report;
     }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
}
