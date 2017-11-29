package pl.web.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.engine.model.*;
import pl.engine.service.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kuba on 17.11.17.
 */

@Controller
public class VehicleHistoryController {
    @Autowired
    VehicleService vehicleService;
    @Autowired
    DiagnosticStationService diagnosticStationService;

    @RequestMapping("/history")
    public String getHistory(Model model, @RequestParam Long vehicleid) {

        model.addAttribute("vehicle", vehicleService.findOne(vehicleid));
        model.addAttribute("owners", vehicleService.getOwnersByVehicleId(vehicleid));

        return "history";
    }
}

