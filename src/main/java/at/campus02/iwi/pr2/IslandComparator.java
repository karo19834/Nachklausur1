package at.campus02.iwi.pr2;

import java.util.Comparator;

public class IslandComparator implements Comparator<Facility> {

    @Override
    public int compare(Facility o1, Facility o2) {
        if ( o1.heightAboveSeaLevel > o2.heightAboveSeaLevel) {
            return 1;
        }else if (o1.heightAboveSeaLevel < o2.heightAboveSeaLevel){
            return -1;
        }else if(o1.area > o2.area){
            return 1;
        }else if (o1.area < o2.area){
            return -1;
        }
        return 0;
    }
}