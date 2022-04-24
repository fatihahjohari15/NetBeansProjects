package projectdata2;


public class Node
    {
    	private StudentBook data; 
        private Node previous;
    	private Node next; 
    	
    	public Node(StudentBook sb)
    	{
            data = sb;
            next = null;
            previous = null;
    	} 

	public Node getPrevious(){
            return previous;
        }
        
        public void setPrevious(Node previous){
            this.previous = previous;
        }
    	public StudentBook getData()
    	{
            return data;
    	} 

    	public void setData(StudentBook newData)
    	{
            this.data = newData;
    	} 

    	public Node getNext()
    	{
     	   return next;
    	} 

    	public void setNext(Node next)
    	{
            this.next = next;
    	} 
  
            @Override
	public String toString(){
            return data.toString();
	}
} 

