// Exercise 7: Financial Forecasting
class Forecast {
    static double futureValue(double currentValue, double rate, int years) {
        if (years == 0) return currentValue;
        return (1 + rate) * futureValue(currentValue, rate, years - 1);
    }

    static double futureValueOptimized(double currentValue, double rate, int years) {
        double result = currentValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + rate);
        }
        return result;
    }
}
