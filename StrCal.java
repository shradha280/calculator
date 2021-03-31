package shradha.tddtest;
 
import org.junit.Test;
import shradha.tdd.StrCal;
 public class StrCal {
 @Test(expected = RuntimeException.class)
public final void NegitiveNumber() {
    StrCal.Add("5,6,-1");
}
@Test
public final void NegativeNumbers() {
    RuntimeException exception = null;
    try {
        StrCal.Add("5,-6,-1");
    } catch (RuntimeException e) {
        exception = e;
    }
    Assert.assertNotNull(exception);
    Assert.assertEquals("Negatives not allowed: [-6, -1]", exception.getMessage());
}
   private static int add(final String num, final String delimiter) {
    int total= 0;
    String[] array= num.split(delimiter);
    List negNum = new ArrayList();
    for (String numb : array{
        if (!num.trim().isEmpty()) {
            int num1 = Integer.parseInt(num.trim());
            if (num1 < 0) {
                negNum.Add(num1);
            }
            total+= num1;
        }
    }
    if (negNum.size() > 0) {
        throw new RuntimeException("Negatives are not allowed: " + negNum.toString());
    }
    return total;
}
}