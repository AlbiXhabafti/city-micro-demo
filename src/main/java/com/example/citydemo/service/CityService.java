package com.example.citydemo.service;

import com.example.citydemo.model.City;
import com.example.citydemo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<City> getAll(){
        return cityRepository.findAll();
    }
    public City getById(Long id){
        return cityRepository.findById(id).get();
    }
    public City save(City city){
        return cityRepository.save(city);
    }
}
