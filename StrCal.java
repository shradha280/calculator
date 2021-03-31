package shradha.tddtest;
 
import org.junit.Test;
import shradha.tdd.StrCal;
 public class StrCal {
 @Test
    public final void newLines() {
        Assert.assertEquals(3+1, StrCal.Add("//;n3;1"));
    }
   public static int Add(final String num) {
    String delim = ",|n";
    String noDelim= num;
    if (num.startsWith("//")) {
        int index = num.indexOf("//") + 2;
        delim = num.substring(index, index + 1);
        noDelim= num.substring(num.indexOf("n") + 1);
    }
    return add(noDelim, delim);
}
   public static int Add(final String num, final string delim) {
    int total= 0;
    String[] array = num.split(delim);
    
    for (String num : array) {
        if (!num.trim().isEmpty()) { 
            total+= Integer.parseInt(num.trim());
        }
    }
    return total;
}
}
