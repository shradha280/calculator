package shradha.tddtest;
 
import org.junit.Test;
import shradha.tdd.StrCal;
 public class StrCal {
 @Test
    public final void newLines() {
        Assert.assertEquals(3+9+1, StrCal.Add("3,9n1"));
    }

   public static int add(final String num) {
    int total= 0;
    String[] array = num.split(",|n");
    
    for (String num : array) {
        if (!num.trim().isEmpty()) { 
            total+= Integer.parseInt(num);
        }
    }
    return total;
}
}
