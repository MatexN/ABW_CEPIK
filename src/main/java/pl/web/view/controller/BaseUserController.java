package pl.web.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.web.view.controller.base.BaseController;


/**
 * Created by Marcin Niedzielski.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
@Controller
@RequestMapping(BaseUserController.MAPPING)
public class BaseUserController extends BaseController {
    public static final String MAPPING = "/user";

    @ResponseBody
    @RequestMapping("")
    public String getUser() {
        return getLoggedUserName();
    }


}
