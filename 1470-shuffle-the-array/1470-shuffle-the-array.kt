class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val size = nums.size
        val n = size / 2
        var result = IntArray(size)

         for(i in 0 until n) {
                val even = i * 2
                result[even] += nums[i]
                result[even+1] = nums[i+n]
            }

         return result
    }
}