package com.example.citydemo.controller;

import com.example.citydemo.model.City;
import com.example.citydemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityController {
    @Autowired
    private CityService cityService;
    @GetMapping("/getAll")
    public List<City>getAll(){
        return cityService.getAll();
    }
    @GetMapping("{id}")
    public City getById(@PathVariable("id")Long id){
        return cityService.getById(id);
    }
    @PostMapping
    public String save(@RequestBody City city){
        cityService.save(city);
        return "Successful";
    }

}
