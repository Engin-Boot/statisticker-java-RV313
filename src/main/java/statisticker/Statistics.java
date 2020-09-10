package statisticker;

import java.util.List;

public class Statistics 
{
    public static class Stats{
        public Float average;
        public Float min;
        public Float max;

        public Stats(float average,float min,float max)
        {
            this.average = average;
            this.min = min;
            this.max = max;
            
        }


    }
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        if(!numbers.isEmpty())
       { 
         float minValue= numbers.get(0);
         float maxValue= numbers.get(0);
         float average = 0;
        for(Float num : numbers){
                average = average + num;
                
                if(minValue>num)
                    minValue = num;
                if(maxValue<num)
                    maxValue = num;
        }
        
        average = average/(float)numbers.size();
        Stats st = new Stats(average,minValue,maxValue);
        return st;

       }
       return (new Stats(Float.NaN,Float.NaN,Float.NaN));
    }
    
}
