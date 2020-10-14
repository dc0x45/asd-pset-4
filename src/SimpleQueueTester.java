import java.util.concurrent.ArrayBlockingQueue;

public class SimpleQueueTester {
    
    private static StringBuilder sb;
    
    public static void main(String[] args) {
        sb = new StringBuilder();

        testConstructors();
        testAddAndOffer();
        testClear();
        testContains();
        testElementAndPeek();
        testPollAndRemove();
    }
    
    private static void testConstructors() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to create queue: ");
            sb.append(e.toString());
        }

        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(0);

            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to create queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(-1);

            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to create queue: ");
            sb.append(e.toString());
        }


        String expected = sb.toString();
        sb.setLength(0);

        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to create queue: ");
            sb.append(e.toString());
        }

        try {
            SimpleQueue simpleQueue = new SimpleQueue(0);

            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to create queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(-1);

            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to create queue: ");
            sb.append(e.toString());
        }

        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testConstructors.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testConstructors.");
        }
    }
    
    private static void testAddAndOffer() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            boolean added = queue.add("first");
            added = queue.add("second");
            added = queue.add("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nRemaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            boolean added = queue.add("first");
            added = queue.add(null);
            added = queue.add("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nRemaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            boolean added = queue.add("first");
            added = queue.add("");
            added = queue.add("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nRemaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
            
            boolean added = queue.add("first");
            added = queue.add("second");
            added = queue.add("third");
            added = queue.add("fourth");
            
            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nRemaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            boolean added = queue.offer("first");
            added = queue.offer("second");
            added = queue.offer("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nRemaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            boolean added = queue.offer("first");
            added = queue.offer(null);
            added = queue.offer("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nRemaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            boolean added = queue.offer("first");
            added = queue.offer("");
            added =queue.offer("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nRemaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
            
            boolean added = queue.offer("first");
            added = queue.offer("second");
            added = queue.offer("third");
            added = queue.offer("fourth");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nRemaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            boolean added = simpleQueue.add("first");
            added = simpleQueue.add("second");
            added = simpleQueue.add("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nRemaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            boolean added = simpleQueue.add("first");
            added = simpleQueue.add(null);
            added = simpleQueue.add("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nRemaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            boolean added = simpleQueue.add("first");
            added = simpleQueue.add("");
            added = simpleQueue.add("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nRemaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(3);
            
            boolean added = simpleQueue.add("first");
            added = simpleQueue.add("second");
            added = simpleQueue.add("third");
            added = simpleQueue.add("fourth");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nRemaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            boolean added = simpleQueue.offer("first");
            added = simpleQueue.offer("second");
            added = simpleQueue.offer("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nRemaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            boolean added = simpleQueue.offer("first");
            added = simpleQueue.offer(null);
            added = simpleQueue.offer("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nRemaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            boolean added = simpleQueue.offer("first");
            added = simpleQueue.offer("");
            added = simpleQueue.offer("third");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nRemaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(3);
            
            boolean added = simpleQueue.offer("first");
            added = simpleQueue.offer("second");
            added = simpleQueue.offer("third");
            added = simpleQueue.offer("fourth");

            sb.append("\nAll items added to the queue: " + added);
            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nRemaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to add to queue: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testAddAndOffer.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testAddAndOffer.");
        }
    }
    
    private static void testClear() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial capacity of queue: " + queue.remainingCapacity());
            
            queue.clear();
            
            sb.append("\nContents of queue after clearing: " + queue);
            sb.append("\nSize of queue after clearing: " + queue.size());
            sb.append("\nRemaining capacity of queue after clearing: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to clear queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial capacity of queue: " + queue.remainingCapacity());
            
            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
            
            queue.clear();
            
            sb.append("\nContents of queue after clearing: " + queue);
            sb.append("\nSize of queue after clearing: " + queue.size());
            sb.append("\nRemaining capacity of queue after clearing: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to clear queue: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial capacity of queue: " + simpleQueue.remainingCapacity());
            
            simpleQueue.clear();
            
            sb.append("\nContents of queue after clearing: " + simpleQueue);
            sb.append("\nSize of queue after clearing: " + simpleQueue.size());
            sb.append("\nRemaining capacity of queue after clearing: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to clear queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial capacity of queue: " + simpleQueue.remainingCapacity());
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            simpleQueue.clear();
            
            sb.append("\nContents of queue after clearing: " + simpleQueue);
            sb.append("\nSize of queue after clearing: " + simpleQueue.size());
            sb.append("\nRemaining capacity of queue after clearing: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to clear queue: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testClear.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testClear.");
        }
    }
    
    private static void testContains() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("Initial contents of queue: " + queue);
            
            boolean contains = queue.contains("empty");
            
            sb.append("\nQueue contains the value 'empty': " + contains);
        } catch (Exception e) {
            sb.append("\nFailed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("Initial contents of queue: " + queue);
            
            queue.add("A");
            queue.add("B");
            queue.add("C");
            boolean contains = queue.contains("F");
            
            sb.append("\nQueue contains the value 'F': " + contains);
        } catch (Exception e) {
            sb.append("\nFailed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("Initial contents of queue: " + queue);
            
            queue.add("A");
            queue.add("B");
            queue.add("C");
            boolean contains = queue.contains("A");
            
            sb.append("\nQueue contains the value 'A': " + contains);
        } catch (Exception e) {
            sb.append("\nFailed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("Initial contents of queue: " + queue);
            
            queue.add("A");
            queue.add("B");
            queue.add("C");
            boolean contains = queue.contains("");
            
            sb.append("\nQueue contains the value '': " + contains);
        } catch (Exception e) {
            sb.append("\nFailed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            sb.append("Initial contents of queue: " + queue);
            
            queue.add("A");
            queue.add("B");
            queue.add("C");
            boolean contains = queue.contains(null);
            
            sb.append("\nQueue contains the value 'null': " + contains);
        } catch (Exception e) {
            sb.append("\nFailed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("Initial contents of queue: " + simpleQueue);
            
            boolean contains = simpleQueue.contains("empty");
            
            sb.append("\nQueue contains the value 'empty': " + contains);
        } catch (Exception e) {
            sb.append("\nFailed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("Initial contents of queue: " + simpleQueue);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            boolean contains = simpleQueue.contains("F");
            
            sb.append("\nQueue contains the value 'F': " + contains);
        } catch (Exception e) {
            sb.append("\nFailed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("Initial contents of queue: " + simpleQueue);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            boolean contains = simpleQueue.contains("A");
            
            sb.append("\nQueue contains the value 'A': " + contains);
        } catch (Exception e) {
            sb.append("\nFailed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("Initial contents of queue: " + simpleQueue);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            boolean contains = simpleQueue.contains("");
            
            sb.append("\nQueue contains the value '': " + contains);
        } catch (Exception e) {
            sb.append("\nFailed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            sb.append("Initial contents of queue: " + simpleQueue);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            boolean contains = simpleQueue.contains(null);
            
            sb.append("\nQueue contains the value 'null': " + contains);
        } catch (Exception e) {
            sb.append("\nFailed to check contents of queue: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testContains.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testContains.");
        }
    }
    
    private static void testElementAndPeek() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.element();
                        
            sb.append("\nHead of queue is: " + item);
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.element();
                        
            sb.append("\nHead of queue is: " + item);
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.peek();
                        
            sb.append("\nHead of queue is: " + item);
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("\nInitial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.peek();
                        
            sb.append("\nHead of queue is: " + item);
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.element();
                        
            sb.append("\nHead of queue is: " + item);
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.element();
                        
            sb.append("\nHead of queue is: " + item);
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.peek();
                        
            sb.append("\nHead of queue is: " + item);
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("\nInitial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.peek();
                        
            sb.append("\nHead of queue is: " + item);
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testElementAndPeek.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testElementAndPeek.");
        }
    }
    
    private static void testPollAndRemove() {
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.poll();
                                    
            sb.append("\nRemoved head of queue: " + item);
            sb.append("\nNew head of queue is: " + queue.peek());
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.poll();
                                    
            sb.append("\nRemoved head of queue: " + item);
            sb.append("\nNew head of queue is: " + queue.peek());
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.remove();
                                    
            sb.append("\nRemoved head of queue: " + item);
            sb.append("\nNew head of queue is: " + queue.peek());
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial remaining capacity of queue: " + queue.remainingCapacity());
            
            String item = queue.remove();
                                    
            sb.append("\nRemoved head of queue: " + item);
            sb.append("\nNew head of queue is: " + queue.peek());
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial remaining capacity of queue: " + queue.remainingCapacity());
            
            boolean removed = queue.remove("C");
                                    
            sb.append("\nRemoved item from of queue: " + removed);
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
            
            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial remaining capacity of queue: " + queue.remainingCapacity());
            
            boolean removed = queue.remove("C");
                                    
            sb.append("\nRemoved item from of queue: " + removed);
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
            queue.add("F");
            
            sb.append("Initial contents of queue: " + queue);
            sb.append("\nInitial size of queue: " + queue.size());
            sb.append("\nInitial remaining capacity of queue: " + queue.remainingCapacity());
            
            boolean removed = queue.remove("X");
                                    
            sb.append("\nRemoved item from of queue: " + removed);
            sb.append("\nUpdated contents of queue: " + queue);
            sb.append("\nUpdated size of queue: " + queue.size());
            sb.append("\nUpdated remaining capacity of queue: " + queue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);

            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.poll();
                                    
            sb.append("\nRemoved head of queue: " + item);
            sb.append("\nNew head of queue is: " + simpleQueue.peek());
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.poll();
                                    
            sb.append("\nRemoved head of queue: " + item);
            sb.append("\nNew head of queue is: " + simpleQueue.peek());
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.remove();
                                    
            sb.append("\nRemoved head of queue: " + item);
            sb.append("\nNew head of queue is: " + simpleQueue.peek());
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            String item = simpleQueue.remove();
                                    
            sb.append("\nRemoved head of queue: " + item);
            sb.append("\nNew head of queue is: " + simpleQueue.peek());
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            boolean removed = simpleQueue.remove("C");
                                    
            sb.append("\nRemoved item from of queue: " + removed);
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            boolean removed = simpleQueue.remove("C");
                                    
            sb.append("\nRemoved item from of queue: " + removed);
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        try {
            SimpleQueue simpleQueue = new SimpleQueue(10);
            
            simpleQueue.add("A");
            simpleQueue.add("B");
            simpleQueue.add("C");
            simpleQueue.add("D");
            simpleQueue.add("F");
            
            sb.append("Initial contents of queue: " + simpleQueue);
            sb.append("\nInitial size of queue: " + simpleQueue.size());
            sb.append("\nInitial remaining capacity of queue: " + simpleQueue.remainingCapacity());
            
            boolean removed = simpleQueue.remove("X");
                                    
            sb.append("\nRemoved item from of queue: " + removed);
            sb.append("\nUpdated contents of queue: " + simpleQueue);
            sb.append("\nUpdated size of queue: " + simpleQueue.size());
            sb.append("\nUpdated remaining capacity of queue: " + simpleQueue.remainingCapacity());
        } catch (Exception e) {
            sb.append("\nFailed to get head of queue: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testPollAndRemove.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testPollAndRemove.");
        }
    }
}