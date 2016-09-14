package main.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import main.model.InputNumbers;

@Controller
public class CalculateControllerRest
{

  @RequestMapping(value = "/addNumbers", method = RequestMethod.POST)
  public @ResponseBody InputNumbers addEmployee(@RequestBody InputNumbers num)
  {
    int sum=num.getFirstNumber() + num.getSecondNumber();
    InputNumbers inputNumber=new InputNumbers();
    inputNumber.setSum(sum);
    return inputNumber;
  }
}