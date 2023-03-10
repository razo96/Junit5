package com.it;



public class Calculator {

    private double firstValue;
    private double secondValue;
    private double result;


    public double getResult() {return result;}



    public void setResult(double result) {this.result = result;}


    public double getFirstValue() {return firstValue;}
    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {return secondValue;}
    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }



    public void Adder(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
       result = getFirstValue() + getSecondValue();
      System.out.println("Result:" + result);
    }






    public void Subtract(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        result = getFirstValue() - getSecondValue();
        System.out.println("Result:" + result);
    }

    public void Multiply(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        result = getFirstValue() * getSecondValue();
        System.out.println("Result:" + result);
    }

    public void Division(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        result = getFirstValue() / getSecondValue();
        result = getSecondValue()!= 0 ? getFirstValue() / getSecondValue() : 0.0d;
        System.out.println("Result:" + result);
    }



    public double execute(char opCode) {
        switch (opCode) {
            case 'a':
                Adder(firstValue, secondValue);
                break;
            case 's':
                Subtract(firstValue, secondValue);
                break;
            case 'm':
                Multiply(firstValue, secondValue);
                break;
            case 'd':
                Division(firstValue, secondValue);
                break;
            default:
                System.out.println("Invalid opCode:" + opCode);
                result = 0.0d;
                break;
        }
        return getResult();
    }


}
