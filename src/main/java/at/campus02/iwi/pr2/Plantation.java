package at.campus02.iwi.pr2;

public class Plantation extends Facility {

    Fruit fruit;

    public Plantation(double area, double heightAboveSeaLevel, Fruit fruit) {
        super(area, heightAboveSeaLevel);
        this.fruit = fruit;
    }

    //przepisac ladnie metode!!!!!--------------------------------------------------
    @Override
    public double calculateProfit() {
        if (fruit == Fruit.BANANA){
        return  area*30;
        } else if ( fruit == Fruit.COCONUT){
            return area*15*2.5;
        } else if ( fruit == Fruit.MANGO){
            if ( heightAboveSeaLevel <150 ){
                return area*15*3;
            }else{
                return  area*10*3;
            }
        }
        return 0;
    }

    @Override
    public int getNrPalms() {
        if (area <=20){
            return 3;
        }else if (fruit == Fruit.MANGO){
            return 2;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Plantation: " +
                 fruit;
    }
}