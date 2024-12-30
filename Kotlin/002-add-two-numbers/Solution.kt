import kotlin.collections.mutableListOf

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var currentNode1 = l1
        var currentNode2 = l2
        var carry = 0
    
        val resultHead = ListNode(0) 
        var currentResultNode = resultHead
    
        while (currentNode1 != null || currentNode2 != null || carry != 0) {
            val digit1 = currentNode1?.`val` ?: 0
            val digit2 = currentNode2?.`val` ?: 0
    
            val sum = digit1 + digit2 + carry
            carry = sum / 10 
    
            currentResultNode.next = ListNode(sum % 10)  
            currentResultNode = currentResultNode.next!!
    
            currentNode1 = currentNode1?.next
            currentNode2 = currentNode2?.next
        }
    
        return resultHead.next  
    } 
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

// ----------------------------------------------------------------

fun printLinkedList(head: ListNode?) {
    val result = mutableListOf<Int>()
    var current = head
    while (current != null) {
        result.add(current.`val`) 
        current = current.next
    }
    println("Output : $result") 
}

fun main() {

    // Create the linked list with values [2, 4, 3]
    val node1 = ListNode(2)
    val node2 = ListNode(4)
    val node3 = ListNode(3)

    // Link the nodes
    node1.next = node2
    node2.next = node3

    val firstNode = ListNode(5)
    val secondNode = ListNode(6)
    val thirdNode = ListNode(4)

    // Link the nodes
    firstNode.next = secondNode
    secondNode.next = thirdNode

    val outputArray = Solution().addTwoNumbers(node1, firstNode)
    printLinkedList(outputArray)
}

/*
kotlinc Solution.kt -include-runtime -d Solution.jar
java -jar Solution.jar
*/

// ----------------------------------------------------------------
