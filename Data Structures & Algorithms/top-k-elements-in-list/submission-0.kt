class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        var map = HashMap<Int, Int>()
        for (i in nums) {
            map[i] = map.getOrDefault(i, 0) + 1
        }


        val buckets = Array(nums.size + 1) { mutableListOf<Int>()}
        for ((num, freq) in map) {

            buckets[freq].add(num)
        }

        return buckets.flatMap { it }.takeLast(k).toIntArray()
    }
}