package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long totalSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSales = totalSales + sales[i];
        }

        return totalSales;
    }

    public long averageSales(long[] sales) {
        long totalSales = 0;

        for (int i = 0; i < sales.length; i++) {
            totalSales = totalSales + sales[i];
        }
        long averageSales = totalSales / 12;

        return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long CountMonthsLessAverageSales(long[] sales) {
        long averageSales = averageSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                count++;
            }
        }
        return count;
    }

    public long CountMonthsOverAverageSales(long[] sales) {
        long averageSales = averageSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                count++;
            }
        }
        return count;
    }
}
