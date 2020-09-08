package statisticker;

import java.util.*;

public class Statistics 
{
        static class Stats{
        public Float min=Float.NaN;
        public Float max=Float.NaN;
        public Float average=Float.NaN;
    }
    
    public static Stats getStatistics(List<Float> numbers) {
        
        Statistics.Stats stats = new Stats();
        if(numbers.isEmpty())
        {
            return stats;
        }
        
        Float sum = 0.0f;
        stats.min = Collections.min(numbers);
    	stats.max = Collections.max(numbers);
         for (Float n:numbers)
        {
            sum += n;
        }
        stats.average = sum/numbers.size();
        return stats;
    }
}
