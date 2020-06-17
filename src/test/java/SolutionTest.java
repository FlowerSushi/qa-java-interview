import org.junit.Test;
import org.junit.*;

public class SolutionTest {

    @Test
    public void closestToZeroEMPTY() {
        double[] ts =
                {};
        double result = Solution.closestToZero(ts);
        Assert.assertEquals(0, result, 0.0);
    }
    
    @Test
    public void closestToZeroVALUE1() {
        double[] ts =
                {7, -10, 13, 8, 4, -7.2, -12, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, 7};
        double result = Solution.closestToZero(ts);
        Assert.assertEquals(-1.7, result, 0.0);
    }
    
    @Test
    public void closestToZeroABS() {
        double[] ts =
                {7, -10, 13, 8, 4, 1.7, -12, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, 7};
        double result = Solution.closestToZero(ts);
        Assert.assertEquals(1.7, result, 0.0);
    }
    
    @Test
    public void closestToZeroABS2() {
        double[] ts =
                {7, -10, 13, 8, 4, -1.7, -12, -3.7, 3.5, -9.6, 6.5, 1.7, -6.2, 7};
        double result = Solution.closestToZero(ts);
        Assert.assertEquals(1.7, result, 0.0);
    }
    
    @Test
    public void closestToZeroVALUE2() {
        double[] ts =
                {7, -10, 13, 8, 4,2, -12, -3.7, 3.5, -9.6, 6.5, -6.2, 7};
        double result = Solution.closestToZero(ts);
        Assert.assertEquals(2, result, 0.0);
    }
}