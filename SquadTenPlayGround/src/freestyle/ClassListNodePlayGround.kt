package freestyle

class ListNode(var `val`:Int){
    var next:ListNode? = null
}

fun main(){
    // an instance of the ListNode
//    var l1 = ListNode(1)
//    println(l1)
//    var num = 19
//    var result = 0
//    result = num / 10
//    println(result)

    // check for modulus
//    var sum = 12
//    var equalsTo = 0
//    equalsTo = sum % 10
//    println(equalsTo)

    var la:ListNode = ListNode(2)
    var lb:ListNode = ListNode(5)
    addTwoNumbers(la, lb)

}

fun addTwoNumbers(l1:ListNode?, l2:ListNode?){
    // dummy head
    var dummyHead = ListNode(0)
    // create a variable
    var p = l1
    var q = l2
    // current node
    var currentNode = dummyHead
    var carry = 0
    // the summation of the linked list values
    var x = 0
    var y = 0
    var sum = 0
    // loop through the list
    while (p != null || q != null){
        if (p != null){
            x = p.`val`
        } else {
            x = 0
        }
        if (q != null){
            y = q.`val`
        } else {
            y = 0
        }
        sum = carry + x + y
        carry = sum / 10
        currentNode.next = ListNode(sum % 10)
        // so the real current node becomes this
        currentNode = currentNode.next!!
        // to move to the next node in the list, use dot-next
        if (p != null){
            p = p.next
        }

        if (q != null){
           q = q.next
        }
        if (carry > 0){
           currentNode.next = ListNode(carry)
        }


    }
    println(dummyHead.next?.`val`)

//    return dummyHead.next
}