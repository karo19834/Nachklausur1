package at.campus02.iwi.pr2;

public abstract class Facility implements PalmRating{

     double area;
     double heightAboveSeaLevel;

    public Facility(double area, double heightAboveSeaLevel) {
        this.area = area;
        this.heightAboveSeaLevel = heightAboveSeaLevel;
    }

    public abstract double calculateProfit();

    public double getArea() {
        return area;
    }

    public double getHeightAboveSeaLevel() {
        return heightAboveSeaLevel;
    }

}
