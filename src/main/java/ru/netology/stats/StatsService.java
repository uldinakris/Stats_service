package ru.netology.stats;

public class StatsService {

    public int salesSum(int[] sales) {
        int sum = 0;
        for (int purchase : sales) {
            sum = sum + purchase;
        }
        return sum;
    }

    public int averageSale(int[] sales) {
        return salesSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int purchase : sales) {
            if (purchase >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int purchase : sales) {
            if (purchase <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsSaleLessAverage(int[] sales) {
        int saleLessAverage = 0;
        int average = this.averageSale(sales);
        for (int purchase : sales) {
            if (purchase < average) {
                saleLessAverage = saleLessAverage + 1;
            }
        }
        return saleLessAverage;
    }

    public int monthsSaleAboveAverage(int[] sales) {
        int saleAboveAverage = 0;
        int average = this.averageSale(sales);
        for (int purchase : sales) {
            if (purchase < average) {
                saleAboveAverage = saleAboveAverage + 1;
            }
        }
        return saleAboveAverage;
    }
}
