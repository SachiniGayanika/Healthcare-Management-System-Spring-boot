package com.example.doctorschedulerapp.data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "doctor_schedule_tbl")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patient_id;

    @Column(name = "doctor_name")
    private String doctor_name;

    @Column(name = "meeting_date")
    private Date meeting_date;

    @Column(name = "meeting_time")
    private Time meeting_time;

    @Column(name = "purpose_of_meeting")
    private String purpose_of_meeting;

    @Column(name = "meeting_link")
    private String meeting_link;

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public Date getMeeting_date() {
        return meeting_date;
    }

    public void setMeeting_date(Date meeting_date) {
        this.meeting_date = meeting_date;
    }

    public Time getMeeting_time() {
        return meeting_time;
    }

    public void setMeeting_time(Time meeting_time) {
        this.meeting_time = meeting_time;
    }

    public String getPurpose_of_meeting() {
        return purpose_of_meeting;
    }

    public void setPurpose_of_meeting(String purpose_of_meeting) {
        this.purpose_of_meeting = purpose_of_meeting;
    }

    public String getMeeting_link() {
        return meeting_link;
    }

    public void setMeeting_link(String meeting_link) {
        this.meeting_link = meeting_link;
    }
}
