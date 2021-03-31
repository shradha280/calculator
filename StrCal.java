package shradha.tddtest;
 
import org.junit.Test;
import shradha.tdd.StrCal;
 
public class StrCalTesting {
    @Test
    public final void oneNumberreturnSameValue() {
    Assert.assertEquals(3, StrCal.add("3"));
 }
 
    @Test
    public final void TwoNumbers() {
    Assert.assertEquals(3+6, StrCal.Add("3,6"));
}
    @Test
    public final void emptyStringReturn0() {
    Assert.assertEquals(0, StrCal.Add(""));
}
}
public class StrCal {
    public static final void Add(final String num) {
int total =0;
        String[] array= num.split(",");
            for (String num : array) {
        if (!num.trim().isEmpty()) { 
            total+= Integer.parseInt(num);
        }
    }
    return total;
}
}