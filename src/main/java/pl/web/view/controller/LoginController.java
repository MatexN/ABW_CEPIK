package pl.web.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.web.view.controller.base.BaseController;

@Controller
@RequestMapping(LoginController.MAPPING)
public class LoginController extends BaseController {
    static final String MAPPING = "/login";

    @RequestMapping("")
    public String login() {
        return isAnyOneLogged() ? "redirect:" : "login";
    }


}