package org.example;

public class SumCalculator {
    public int sum(int n){
        Validator validator = new Validator();
        validator.validate(n);

        int result = 0;

        for(int i=1; i<=n; ++i){
            result+=i;
        }

        return result;
    }
}
