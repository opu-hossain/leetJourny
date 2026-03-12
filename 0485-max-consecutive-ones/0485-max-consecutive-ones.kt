class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        var resultCount = 0
        for (i in nums) {
            when(i) {
                1 -> count++
                0 -> {if (resultCount < count) resultCount = count
                count = 0}
            }
        }
        return maxOf(resultCount, count)
    }
}