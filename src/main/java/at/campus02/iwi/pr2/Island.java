package at.campus02.iwi.pr2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Island{

    public double facilityArea;
    public ArrayList<Facility> facilities;

    public Island() {
        this.facilityArea = 0;
        this.facilities = new ArrayList<>();
    }

    public void add(Facility f){
        facilities.add(f);
        facilityArea += f.area;
    }

    public Facility findHighestProfit() {
        Facility maxFacility = null;
        double highestProfit= Double.MIN_VALUE;
        for( Facility f : facilities){
            if (f.calculateProfit() > highestProfit) {
                highestProfit = f.calculateProfit();
                maxFacility = f;
            }
        }
        return maxFacility;
    }

    public HashMap<String, Integer> groupFacilities (){

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Low",0);
        map.put("Average",0);
        map.put("High",0);

        for ( Facility f: facilities) {
            if (f.calculateProfit()<1000){
                map.put("Low", map.get("Low") +1);
            }else if (f.calculateProfit()<10000){
                map.put("Average", map.get("Average") +1);
            }else{
                map.put("High", map.get("High")+1);
            }
        }
        return map;
    }

    public List<Facility> risingWaterSimulation( double waterLevel){
        List<Facility> list = new LinkedList<>();

        for ( Facility f: facilities) {
            if ( f.heightAboveSeaLevel <= waterLevel){
                list.add(f);
            }
        }
        return list;
    }

    public void sortedPrint(){
        facilities.sort( new IslandComparator());
        for (Facility f: facilities) {
            System.out.println( f.getHeightAboveSeaLevel()+" "+f.getArea());
        }
    }

}
    