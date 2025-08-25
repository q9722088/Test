package com.example;

/**
 * 简单的计算器类
 */
public class Calculator {
    
    /**
     * 加法运算
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * 减法运算
     */
    public int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * 乘法运算
     */
    public int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * 除法运算
     */
    public int divide(int a, int b) {
        return a / b;
    }
    
    /**
     * 主方法用于测试
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
        System.out.println("10 * 5 = " + calc.multiply(10, 5));
        System.out.println("10 / 5 = " + calc.divide(10, 5));
    }
}