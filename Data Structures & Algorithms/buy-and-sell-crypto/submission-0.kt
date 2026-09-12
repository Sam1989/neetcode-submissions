class Solution {
    fun maxProfit(prices: IntArray): Int {
        var buyPrice = Int.MAX_VALUE
        var profit = 0
        for( price in prices) {
            buyPrice = minOf(buyPrice, price)
            profit = maxOf(profit, price - buyPrice)
        }
        return profit
    }
}
