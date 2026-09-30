class TimeMap() {

    data class Entry(var value: String, var timestamp: Int)
    private var store  = HashMap<String, MutableList<Entry>>()

    fun set(key: String, value: String, timestamp: Int) {
        store.getOrPut(key){mutableListOf()}.add(Entry(value = value, timestamp = timestamp))
    }

    fun get(key: String, timestamp: Int): String {
        var entries = store[key] ?: return ""
        var left = 0
        var right  = entries.size - 1
        var result = 0
        while (left <= right) {
            var  mid = left + (right - left) / 2
            if(entries[mid].timestamp <= timestamp){
                result = entries[mid].value
                left = mid + 1
            }else {
                right = mid - 1
            }
        }
    }
    return result
}
