package secondtask.model;

public class Vector {

    private int initialX;
    private int initialY;
    private int finalX;
    private int finalY;

    public Vector(int initialX, int initialY, int finalX, int finalY) {
        this.initialX = initialX;
        this.initialY = initialY;
        this.finalX = finalX;
        this.finalY = finalY;
    }

    public int getInitialX() {
        return initialX;
    }

    public void setInitialX(int initialX) {
        this.initialX = initialX;
    }

    public int getInitialY() {
        return initialY;
    }

    public void setInitialY(int initialY) {
        this.initialY = initialY;
    }

    public int getFinalX() {
        return finalX;
    }

    public void setFinalX(int finalX) {
        this.finalX = finalX;
    }

    public int getFinalY() {
        return finalY;
    }

    public void setFinalY(int finalY) {
        this.finalY = finalY;
    }

    @Override
    public String toString() {
        return "начало (" + initialX + "," + initialY + "), конец (" + finalX + "," + finalY + ")";
    }
}
