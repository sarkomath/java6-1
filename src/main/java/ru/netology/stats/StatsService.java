package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        // Сумма всех продаж
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverage(long[] purchases) {
        // Средняя сумма продаж в месяц
        long average = calculateSum(purchases);

        return average / purchases.length;
        // не знал что можно так делать
    }

    public long findMaxIndex(long[] purchases) {
        // Номер месяца, в котором был пик продаж
        long max = purchases[0];
        //объявляем что мах - элемент массива. с индексом
        for(long purchase : purchases) {
            if (purchase > max) {
                max = purchase;
        // просматриваем весь массив, если находим значение, которое больше чем max - присваиваем ему его значение.
            }
            }
        long monthIndex = 0;
        long findMaxIndex = 0;
        for(long purchase : purchases) {
            monthIndex = monthIndex + 1;
            // увеличиваем месяц на единицу
            if (purchase == max) {
                findMaxIndex = monthIndex;
                // если max = purchase, значит monthMax (месяц макс. продаж) равен индексу месяца. и присваивает его значение
            }
        }
        return findMaxIndex;
        // сам бы не сделал никогда...
    }

    public long findMinIndex(long[] purchases) {
        long min = getMinimum(purchases);
        long monthIndex = 0;
        long findMinIndex = 0;
        for (long purchase : purchases) {
            monthIndex = monthIndex + 1;
            if (purchase == min) {
                findMinIndex = monthIndex;
            }
        }
        return findMinIndex;
    }
    private long getMinimum(long[] purchases) {
        long min = purchases[0];
        for(long purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }

    public long monthLessThanAverage(long[] purchases) {
        long average = calculateAverage(purchases);

        long count = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                count = count + 1;
            }
        }
        return count;
    }

    public long monthMoreThanAverage(long[] purchases) {
        long average = calculateAverage(purchases);

        long count = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                count = count + 1;
            }
        }
        return count;
    }
}

