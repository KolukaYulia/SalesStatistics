import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void ShouldTotalSales() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4};

        int expectedsum = 10;
        long actualsum = service.TotalSales(sales);

        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test
    public void ShouldAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {1, 3, 5, 6};

        double expectedsum = 3.75;
        double actualsum = service.AverageSales(sales);

        Assertions.assertEquals(expectedsum, actualsum);
    }

    @Test
    public void ShouldMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {1, 5, 4, 5, 3, 5};

        long expectedMax = 6;
        long actualMax = service.MaxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void ShouldMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {1, 5, 4, 5, 1, 5};

        long expectedMin = 5;
        long actualMin = service.MinSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void ShouldMonthsSalesLessAverage() {
        StatsService service = new StatsService();

        long[] sales = {1, 3, 4, 5, 7};

        long expectedQM = 2;
        long actualQM = service.QMSalesLessAverageSales(sales);

        Assertions.assertEquals(expectedQM, actualQM);
    }

    @Test
    public void ShouldMonthsSalesMoreAverage() {
        StatsService service = new StatsService();

        long[] sales = {1, 3, 4, 5, 7};

        long expectedQM = 2;
        long actualQM = service.QMSalesMoreAverageSales(sales);

        Assertions.assertEquals(expectedQM, actualQM);
    }


}
