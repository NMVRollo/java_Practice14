package com.example.Practice14.dao;

import com.example.Practice14.model.Worker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorkerDao {

    private final List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void removeWorker(String worker) {
        workers.removeIf(e -> e.getFirstName().equals(worker));
    }

    public List<Worker> getWorkers() {
        return workers;
    }

}
