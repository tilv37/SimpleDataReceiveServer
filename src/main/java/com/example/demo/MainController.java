package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by DINGSHUO on 2017/7/16.
 */
@RestController
public class MainController {
    @Autowired
    DataService service;


    @PostMapping(value = "/upload")
    public void getData(@RequestBody List<MeasEntity> list){
        service.saveData(list);
    }
}
