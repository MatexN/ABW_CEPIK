package pl.web.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.web.view.controller.base.BaseController;

/**
 * Created by Marcin Niedzielski.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Controller
@RequestMapping("")
public class HomeController extends BaseController {

    @RequestMapping("")
    public String common() {
        return "home/home";
    }
}
