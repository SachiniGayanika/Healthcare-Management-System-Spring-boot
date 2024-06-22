//service package eke LectureService class eka





package com.example.springsec.service;

import com.example.springsec.data.schedule;
import com.example.springsec.data.scheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ScheduleService {

    @Autowired
    private scheduleRepository scheduleRepository;

    public List<schedule> getAllschedule(){
        return scheduleRepository.findAll();

    }
    public schedule getscheduleById(int id){
        Optional<schedule> schedule=scheduleRepository.findById(id);
        if(schedule.isPresent()){
            return schedule.get();
        }
        return null;
    }

    public schedule createschedule(schedule schedule){
        return scheduleRepository.save(schedule);

    }
    public schedule updateschedule(schedule schedule){
        return scheduleRepository.save(schedule);
    }

    public String deleteschedule(int id){
        scheduleRepository.deleteById(id);
        return "deleted";
    }


    public List<schedule>getscheduleByName(String name){
        return scheduleRepository.getscheduleByName(name);
    }
}

