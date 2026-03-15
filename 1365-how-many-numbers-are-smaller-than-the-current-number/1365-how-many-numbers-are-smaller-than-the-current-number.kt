class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
       var count = 0
        val output = mutableListOf<Int>()
        for (i in nums.indices) {
            for (j in nums.indices) {
               if (nums[i] != nums[j] && nums[j] < nums[i]) {
                   count++
               }
            }
            output.add(count)
            count = 0
        }
        return output.toIntArray() 
    }
}