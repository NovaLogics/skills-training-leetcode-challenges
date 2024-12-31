class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()
        
        for((index, number) in nums.withIndex()){
            val matchingValue = target - number
            
            if(map.containsKey(matchingValue)){
                return intArrayOf(map[matchingValue]!!, index)
            }
            map[number] = index

        }
        
      throw IllegalArgumentException ("No solution found")
    }
}

//----------------------------------------------------------------

fun printResult(nums: IntArray, target: Int) {
    val outputArray = Solution().twoSum(nums, target)
    println("Input: nums = ${nums.contentToString()}, target = $target")
    println("Output: ${outputArray.contentToString()}")
    println("-----------------------------------------")
}

fun main() {
    printResult(intArrayOf(2, 7), 9)

    printResult(intArrayOf(3,2,4), 6)

    printResult(intArrayOf(3, 3), 6)
}

/*
kotlinc Solution.kt -include-runtime -d Solution.jar
java -jar Solution.jar
*/

//----------------------------------------------------------------