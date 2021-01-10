package jzoffer;

public class jz_25 {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null) return null;

        RandomListNode currentNode = pHead;
        // 1. duplicate each node
        while(currentNode != null) {
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode = currentNode.next;
            currentNode.next = cloneNode;
            cloneNode.next = nextNode;
            currentNode = nextNode;
        }

        currentNode = pHead;
        // 2. traversal the linked list again and create links to random
        while(currentNode != null) {
            currentNode.next.random = currentNode.random == null ? null : currentNode.random.next;
            currentNode = currentNode.next.next;
        }

        // 3. break the whole linked list into two parts
        currentNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        while(currentNode != null) {
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;
            cloneNode.next = cloneNode.next == null ? null : cloneNode.next.next;
            currentNode = currentNode.next;
        }

        return pCloneHead;
    }
}
