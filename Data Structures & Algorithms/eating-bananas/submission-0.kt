class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var minSpeed = 0
        var maxSpeed = 0

        for(pile in piles) {
            maxSpeed = Math.max(maxSpeed, pile)
        }

        while (minSpeed < maxSpeed) {
            val mid = minSpeed + (maxSpeed - minSpeed) / 2

            if(canEatBananas(piles, mid, h)) {
                maxSpeed = mid
            } else {
                minSpeed = mid + 1
            }
        }
        return minSpeed
    }

    fun canEatBananas(piles: IntArray, mid: Int, h: Int): Boolean {
        var hours = 0
        for(pile in piles) {
            hours += ceil(pile.toDouble() / mid.toDouble()).toInt()
        }

        return hours <= h
    }

}
