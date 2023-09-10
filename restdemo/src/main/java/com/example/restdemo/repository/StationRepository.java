package com.example.restdemo.repository;
import java.util.Arrays;
import java.util.List;



import com.example.restdemo.pojo.Station;
import org.springframework.stereotype.Repository;

@Repository
public class StationRepository {

    private List<Station> stations =  Arrays.asList(
        new Station("one","HYD"),
        new Station("two","BLR")

    );

        public List<Station> getStations() {
        return this.stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }    
}
