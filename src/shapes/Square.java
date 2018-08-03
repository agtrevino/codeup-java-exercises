package shapes;

public  class Square extends Quadrilateral {

    public Square(double length){
        super(length, length);
    }

    protected double setSide(double side){
        this.length = side;
        this.width = side;
        return side;
    }

    @Override
    void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.length = this.width = length;
    }
}
