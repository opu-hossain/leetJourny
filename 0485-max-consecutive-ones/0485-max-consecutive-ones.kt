class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0 // Current streak
        var resultCount = 0 // Stored streak
        for (i in nums) {
            when(i) {
                1 -> count++
                0 -> {if (resultCount < count) resultCount = count // Checking if the current streak is greater than stored streak.
                count = 0}
            }
        }
        return maxOf(resultCount, count) // in case of last the last digit being '1' we trurn the max from the both variable
    }
}