class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false
        } else {
            var num = x
            var rev = 0
            while (num > rev) {
                val lastDigit = num % 10
                rev = (rev * 10) + lastDigit
                num/=10
            }

            return num == rev || num == rev / 10
        }
    }
}