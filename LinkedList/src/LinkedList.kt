class LinkedList<T> {

    private var head:Node<T>? = null
    private var tail:Node<T>? = null
    private var previous:Node<T>? = null
    private var size = 0

    fun isEmpty():Boolean {
        return size == 0
    }

    override fun toString(): String {
        if (isEmpty()){
            return "Empty list"
        } else {
            return head.toString()
        }
    }
    /**
     * This add a node to the head
     * */
    fun push(value:T):LinkedList<T>{
        // create a node-instance
        head = Node(value = value, next = head)
        if (tail == null){
            tail = head
        }
        size++
        return this
    }

    fun reverseLinkedList():Node<T>? {
        // to reverse a linkedlist, you must get the head.
        // get the current.next

        var currentNode = head
        var nextNode:Node<T>?
        while (currentNode != null){
            nextNode = currentNode?.next
            // set the currentNode to prev or reverse the pointer to previous
            currentNode?.next = previous
            // update the currentNode
            previous = currentNode
            currentNode = nextNode
        }
         return previous
    }

    /**
     * this append method adds a node to the tail
     * */
    fun append(value:T) {
        // check if list is empty
        if (isEmpty()){
            push(value)
            return
        }
        // add node to the "next" of tail
        tail?.next = Node(value = value)
        //
        tail = tail?.next
        size++
    }

    /**
     * this gets a node at a given index.
     * */
    fun nodeAt(index:Int):Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }

        return currentNode
    }

}