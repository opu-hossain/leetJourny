class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val size = nums.size
        val notInArray = mutableListOf<Int>()
        for(i in 1..size) {
            if (!nums.contains(i)) {
                notInArray.add(i)
            }
        }
        return notInArray 
    }
}