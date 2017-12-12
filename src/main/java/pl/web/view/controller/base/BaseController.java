package pl.web.view.controller.base;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by Marcin Niedzielski.
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 2017r.
 */
public abstract class BaseController {

    protected String getLoggedUserName() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null) {
            return null;
        }
        return auth.getName();
    }

    protected boolean isAnyOneLogged() {
        return getLoggedUserName() != null && !getLoggedUserName().equals("anonymousUser");
    }
}
