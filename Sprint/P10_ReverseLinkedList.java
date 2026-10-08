class P10_ReverseLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int val)
        {
            data = val;
            next = null;
        }
    }
        static void printList(Node head){
            Node current = head;
            while(current!=null)
            {
                System.out.print(current.data+" -> ");
                current = current.next;
            }
            System.out.println("null");
        }
        public static void main(String[] args){
            Node head = new Node(50);
            head.next = new Node(60);
            head.next.next = new Node(70);
            head.next.next.next = new Node(80);
            head.next.next.next.next = new Node(90);
            head.next.next.next.next.next = new Node(100);

            System.out.println("Original Linked List:");
            printList(head);
            Node current = head;
            Node prev = null;
            Node next = null;
            while(current!=null)
            {
                next = current.next;
                 current.next = prev;
                prev = current;
                current = next;
            }
            System.out.println("Reversed List:");
            printList(prev);
        }
    }
