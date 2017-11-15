package pl.wat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wat.model.Owner;
import pl.wat.service.OwnerService;

@Controller
public class MainPageController {

    @Autowired
    OwnerService ownerService;

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/add")
    public String add() {
        Owner owner = new Owner();
        owner.setFirstname("Andrzej");
        owner.setLastname("Duda");
        owner.setMail("andrzejdupa@niepodam.pl");
        owner.setPesel("99999999999");
        ownerService.add(owner);
        return "added";
    }
}
