package org.example;


public class Calculator {
    public static void main(String[] args) {

        }
        public int add(int x, int y){
        return x+y;
        }

        public int subtract(int x, int y){
        return x-y;
        }

        public int multiply(int x,int y){
        return x*y;
        }

        public double divide(int x, int y){
        if (y==0){ throw new IllegalArgumentException("Делить на ноль нельзя");}
        return (double) x/y;
        }

}