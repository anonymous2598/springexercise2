package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UserController {
    @RequestMapping(value="/display", method = RequestMethod.POST)
    public ModelAndView addUser(ModelMap map ,@RequestParam(value = "name") String userName,@RequestParam(value="password")String password)
    {
        User user1= new User(userName);
        ModelAndView mv =new ModelAndView("display");
        mv.addObject("user",user1);
        return  mv;
    }
}
