package org.example;

public class IntsCalculator implements Ints {
    Calculator calc = new Calculator();
    // Хотел сделать оставшиеся операции (sub и div), но решил ничего не трогать!
    @Override
    public int sum(int arg0, int arg1) {
        double x = calc.newFormula().
                addOperand(arg0).
                addOperand(arg1).
                calculate(Calculator.Operation.SUM).result;
          return (int) x;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double x = calc.newFormula().
                addOperand(arg0).
                addOperand(arg1).
                calculate(Calculator.Operation.MULT).result;
        return (int) x;
    }

    @Override
    public int pow(int a, int b) {
        double x = calc.newFormula().
                addOperand(a).
                addOperand(b).
                calculate(Calculator.Operation.POW).result;
        return (int) x;
    }
}
