class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val set = nums.toHashSet()
        val notInArray = mutableListOf<Int>()
        for(i in 1..nums.size) {
            if (i !in set) {
                notInArray.add(i)
            }
        }
        return notInArray 
    }
}