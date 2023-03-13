package CongresoMexicano;

import java.util.ArrayList;

public class LegislatorsPayroll { //nómina de legisladores
    LegislatorsPayroll() {

    }

    public ArrayList<Legislator> legislators = new ArrayList<Legislator>();

    public void addLegislator(Legislator legislator) {
        this.legislators.add(legislator);
    }

    public int getNumberOfLegislators(ArrayList legislators) {
        int size = legislators.size();
        return size;
    }

    public void showLegislators() {
        for (Legislator i : legislators) {
            i.toString();  
        }
    }
    
}
