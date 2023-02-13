

public class StatsService {
    public int TotalSales(long[] sales) {
        int sum = 0;
        for (double i : sales) {
            sum += i;
        }
        return sum;
    }

    public double AverageSales(long[] sales) {
        double sum = TotalSales(sales);
        double AverageSum = sum / sales.length;

        return AverageSum;
    }

    public int MaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int MinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int QMSalesLessAverageSales(long[] sales) {
        int rezult = 0;
        double AverageSum = AverageSales(sales);
        for (long i = 0; i< sales.length; i++) {
            if (sales[(int) i] < AverageSum) {
                rezult++;

            }

        }
        return rezult;
    }

    public int QMSalesMoreAverageSales(long[] sales) {
        int rezult = 0;
        double AverageSum = AverageSales(sales);
        for (long i = 0; i< sales.length; i++) {
            if (sales[(int) i] > AverageSum) {
                rezult++;

            }

        }
        return rezult;
    }

}