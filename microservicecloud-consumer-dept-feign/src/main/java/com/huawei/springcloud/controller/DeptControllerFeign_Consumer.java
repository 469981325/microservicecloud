package com.huawei.springcloud.controller;

import com.huawei.springcloud.entities.Dept;
import com.huawei.springcloud.service.DeptClientService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptControllerFeign_Consumer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.list();
    }


}
