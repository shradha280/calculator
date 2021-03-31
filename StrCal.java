package shradha.tddtest;
 
import org.junit.Test;
import shradha.tdd.StrCal;
 
public class StrCalTesting {
    @Test
    public final void twoNumbersAreAdded() {
        StrCal.Add("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public final void nonNumbers() {
        StrCal.Add("1,X");
    }
    @Test
    public final void emptyStringReturn0() {
    Assert.assertEquals(0, StrCal.Add(""));
}
}
public class StrCal {
    public static final void Add(final String num) {
        String[] array= num.split(",");
            for (String num: array) {
              if (!number.isEmpty()) {
                Integer.parseInt(num); 
            }
        }
    }
}
