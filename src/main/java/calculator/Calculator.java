package calculator;

import java.util.*;

public class Calculator {
    private List<Integer> numbers = new LinkedList<>();

    public void enter(int i){
        numbers.add(i);
        if (numbers.size() > 2){
            throw new IllegalStateException();
        }
    }

    public void add(){
        if (numbers.size() != 2){
            throw new IllegalStateException();
        }
        numbers.set(0, numbers.get(0) + numbers.get(1));
        numbers.remove(1);
    }

    public void sub(){
        if (numbers.size() != 2){
            throw new IllegalStateException();
        }

        numbers.set(0, numbers.get(0) - numbers.get(1));
        numbers.remove(1);
    }

    public void mult(){
        if (numbers.size() != 2){
            throw new IllegalStateException();
        }

        numbers.set(0, numbers.get(0) * numbers.get(1));
        numbers.remove(1);
    }

    public void div(){
        if (numbers.size() != 2){
            throw new IllegalStateException();
        }

        if(numbers.get(0) != 0 && numbers.get(1) == 0){
            throw new ArithmeticException("The result is indeterminate or impossible!");

        }

        numbers.set(0, numbers.get(0) / numbers.get(1));
        numbers.remove(1);
    }


    public double getResult(){
        if (numbers.size() != 1){
            throw new IllegalStateException();
        }
        return numbers.get(0);
    }
}
