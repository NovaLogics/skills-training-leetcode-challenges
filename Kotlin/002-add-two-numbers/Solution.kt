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

// ------------------------ TEST CASES -------------------------------

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
    val n1 = ListNode(2)
    val n2 = ListNode(4)
    val n3 = ListNode(3)
    n1.next = n2
    n2.next = n3

    // Create the linked list with values [5, 6, 4]
    val n4 = ListNode(5)
    val n5 = ListNode(6)
    val n6 = ListNode(4)
    n4.next = n5
    n5.next = n6

    val output = Solution().addTwoNumbers(n1, n4)
    printLinkedList(output)
}

// ----------------------------------------------------------------
