import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestBins {

        @Test
        public void TestBinsIncrement(){
            Bins bins = new Bins(2, 12);
            // Given
            int expected = 1; // change to

            // When
            bins.increment(10);

            int actual = bins.getBins(10);

            // Then
            Assert.assertEquals(expected, actual);

        }

}