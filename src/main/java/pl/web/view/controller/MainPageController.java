package pl.web.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.engine.model.DiagnosticStation;
import pl.engine.service.DiagnosticStationService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainPageController {

    @Autowired
    DiagnosticStationService service;

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/add")
    public String add() {
        List<DiagnosticStation> list = new ArrayList<>();
        list=service.findAll();
        System.out.println(list);
        return "added";
    }
    @RequestMapping("/template")
    public String hello() {
        return "common/common";
    }
}
