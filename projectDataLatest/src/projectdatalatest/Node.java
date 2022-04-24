package projectdatalatest;

/**
 *
 * @author User-PC
 */
class Node 
{   
   // Data fields for Node   
   private StudentBook info;       // data stored in the node
   private Node link;         // link to next node

   // Methods
   // Constructors
   // postcondition: Creates a new empty node.
   public Node() {
     info = null;
     link = null;
   }

   // postcondition: Creates a new node storing obj.
   public Node(StudentBook info) {
     info = null;
     link = null;
   }

   // postcondition: Creates a new node storing obj 
   //   and linked to node referenced by next.
   public Node(StudentBook info, Node next) {
     info = info;
     link = next;
   } 
   // accessors

   public Object getInfo() 
   {
      return info;
   }

   public Node getLink() 
   {
      return link;
   }
   
   // mutators
   public void setInfo(StudentBook newInfo) 
   {
      info = newInfo;
   }

   public void setLink(Node newLink) 
   {
      link = newLink;
   }
} 

	