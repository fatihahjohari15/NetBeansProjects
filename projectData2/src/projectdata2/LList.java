package projectdata2;

public class LList {
	
private Node head = null;
	
    public LList(){
        head = null;
    }
        
    public void add(StudentBook sb){ 
	this.add(new Node(sb));
    }
        
    public void add(Node sb){ //method for add student and book
		
    if (head == null){
        head = sb;
	return;
    }
		
    Node currentNode = head;
        while(currentNode.getNext() != null){
        currentNode = currentNode.getNext();
    }
        sb.setPrevious(currentNode);
        currentNode.setNext(sb);
    }
        
    public Node delete(int index){ //method for delete student and book
	if(index == -1){
            return null;
	}
	else if(index == 0){
            Node prevHead = head;
            head = head.getNext();
            return prevHead;
	}
	Node currentNode = getNode(index);
	getNode(index - 1).setNext(getNode(index + 1));
	getNode(index + 1).setPrevious(getNode(index - 1));
	currentNode.setNext(null);
	currentNode.setPrevious(null);
        
	return currentNode;
    }
        
    public Node getNode(int index){ //method to get node
		
        int i = 0;
	Node currentNode = head;
		
	while(currentNode.getNext() != null && i < index){
            currentNode = currentNode.getNext();
            i++;
	}
		
        return currentNode;
    }
        
    public int length(){ //method to determine length
	if (head == null){
            return 0;
	}
	int length;
	Node currentNode = head;
            for (length = 1; currentNode.getNext() != null; currentNode = currentNode.getNext())
            length++;
            
	return length;
    }

@Override
    public String toString(){ //method to display all the data
	String s = "";
	Node current = head;
	s += current;
        
	while (current.getNext() != null){
            current = current.getNext();
            s += current;
	}
	return s;
    }
	
}