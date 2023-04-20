package ru.boronin.spring.controllers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ru.boronin.spring.dao.InsuranceDao;
import ru.boronin.spring.entities.InsuranceEvent;

import java.util.List;

@Controller
@Data
public class MyController {
    private final InsuranceDao dao;

    public MyController(InsuranceDao dao) {
        this.dao = dao;
    }


    @GetMapping("/")
    public String getAllEvents(Model model){
    List<InsuranceEvent> list = dao.getAllEvents();
    model.addAttribute("allEvents",list);

        return "all-events";
    }
}
