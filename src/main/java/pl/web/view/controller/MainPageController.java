package pl.web.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.engine.entity.DiagnosticStation;
import pl.engine.entity.Owner;
import pl.engine.service.DiagnosticStationService;
import pl.engine.service.OwnerService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainPageController {

    @Autowired
    OwnerService ownerService;

    @RequestMapping("/owners")
    public String welcome(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners";
    }

    @RequestMapping("/")
    public String add() {
        return "index";
    }
    @RequestMapping("/template")
    public String hello() {
        return "common/common";
    }
}
