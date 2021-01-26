package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class showController {
    @RequestMapping("test")
    public ModelAndView getShowView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","helloworld");
        modelAndView.setViewName("show");
        return modelAndView;
    }

}
