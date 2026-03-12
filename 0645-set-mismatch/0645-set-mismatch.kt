class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
       val freq = mutableMapOf<Int, Int>()

        for (i in nums) {
            freq[i] = freq.getOrDefault(i, 0) + 1
        }
        var duplicate = -1
        var missing = -1

        for (n in 1..nums.size) {
            when(freq[n]) {
                2 -> duplicate = n
                null -> missing = n
            }
        }
        return intArrayOf(duplicate, missing)
    }
}