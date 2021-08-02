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

        return sqrt(pow(vector.getFinalX() - vector.getInitialX(), 2) +
                pow(vector.getFinalY() - vector.getInitialY(), 2) +
                pow(vector.getFinalZ() - vector.getInitialZ(), 2));
    }

    public Vector getMultiplicationVector(Vector firstVector, Vector secondVector) {
      int firstVectorY = firstVector.getFinalY() - firstVector.getInitialY();
      int firstVectorX = firstVector.getFinalX() - firstVector.getInitialX();
      int firstVectorZ = firstVector.getFinalZ() - firstVector.getInitialZ();
      int secondVectorY = secondVector.getFinalY() - secondVector.getInitialY();
      int secondVectorX = secondVector.getFinalX() - secondVector.getInitialX();
      int secondVectorZ = secondVector.getFinalZ() - secondVector.getInitialZ();

      return new Vector (0, 0, 0,
              firstVectorY * secondVectorZ - firstVectorZ * secondVectorY,
              firstVectorZ * secondVectorX - firstVectorX * secondVectorZ,
              firstVectorX * secondVectorY - firstVectorY * secondVectorX);


        //Векторное произведение (в результате которого получается вектор с координатами) возможно только в трехмерном пространстве,
        //Нужна третья координата "z".
    }

    public void getResult() {
        System.out.println("Длина первого вектора: " + getLength(firstVector));
        System.out.println("Длина второго вектора: " + getLength(secondVector));
        System.out.println("Результат произведения векторов");
        System.out.println(getMultiplicationVector(firstVector, secondVector));
        System.out.println(getMultiplicationVector(secondVector, firstVector));
    }
}
