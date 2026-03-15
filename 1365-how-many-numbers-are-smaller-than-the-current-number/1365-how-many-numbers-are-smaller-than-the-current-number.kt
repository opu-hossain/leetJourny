class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
       val sortedNums = nums.clone().also { it.sort() }
        val map = mutableMapOf<Int, Int>()
        for((index, value ) in sortedNums.withIndex()) {
            map.putIfAbsent(value, index)

        }
        return IntArray(nums.size) { i -> map[nums[i]]!!} 
    }
}