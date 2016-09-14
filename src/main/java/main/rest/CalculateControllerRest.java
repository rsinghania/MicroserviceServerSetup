package main.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.model.InputNumbers;

@Controller
public class CalculateControllerRest
{

  @RequestMapping(value = "/addNumbers", method = RequestMethod.GET)
  public Integer addEmployee(@ModelAttribute InputNumbers num, Model model)
  {
    return num.getFirstNumber() + num.getSecondNumber();
  }
}