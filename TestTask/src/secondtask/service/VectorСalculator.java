package secondtask.service;

import secondtask.model.Vector;

import static java.lang.Math.*;

public class VectorСalculator {

    private static VectorСalculator vectorСalculator;

    private VectorСalculator() {
    }

    public static VectorСalculator getInstance() {
        if (vectorСalculator == null) {
            vectorСalculator = new VectorСalculator();
        }
        return vectorСalculator;
    }

    public double getLength(Vector vector) {

        return sqrt(pow(vector.getFinalX() - vector.getInitialX(), 2) + pow(vector.getFinalY() - vector.getInitialY(), 2));
    }

    public Vector getMultiplicationVector(Vector firstVector, Vector secondVector) {
        return null;
    }
}
