package day45_Abstraction.shape;

public class Triangle extends Shape{

    private double rightSide;
    private double leftSide;
    private double bottomSide;
    private double height;

    public Triangle(double rightSide, double leftSide, double bottomSide, double height) {
        super("Triangle");
        setRightSide(rightSide);
        setLeftSide(leftSide);
        setBottomSide(bottomSide);
        setHeight(height);
    }

    public double getRightSide() {
        return rightSide;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public double getHeight() {
        return height;
    }

    public void setRightSide(double rightSide) {
        if (rightSide <= 0){
            throw new RuntimeException("Invalid Right Side: " + rightSide);
        }
        this.rightSide = rightSide;
    }

    public void setLeftSide(double leftSide) {
        if (leftSide <= 0){
            throw new RuntimeException("Invalid Left Side: " + leftSide);
        }
        this.leftSide = leftSide;
    }

    public void setBottomSide(double bottomSide) {
        if (bottomSide <= 0){
            throw new RuntimeException("Invalid Bottom Side: " + bottomSide);
        }
        this.bottomSide = bottomSide;
    }

    public void setHeight(double height) {
        if (height <= 0){
            throw new RuntimeException("Invalid Height: " + height);
        }
        this.height = height;
    }

    @Override
    public double area() {
        return bottomSide*height/2;
    }

    @Override
    public double perimeter() {
        return leftSide+rightSide+bottomSide;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString() +
                ", rightSide=" + rightSide +
                ", leftSide=" + leftSide +
                ", bottomSide=" + bottomSide +
                ", height=" + height +
                '}';
    }
}
