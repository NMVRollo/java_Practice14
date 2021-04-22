package com.example.Practice14.controller;

import com.example.Practice14.dao.WorkerDao;
import com.example.Practice14.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    @Autowired
    WorkerDao dao;

    @GetMapping
    public List<Worker> getAll() {
        return dao.getWorkers();
    }

    @PostMapping
    public void save(@RequestBody Worker worker) {
        dao.addWorker(worker);
    }

    @DeleteMapping
    public void remove(@RequestParam("worker") String worker) {
        dao.removeWorker(worker);
    }

}
