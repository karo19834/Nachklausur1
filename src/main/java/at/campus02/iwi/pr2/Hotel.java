package at.campus02.iwi.pr2;

public class Hotel extends Facility{

    int stars;
    int maxNrGuests;
    int nrGuests;

    public Hotel(double area, double heightAboveSeaLevel, int stars, int maxNrGuests, int nrGuests) {
        super(area, heightAboveSeaLevel);
        this.maxNrGuests = maxNrGuests;
        this.nrGuests = nrGuests;
        this.stars= stars >=1 && stars <=3 ? stars : 1;
//        if(stars >=1 && stars <=3){
//            return stars;
//        }else{
//            return 1;
//        }
    }
    // przepisac ladnie metode--------------------------------------
    @Override
    public double calculateProfit() {
        double przychod=0;
        double wydatki=0;

        if(stars ==1){
            przychod= 60*nrGuests;
            wydatki= 0.2*maxNrGuests*30;
        } else if ( stars == 2){
            przychod= 75*nrGuests;
            wydatki= 0.3*maxNrGuests*30;
        }else{
            przychod= 75*nrGuests;
            wydatki= 0.4*maxNrGuests*30;
        }
        return przychod-wydatki;
    }

    @Override
    public int getNrPalms() {
        double procenty= (double) nrGuests/maxNrGuests;
        if (procenty > 0.85){
            return 3;
        }else if (procenty>0.5){
            return 2;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Hotel: " +
                 nrGuests ;
    }
}
