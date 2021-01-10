package jzoffer;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val){
        this.val = val;
    }

    void addNode(ListNode newNode){
        if(this.next == null){
            this.next = newNode;
        }
        else{
            this.next.addNode(newNode);
        }
    }
}
