/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temphead = head;
        Node next=null;
        Node prev = null;
        Node child = null;
        while(temphead != null){
            if(temphead.child != null){
                next = temphead.next;
                child = temphead.child;
                temphead.next = child;
                child.prev = temphead;
                while(child != null){
                    prev = child;
                    child = child.next;
                }
                prev.next = next;
                if(next != null){
                    next.prev = prev;
                }
                temphead.child = null;
            }
            temphead = temphead.next;
        }
        return head;
    }
}