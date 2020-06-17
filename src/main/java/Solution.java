import java.lang.Math;

public class Solution {

    /**
     * Implémentez la méthode closestToZero pour retourner la température la plus proche de zéro qui appartient au tableau ts.
     *  + si le tableau est vide, retournez 0
     *  + si deux nombres sont tous aussi proches de zéro, considérez le nombre positif comme étant le plus proche de zéro
     *      (par exemple si ts contient 5 & -5 retourner 5)
     * @param ts
     *
     */
	
    public static double closestToZero(double[] ts){
    	
    	if (ts.length == 0 )
    		return 0;
    	else {
	    	double tempMin = ts[0];
	    	for (double value : ts) 
	    	{ 
	    	    if (Math.abs(value) < Math.abs(tempMin)) {
	    	    	tempMin = value;
	    	    }
	    	    
	    	    else if (Math.abs(value) == Math.abs(tempMin)) {
	    	    	tempMin = Math.max(value, tempMin);
	    	    }
	    	}
	    	return tempMin;
	    }
	}
}