package statisticker;

import java.util.*;

public class Statistics 
{
    public static class Stats {
		Float average;
		Float min;
	        Float max;
		public Stats(float average, float min, float max) {
			this.average=average;
			this.min=min;
			this.max=max;
		}
	}
    public static Stats getStatistics(List<Float> numbers) {
    	if(!numbers.isEmpty()){
    		float average=0;
        	float min=Collections.min(numbers);
        	float max=Collections.max(numbers);
		Float sum = 0f
        	for (Float n:numbers)
                {
                sum+=n;
                }
        	average = sum/(numbers.size());
        	Stats s = new Stats(average,min,max);
        	return s;
    	}
        return (new Stats(Float.NaN,Float.NaN,Float.NaN));
    }
}
