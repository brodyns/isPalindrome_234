import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
    }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        while(head != null){
            vals.add(head.val);
            head = head.next;
        }
        int front = 0;
        int end = vals.size() - 1;
        while(front < end){
            if(!vals.get(front).equals(vals.get(end))){
                return false;
            }
            front++;
            end--;
        }
        return true;
    }
}
