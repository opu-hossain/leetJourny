class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n*2)

        System.arraycopy(nums,0,result,0,n)
        System.arraycopy(nums,0,result,n,n)

        return result
    }
}