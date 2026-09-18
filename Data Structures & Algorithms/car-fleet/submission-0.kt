class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        var fleets = 0
        var slow = 0.0
        for (i in position.indices.sortedByDescending{position[it]}){
            var time = (target - position[i]).toDouble() / speed[i]
            if (time > slow) {
                slow = time
                fleets++
            }
        }
        return fleets
    }
}
