package shradha.tddtest;
 
import org.junit.Test;
import shradha.tdd.StrCal;
 public class StrCal {
 @Test
    public final void anyNumbers() {
        Assert.assertEquals(3+9+1+4+7, StringCalculator.Add("3,9,1,4,7"));
    }

   public static int add(final String num) {
    int total= 0;
    String[] array = num.split(",");
    
    for (String num : array) {
        if (!number.trim().isEmpty()) { 
            total+= Integer.parseInt(num);
        }
    }
    return total;
}
