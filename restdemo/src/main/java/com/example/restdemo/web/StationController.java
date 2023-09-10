package com.example.restdemo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.restdemo.pojo.Station;
import com.example.restdemo.repository.StationRepository;

@Controller
public class StationController {

    @Autowired
    private StationRepository stationRepo;

    @GetMapping("/stations")
    @ResponseBody
    public List<Station> getStations(){
        return stationRepo.getStations();
    }

    @GetMapping("/stations/{id}")
    @ResponseBody
    public Station getStationById(@PathVariable String id){
        return new Station("one","HYD");
    }
    
}
