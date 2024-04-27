package com.roze.behavioral.interpreterDesignPattern;

//Interpreter design pattern os the evaluation of expression
//different expressions are written for interpreter
// based on different keywords and logic within expression interpreter returns true and false
public class InterpreterApplication {
    public static Expression getMaleExpression() {
        Expression john = new TerminalExpression("John");
        Expression doe = new TerminalExpression("Doe");
        return new OrExpression(john, doe);
    }

    public static Expression getMarriedExpression() {
        Expression priya = new TerminalExpression("Priya");
        Expression married = new TerminalExpression("married");
        return new AndExpression(priya, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedExpression();
        System.out.println("Doe is Male? " + isMale.interpret("Doe"));
        System.out.println("Priya is Married? " + isMarried.interpret("Priya married"));
    }
}
