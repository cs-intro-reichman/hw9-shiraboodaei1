public class LinkedListFirstTester {
    public static void main (String[] args){
        LinkedList list = new LinkedList();

        MemoryBlock block1 = new MemoryBlock(0, 10);
        MemoryBlock block2 = new MemoryBlock(10, 20);
        MemoryBlock block3 = new MemoryBlock(30, 30);

        list.addFirst(block1);

        // Test string function 
        // Expected output: (0, 10)
        System.out.println("Test str: " + list);

        list.addLast(block3);
        list.add(1, block2);

        // Expected output: block1, block2, block3
        System.out.println("Test1 - adding elements: " + list);
        // Check size 
        // Expected output:3
        System.out.println("Current list size: " + list.getSize());

        // Test getNode
        // Expected output: block2
        System.out.println("Test2: get second node: " + list.getNode(1).block);

        // Test getBlock 
        // Expected output: block1
        System.out.println("Test3: get first block: " + list.getBlock(0));

        // Test indexOf
        // Expected: 0
        System.out.println("Test4: Index of block2: " + list.indexOf(block2)); 

        // Test removing elements
        list.remove(block1); // remove First block
        list.remove(block2); // remove second block 
        list.remove(block3); // remove third block
        
        // Expected output: block2, block3
        System.out.println("Test5: removing block1: " + list);

        // remove from empth list 
        list.remove(1);
        
        


    }
}
