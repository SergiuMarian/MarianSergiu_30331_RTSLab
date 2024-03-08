package org.example1;

import java.util.Scanner;

public class UserMenu {

    Operations operations = new Operations();

    public void start(){
        System.out.println("Select the operation you want to perform: '+', '-', '*': ");

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.nextLine();

        System.out.println("Enter first number (real part): ");
        operations.setReal1(scanner.nextDouble());

        System.out.println("Enter first number (imaginary part): ");
        operations.setImag1(scanner.nextDouble());

        System.out.println("Enter second number (real part): ");
        operations.setReal2(scanner.nextDouble());

        System.out.println("Enter second number (imaginary part): ");
        operations.setImag2(scanner.nextDouble());

        switch(choice){
            case "+":
                System.out.println(operations.sum(operations.getReal1(), operations.getImag1(), operations.getReal2(),
                        operations.getImag2())); break;
            case "-":
                System.out.println(operations.subtract(operations.getReal1(), operations.getImag1(), operations.getReal2(),
                        operations.getImag2())); break;
            case "*":
                System.out.println(operations.multiply(operations.getReal1(), operations.getImag1(), operations.getReal2(),
                        operations.getImag2())); break;
        }
    }
}
