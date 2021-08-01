package secondtask.service;

import secondtask.model.Vector;

import static java.lang.Math.*;

public class VectorСalculator {

    public Vector[] getVectors() {

        String format = "начало (x1,y1), конец (x2,y2)";

        System.out.println("Введите данные первого вектора в формате x1,y1,x2,y2");

        Vector[] vectors = {new Vector(0, 0, 0,0), new Vector(0,0,0,0)};
        return vectors;
    }

    public double getLength(Vector vector) {

        return sqrt(pow(vector.getFinalX()-vector.getInitialX(), 2) + pow(vector.getFinalY()-vector.getInitialY(), 2));
    }

    public Vector getMultiplicationVector (Vector firstVector, Vector secondVector) {
        return null;
    }
}
