package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.tree.VoidDescriptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DINGSHUO on 2017/7/16.
 */
@Service
public class DataService {
    @Autowired
    DataRepo repo;

    public void saveData(List<MeasEntity> list){
        List<DataEntity> dataEntities=new ArrayList<>();
        if(list.size()>0){
            for (MeasEntity measEntity:list){
                DataEntity dataEntity=new DataEntity();
                dataEntity.setDataValue(measEntity.getValueStr());
                dataEntities.add(dataEntity);
            }
        }
        repo.save(dataEntities);
    }
}
