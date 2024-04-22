package org.example;

import org.ejml.simple.SimpleMatrix;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    double[][] matrixA = new double[][] {
            {0.1, 0.1, 0.1},
            {0.1, 0.1, 0.1},
    };
    double[][] matrixB = new double[][] {
            {0.1, 0.1, 0.1},
            {0.1, 0.1, 0.1},
            {0.1, 0.1, 0.1},
    };
        SimpleMatrix mA = new SimpleMatrix(matrixA);
        SimpleMatrix mB = new SimpleMatrix(matrixB);

        SimpleMatrix mult = mA.mult(mB);

        mult.print();


    }
}