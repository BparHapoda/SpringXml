package ru.boronin.spring.dao;

import ru.boronin.spring.entities.InsuranceEvent;
import ru.boronin.spring.entities.Owner;

import java.util.List;

public interface InsuranceDao {
    public List<InsuranceEvent> getAllEvents();
public  void save (Owner owner);
}
