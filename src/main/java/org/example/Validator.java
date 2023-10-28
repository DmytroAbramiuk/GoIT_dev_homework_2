package org.example;

public class Validator {
    public void validate(int n){
        if(n<=0){
            throw new IllegalArgumentException("The parameter should be bigger than 0");
        }
    }
}
