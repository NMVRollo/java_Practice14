package com.example.Practice14.controller;

import com.example.Practice14.dao.ManufactureDao;
import com.example.Practice14.model.Manufacture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manufacture")
public class ManufactureController {

    @Autowired
    ManufactureDao dao;

    @GetMapping
    public List<Manufacture> getAll() {
        return dao.getManufactures();
    }

    @PostMapping
    public void save(@RequestBody Manufacture manufacture) {
        dao.addWorker(manufacture);
    }

    @DeleteMapping
    public void remove(@RequestParam("manufacture") String manufacture) {
        dao.removeWorker(manufacture);
    }

}
