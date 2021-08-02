package secondtask.model;

public class Vector {

    private int initialX;
    private int initialY;
    private int initialZ;
    private int finalX;
    private int finalY;
    private int finalZ;

    public Vector(int initialX, int initialY, int finalX, int finalY) {
        this.initialX = initialX;
        this.initialY = initialY;
        this.finalX = finalX;
        this.finalY = finalY;
    }

    public Vector(int initialX, int initialY, int initialZ, int finalX, int finalY, int finalZ) {
        this.initialX = initialX;
        this.initialY = initialY;
        this.initialZ = initialZ;
        this.finalX = finalX;
        this.finalY = finalY;
        this.finalZ = finalZ;
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

    public int getInitialZ() {
        return initialZ;
    }

    public void setInitialZ(int initialZ) {
        this.initialZ = initialZ;
    }

    public int getFinalZ() {
        return finalZ;
    }

    public void setFinalZ(int finalZ) {
        this.finalZ = finalZ;
    }

    @Override
    public String toString() {
        return "начало (" + initialX + "," + initialY + "," + initialZ + "), " +
                "конец (" + finalX + "," + finalY + "," + finalZ + ")";
    }
}
