class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
       /* We will use the summation formula of the linear series, which is n*(n+1)/2 and n*(n+1)*(2n+1)/6.
            and then follow along the algorithm...
         */
        var acSum = 0L
        var acSumSqr = 0L
        val arraySize = nums.size.toLong()


        for(i in nums) {
            acSum += i.toLong()
            acSumSqr += i.toLong() * i.toLong()
        }
        val expSum = arraySize * (arraySize + 1) / 2
        val expSumSqr = arraySize * (arraySize + 1) * (2 * arraySize + 1) / 6

        val difference1 = acSum - expSum
        val difference2 = acSumSqr - expSumSqr

        val difference = difference2 / difference1

        val duplicateNumber = (difference1 + difference) / 2
        val missingNumber = difference - duplicateNumber

        return intArrayOf(duplicateNumber.toInt(),missingNumber.toInt())
    }
}