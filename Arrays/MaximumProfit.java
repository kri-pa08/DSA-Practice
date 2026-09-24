int minPrice = arr[0];
int maximum = 0;
for (int i = 1; i < arr.length; i++) {

    // Ab tak ka minimum price
    if (arr[i] < minPrice) {
        minPrice = arr[i];
    }

    // Aaj sell karne par profit
    int profit = arr[i] - minPrice;

    if (profit > maximum) {
        maximum = profit;
    }
}