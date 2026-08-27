/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        
        HashMap<Node,Node>mp = new HashMap<>();
        Node c = head;
        while(c!=null){
             mp.put(c, new Node(c.val));
             c= c.next;
        }
        c=head;
        while(c!=null){
            mp.get(c).next = mp.get(c.next);
            mp.get(c).random = mp.get(c.random);
            c=c.next;
        }
        return mp.get(head);
    }
}