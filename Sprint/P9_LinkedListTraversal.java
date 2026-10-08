class P9_LinkedListTraversal{
        static class Node{
            int data;
            Node next;

            Node(int val){
                data = val;
                next = null;
            }
        }
         public static void main(String[] args){
            Node n1 = new Node(10);
            Node n2 = new Node(20);
            Node n3 = new Node(30);
            Node n4 = new Node(40);
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            Node current = n1;
            while(current!=null)
            {
                System.out.println(current.data);
                current = current.next;
            }
        
    }
}