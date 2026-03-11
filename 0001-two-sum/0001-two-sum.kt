class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
           var cur = nums[i]
            var x = target - cur
            if (map.containsKey(x)) {
                return intArrayOf(map[x]!!, i)
            }
            map[cur] = i
        }
        return intArrayOf()
    }
}