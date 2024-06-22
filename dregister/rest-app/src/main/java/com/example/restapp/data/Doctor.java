package com.example.restapp.data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "docregister")

public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")

    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "age")
    private int age;

    @Column(name = "contact_number")
    private int contact_number;

    @Column(name = "email")
    private String email;

    @Column(name = "name_hospital")
    private String name_hospital;

    @Column(name = "experience")
    private String experience;

    @Lob
    @Column(name = "doc_pass" , columnDefinition = "LONGBLOB")
    private byte[] doc_pass;

    @Lob
    @Column(name = "dig_certificate" , columnDefinition = "LONGBLOB")
    private byte[] dig_certificate;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "confirm_password")
    private String confirm_passowrd;

    public byte[] getDoc_pass() {
        return doc_pass;
    }

    public void setDoc_pass(byte[] doc_pass) {
        this.doc_pass = doc_pass;
    }

    public byte[] getDig_certificate() {
        return dig_certificate;
    }

    public void setDig_certificate(byte[] dig_certificate) {
        this.dig_certificate = dig_certificate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContact_number() {
        return contact_number;
    }

    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName_hospital() {
        return name_hospital;
    }

    public void setName_hospital(String name_hospital) {
        this.name_hospital = name_hospital;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
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

    public String getConfirm_passowrd() {
        return confirm_passowrd;
    }

    public void setConfirm_passowrd(String confirm_passowrd) {
        this.confirm_passowrd = confirm_passowrd;
    }
}
