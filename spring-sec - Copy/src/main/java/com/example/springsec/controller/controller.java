//package eka controller class eka lecture controller

package com.example.springsec.controller;
import com.example.springsec.service.ScheduleService;
import com.example.springsec.data.schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class controller {

    @Autowired
    private ScheduleService ScheduleService;

    @GetMapping(path = "/scheduler")
    public List<schedule> getAllschedule(){
        return ScheduleService.getAllschedule();
    }
    @GetMapping(path = "/scheduler/{id}")
    public schedule getscheduleById(@PathVariable int id){
        return ScheduleService.getscheduleById(id);
    }

    @PostMapping(path = "/scheduler")
    public schedule createschedule(@RequestBody schedule schedule){
        return ScheduleService.createschedule(schedule);
    }

    @PutMapping(path = "/scheduler")
    public schedule updateschedule(@RequestBody schedule schedule){
        return ScheduleService.updateschedule(schedule);
    }

    @DeleteMapping(path = "/scheduler/{id}")
    public String deleteschedule(@PathVariable int id){
        return ScheduleService.deleteschedule(id);
    }


    @GetMapping(path = "/scheduler" , params ="name")
    public List<schedule> getscheduleByName(@RequestParam String name) {
        return ScheduleService.getscheduleByName(name);
    }
}
