package pl.web.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.engine.entity.Owner;
import pl.engine.entity.Vehicle;
import pl.engine.service.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by kuba on 17.11.17.
 */

@Controller
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    VehicleService vehicleService;
    @Autowired
    DiagnosticStationService diagnosticStationService;

    @GetMapping(value = "/add")
    public String showAddForm(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        return "vehicle/add";
    }

    @PostMapping(value = "/add")
    public String addVehicle(@Valid @ModelAttribute("vehicle") Vehicle vehicle, BindingResult result, Model model) {
        if (result.hasErrors()) return "vehicle/add";

        vehicleService.create(vehicle);

        return "redirect:/home";
    }

    @GetMapping(value = "/search")
    public String showSearchForm(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        return "vehicle/search";
    }

    @PostMapping(value = "/search")
    public String searchVehicle(@Valid @ModelAttribute("vehicle") Vehicle vehicle, BindingResult result, Model model) {
        Vehicle v = vehicleService.findOne(vehicle.getVin());
        if (v == null)
            return "error/noresult";
        else {
            model.addAttribute("vehicle", v);
            model.addAttribute("owners", vehicleService.getOwnersByVehicleId(v.getId()));
            model.addAttribute("inspections", vehicleService.getAllInspectionsByVehicleId(v.getId()));
            return "/vehicle/details";
        }
    }//trzeba zmienić PK Vehicle na VIN i wyjebać ID całkiem


//    @RequestMapping(value = "/{vin}", method = RequestMethod.GET)
//    public String showOne(@PathVariable String vin, Model model) {
//        model.addAttribute("vehicle", vehicleService.findOne(vin));
//
//        return "history";
//    }

}

