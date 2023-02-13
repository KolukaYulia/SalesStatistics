public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {4, 5, 1, 6, 4};
        int rezult = (int) service.QMSalesMoreAverageSales(sales);
        System.out.print(rezult);
    }

}