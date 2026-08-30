class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var map = HashMap<Int, Int>()
        for (i in nums) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
        var bucket = Array(nums.size +1) {mutableListOf<Int>()}
        for((key, freq) in map) {
            bucket[freq].add(key)
        }
        return bucket.flatMap {it} .takeLast(k).toIntArray()
    }
}