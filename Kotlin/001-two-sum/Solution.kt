class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int,Int>()
        
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
