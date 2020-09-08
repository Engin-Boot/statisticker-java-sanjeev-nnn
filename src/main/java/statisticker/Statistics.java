package statisticker;

import java.util.*;

public class Statistics 
{
        public static class Stats{
        Float min=Float.NaN;
        Float max=Float.NaN;
        Float average=Float.NaN;
                
    }
    
    public static Stats getStatistics(List<Float> numbers) {
        
        Stats s = new Stats();
        if(!numbers.isEmpty())
        {
        Float sum = 0.0f;
        s.min = Collections.min(numbers);
    	s.max = Collections.max(numbers);
         for (Float n:numbers)
        {
            sum += n;
        }
        s.average = sum/numbers.size();
        return s;
    }
            return s;
}
