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
        if(head == null)return head;
        Node cur = head;
        while(cur != null){
            if(cur.child != null){
                Node next = cur.next;
                cur.next = flatten(cur.child);
                cur.next.prev = cur;
                cur.child = null;
                while(cur.next != null){
                    cur = cur.next;
                }
                if(next != null){
                    cur.next = next;
                    next.prev = cur;
                }
            }
            cur = cur.next;
        }
        // Node temphead = head;
        // Node next=null;
        // Node prev = null;
        // Node child = null;
        // while(temphead != null){
        //     if(temphead.child != null){
        //         next = temphead.next;
        //         child = temphead.child;
        //         temphead.next = child;
        //         child.prev = temphead;
        //         while(child != null){
        //             prev = child;
        //             child = child.next;
        //         }
        //         prev.next = next;
        //         if(next != null){
        //             next.prev = prev;
        //         }
        //         temphead.child = null;
        //     }
        //     temphead = temphead.next;
        // }
        return head;
    }
}