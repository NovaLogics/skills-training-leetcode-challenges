class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val seen = mutableSetOf<Char>()
        var maxLength = 0
        var left = 0

        for (right in s.indices) {
            while (s[right] in seen) {
                seen.remove(s[left])
                left++
            }
            seen.add(s[right])
            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength
    }
}


// ------------------------ TEST CASES -------------------------------

fun main() {

    val solution = Solution()

    val case1 = "abcabcbb"
    val case1Output = solution.lengthOfLongestSubstring(case1)
    println("Input: s = ${case1}")
    println("Output: ${case1Output}")
    println("-----------------------------------------")

    val case2 = "bbbbb"
    val case2Output = solution.lengthOfLongestSubstring(case2)
    println("Input: s = ${case2}")
    println("Output: ${case2Output}")
    println("-----------------------------------------")

    val case3 = "pwwkew"
    val case3Output = solution.lengthOfLongestSubstring(case3)
    println("Input: s = ${case3}")
    println("Output: ${case3Output}")
    println("-----------------------------------------")

    val case4 = "aab"
    val case4Output = solution.lengthOfLongestSubstring(case4)
    println("Input: s = ${case4}")
    println("Output: ${case4Output}")
    println("-----------------------------------------")

    val case5 = "dvdf"
    val case5Output = solution.lengthOfLongestSubstring(case5)
    println("Input: s = ${case5}")
    println("Output: ${case5Output}")
    println("-----------------------------------------")
}

// ----------------------------------------------------------------
