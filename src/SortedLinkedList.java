public class SortedLinkedList
{
  private Node head;
  private int theLength = 0;
  
  /**
   * Create an empty list.
   */
  public SortedLinkedList()
  {
    head = null;
  }
  
  /**
   * Print all the elements of the list to the console.  Each element will have
   * the form "name:quantity" and the entries will be separated by a single
   * space.
   */
  public void print()
  {
    Node temp = head;
    while(temp != null)
    {
      System.out.print(temp.getName() + ":" + temp.getQuantity() + " ");
      temp = temp.getNext();
    }
    
    System.out.println();
  }
  
  /**
   * This method will return the name at the specified index.  Similar to an
   * array, the index of the first entry is zero.  If the index is invalid,
   * this method will return null.
   */
  public String getName(int index)
  {
    if( index < 0 || index >= theLength){
      return null;
    }
    //index is valid
    Node curr = head;
    for( int i = 0; i < index; i++){
      curr = curr.getNext();
    }
    return curr.getName();
  }
  
  /**
   * This method will return the quantity at the specified index.  Similar to
   * an array, the index of the first entry is zero.  If the index is invalid,
   * this method will return -1.
   */
  public int getQuantity(int index)
  {
    if( index < 0 || index >= theLength){
      return -1;
    }
    //index is valid
    Node curr = head;
    for( int i = 0; i < index; i++){
      curr = curr.getNext();
    }
    return curr.getQuantity();
  }
  /**
   * This method will return the number of elements currently held in the list.
   */
  public int length()
  {
    return theLength;
  }
  
  /**
   * This method will return whether or not the specified name is contained in
   * the list.
   */
  public boolean isMember(String name)
  {
    Node node = head;
    boolean foundMatch = false;
    while (node != null && !foundMatch) {
      if (node.getName().equals(name)) {
        foundMatch = true;
      } 
      else {
        node = node.getNext();
      }
    }
    return foundMatch;
  }
  
  /**
   * This method will add the specified name/quantity to the list in sorted
   * order.  This order is specified by the quantity from low to high.
   */
  public void insert(String name, int quantity){
    
    Node curr = head;
    Node prev = null;
    Node newNode = new Node(name, quantity);
    
    if (head == null){
      head = newNode;
      theLength += 1;
      return;
    }
    
    if (newNode.getQuantity() > head.getQuantity()){
      newNode.setNext(head);
      head = newNode;
      theLength += 1;
      return;
    }
    
    while (curr != null){
      if(newNode.getQuantity() > head.getQuantity()){
        newNode.setNext(head.getNext());
        head = newNode;
        theLength += 1;
        return;
      }
      
      if (newNode.getQuantity() > curr.getQuantity()){
        prev.setNext(newNode);
        newNode.setNext(curr);
        theLength += 1;
        return;
      }
      
      if (curr.getNext() == null){
        curr.setNext(newNode);
        theLength += 1;
        return;
      }
      prev = curr;
      curr = curr.getNext();
    }
  }  
}

