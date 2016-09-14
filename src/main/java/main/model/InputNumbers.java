package main.model;

import org.springframework.stereotype.Component;

@Component
public class InputNumbers
{
  private int firstNumber;
  private int secondNumber;
  private int sum;
  public int getSum()
  {
    return sum;
  }
  public void setSum(int sum)
  {
    this.sum = sum;
  }
  public int getFirstNumber()
  {
    return firstNumber;
  }
  public void setFirstNumber(int firstNumber)
  {
    this.firstNumber = firstNumber;
  }
  public int getSecondNumber()
  {
    return secondNumber;
  }
  public void setSecondNumber(int secondNumber)
  {
    this.secondNumber = secondNumber;
  }

}
