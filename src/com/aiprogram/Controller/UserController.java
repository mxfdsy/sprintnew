package com.aiprogram.Controller;

import com.aiprogram.serveice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by 平凡的世界 on 2018/4/3.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
}
