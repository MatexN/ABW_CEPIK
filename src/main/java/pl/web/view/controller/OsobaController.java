package pl.web.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.engine.entity.Osoba;
import pl.engine.service.OsobaService;
import pl.web.view.controller.base.BaseController;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/osoba")
public class OsobaController extends BaseController {

    @Autowired
    OsobaService service;

    @RequestMapping("")
    public String showAddOsobaView() {
        return "osoba/edit";
    }

    @RequestMapping("/{id}")
    public String showEditOsobaView(@PathVariable("id") Long id,  Model model) {
        model.addAttribute("entity", service.findOne(id));
        return "osoba/edit";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String addNewOsoba(@Valid Osoba osoba, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("Złe");
        }

        Long id = osoba.getId();
        System.out.println(id);
        osoba = id == null ? service.create(osoba) : service.update(id, osoba);

        return "redirect:/osoba/all";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Osoba> findAll() {
        return service.findAll();
    }
}
