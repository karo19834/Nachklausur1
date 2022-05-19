package at.campus02.iwi.pr2;

public class Mine extends Facility{

    double miningDepth;
    RawMaterial rawMaterial;

    public Mine(double area, double heightAboveSeaLevel, double miningDepth, RawMaterial rawMaterial) {
        super(area, heightAboveSeaLevel);
        this.miningDepth = miningDepth;
        this.rawMaterial = rawMaterial;
    }

    //przepisac ladnie metode!!!!!!!!!!!!!!!!!!!!!!!!!!!!!-----------------------------------------------
    @Override
    public double calculateProfit() {
//        if(rawMaterial == RawMaterial.LITHIUM || rawMaterial== RawMaterial.NEODYMIUM) {
//            return 200;
//        }else{
//        return 300;
//        }
        return  rawMaterial == RawMaterial.LITHIUM || rawMaterial== RawMaterial.NEODYMIUM ? 200 : 300;
    }

    @Override
    public int getNrPalms() {
        if ( heightAboveSeaLevel < -100){
            return 3;
        }else if (rawMaterial == RawMaterial.TERBIUM){
            return 2;
        }else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return " Mine: "+ miningDepth +" "+ heightAboveSeaLevel;
    }
}

