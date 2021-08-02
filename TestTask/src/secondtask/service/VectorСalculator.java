package secondtask.service;

import secondtask.model.Vector;

import static java.lang.Math.*;

public class VectorСalculator {

    private Vector firstVector;
    private Vector secondVector;

    private static VectorСalculator vectorСalculator;

    private VectorСalculator() {
    }

    public static VectorСalculator getInstance() {
        if (vectorСalculator == null) {
            vectorСalculator = new VectorСalculator();
        }
        return vectorСalculator;
    }

    public void setVectors (Vector firstVector, Vector secondVector) {
        this.firstVector = firstVector;
        this.secondVector = secondVector;
    }

    public double getLength(Vector vector) {

        return sqrt(pow(vector.getFinalX() - vector.getInitialX(), 2) + pow(vector.getFinalY() - vector.getInitialY(), 2));
    }

    public Vector getMultiplicationVector(Vector firstVector, Vector secondVector) {
        //Векторное произведение (в результате которого получается вектор с координатами) возможно только в трехмерном пространстве,
        //Нужна третья координата "z".
        return null;
    }

    public void getResult() {
        System.out.println("Длина первого вектора: " + vectorСalculator.getLength(firstVector));
        System.out.println("Длина второго вектора: " + vectorСalculator.getLength(secondVector));

        vectorСalculator.getMultiplicationVector(firstVector, secondVector);
        vectorСalculator.getMultiplicationVector(secondVector, firstVector);
    }
}
