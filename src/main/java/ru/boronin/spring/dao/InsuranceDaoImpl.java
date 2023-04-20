package ru.boronin.spring.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.boronin.spring.entities.InsuranceEvent;
import ru.boronin.spring.entities.Owner;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InsuranceDaoImpl implements InsuranceDao{
    private final SessionFactory sessionFactory;
@Autowired
    public InsuranceDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
  @Transactional
    public List<InsuranceEvent> getAllEvents() {
        Session session = sessionFactory.openSession();
        List<InsuranceEvent> list=new ArrayList<>();

       list=session.createQuery("from InsuranceEvent", InsuranceEvent.class).getResultList();


        return list;
    }

    @Override
    @Transactional
    public void save(Owner owner) {
        Session session = sessionFactory.openSession();
        session.persist(owner);
    }

}
