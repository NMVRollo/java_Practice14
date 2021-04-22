package com.example.Practice14.dao;

import com.example.Practice14.model.Manufacture;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ManufactureDao {

    private final List<Manufacture> manufactures = new ArrayList<>();

    public void addWorker(Manufacture manufacture) {
        manufactures.add(manufacture);
    }

    public void removeWorker(String name) {
        manufactures.removeIf(e -> e.getName().equals(name));
    }

    public List<Manufacture> getManufactures() {
        return manufactures;
    }

}
