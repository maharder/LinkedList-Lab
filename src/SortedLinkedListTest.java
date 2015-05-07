import junit.framework.TestCase;


public class SortedLinkedListTest extends TestCase {
private Node head;
  public void testEmptyList() {
    
    SortedLinkedList l = new SortedLinkedList();
    
    assertEquals(0, l.length());
    assertEquals(-1, l.getQuantity(0));
    assertEquals(null, l.getName(0));
    assertEquals(false, l.isMember("tim"));
  }
  
  public void testSingleNode() {
    
    SortedLinkedList l = new SortedLinkedList();
    
    
    l.insert("tim" , 10);
    
    assertEquals(1, l.length());
    assertEquals(10, l.getQuantity(0));
    assertEquals("tim", l.getName(0));
    assertEquals(true, l.isMember("tim"));
  }
  
  public void testSecondNodeNewHead() {
    
    SortedLinkedList l = new SortedLinkedList();
    
    
    l.insert("tim" , 10);
    l.insert("bob" , 20);
    
    assertEquals(2, l.length());
    assertEquals(20, l.getQuantity(0));
    assertEquals(10, l.getQuantity(1));
    assertEquals("tim", l.getName(1));
    assertEquals("bob", l.getName(0));
    assertEquals(true, l.isMember("tim"));
    assertEquals(true, l.isMember("bob"));
  }
  
  public void testRepeatedHeadInsert() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("tim" , 10);
    l.insert("bob" , 20);
    l.insert("carl", 25);
    
    assertEquals(3, l.length());
    assertEquals(20, l.getQuantity(1));
    assertEquals(10, l.getQuantity(2));
    assertEquals(25, l.getQuantity(0));
    assertEquals("tim", l.getName(2));
    assertEquals("bob", l.getName(1));
    assertEquals("carl", l.getName(0));
    assertEquals(true, l.isMember("tim"));
    assertEquals(true, l.isMember("bob"));
    assertEquals(true, l.isMember("carl"));
  }
  
  public void testSecondTail() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("tim" , 25);
    l.insert("bob" , 20);
    l.insert("carl", 10);
    
    assertEquals(3, l.length());
    assertEquals(20, l.getQuantity(1));
    assertEquals(10, l.getQuantity(2));
    assertEquals(25, l.getQuantity(0));
    assertEquals("tim", l.getName(0));
    assertEquals("bob", l.getName(1));
    assertEquals("carl", l.getName(2));
    assertEquals(true, l.isMember("tim"));
    assertEquals(true, l.isMember("bob"));
    assertEquals(true, l.isMember("carl"));
  }
  
  public void testMiddleThird() {
  SortedLinkedList l = new SortedLinkedList();
    
    l.insert("tim" , 20);
    l.insert("bob" , 25);
    l.insert("carl", 10);
    
    assertEquals(3, l.length());
    assertEquals(20, l.getQuantity(1));
    assertEquals(10, l.getQuantity(2));
    assertEquals(25, l.getQuantity(0));
    assertEquals("tim", l.getName(1));
    assertEquals("bob", l.getName(0));
    assertEquals("carl", l.getName(2));
    assertEquals(true, l.isMember("tim"));
    assertEquals(true, l.isMember("bob"));
    assertEquals(true, l.isMember("carl"));
  }
}
