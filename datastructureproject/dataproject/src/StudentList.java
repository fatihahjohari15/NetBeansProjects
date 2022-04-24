class StudentNode {
	private Student value; 
	private StudentNode next;
	private StudentNode previous;
	
        public StudentNode(Student s){
            value = s;
            next = null;
            previous = null;
	}
        public Student getValue(){
            return value;
        }
	public StudentNode getNext(){
            return next;
        }
	public StudentNode getPrevious(){
            return previous;
        }
	public void setValue(Student s){
            value = s;
        }
	public void setNext(StudentNode next){
            this.next = next;
        }
	public void setPrevious(StudentNode previous){
            this.previous = previous;
        }
        @Override
	public String toString(){
		return value.toString();
	}
}
public class StudentList {
	
	private StudentNode headNode = null;
	public static final int START = 0;
	
	public StudentList(StudentNode h){
		addStudent(h);
	}
	public StudentList(){
		headNode = null;
	}
	public void addStudent(Student s){
		this.addStudent(new StudentNode(s));
	}
	public void addStudent(StudentNode s){
		
		if (isEmpty()){
			setHeadNode(s);
			return;
		}
		
		StudentNode currentNode = headNode;
		while(currentNode.getNext() != null){
			currentNode = currentNode.getNext();
		}
		s.setPrevious(currentNode);
		currentNode.setNext(s);
	}
	public StudentNode remove(int index){
		if(index == -1){
			return null;
		}
		else if(index == 0){
			StudentNode oldHead = headNode;
			headNode = headNode.getNext();
			return oldHead;
		}
		StudentNode currentNode = getNode(index);
		getNode(index-1).setNext(getNode(index+1));
		getNode(index+1).setPrevious(getNode(index-1));
		currentNode.setNext(null);
		currentNode.setPrevious(null);
		return currentNode;
	}
	public StudentNode remove(Student s){
		int target = find(s);
		return remove(target);
	}
	public StudentNode removeByMatric(int matric){
		int target = find(matric);
		return remove(target);
	}
	
	public int find(Student s){
		StudentNode currentNode = headNode;
		for (int i = 0; currentNode.getNext() != null; currentNode = currentNode.getNext()){
			if(s.equals(currentNode)){
				return i;
			}
			currentNode = currentNode.getNext();
			i++;
		}
		return -1;
	}
	public int find(int matric){
		StudentNode currentNode = headNode;
		int cMatric = currentNode.getValue().getMatric();
		for (int i = 0; currentNode.getNext() != null; currentNode = currentNode.getNext()){
			if(matric == cMatric){
				return ++i;
			}
			currentNode = currentNode.getNext();
			cMatric = currentNode.getValue().getMatric();
			i++;
		}
		return -1;
	}
	private boolean isEmpty() {
		return (headNode == null);
	}
	private void setHeadNode(StudentNode s) {
		headNode = s;
	}
	public void insertAt(Student s, int index){
		this.insertAt(new StudentNode(s), index);
	}
	
	public void insertAt(StudentNode s, int index){
		if (index == 0){
			s.setNext(headNode);
			headNode.setPrevious(s);
			headNode = s;
			return;
		}
		else if(isValid(index)){
			int i = 0;
			StudentNode currentNode = headNode;
			while(i < index-1){
				i++;
				if (currentNode.getNext() != null)
					currentNode = currentNode.getNext();
				else
					break;
			}
			
			s.setNext(currentNode.getNext());
			currentNode.getNext().setPrevious(s);
			s.setPrevious(currentNode);
			currentNode.setNext(s);
			
			return;
		}
		else if (index == length()){
			addStudent(s);
			return;
		}
	}
	private StudentNode getHeadNode() {
		return headNode;
	}
	public boolean isValid(int index) {
		return ((index < length()) && (index >= 0));
	}
	public int length(){
		if(isEmpty()){
			return 0;
		}
		int length;
		StudentNode currentNode = headNode;
		for (length = 1; currentNode.getNext() != null; currentNode = currentNode.getNext())
			length++;
		return length;
	}
	public StudentNode getNode(int index){
		
		int i = 0;
		StudentNode currentNode = headNode;
		
		while(currentNode.getNext() != null && i < index){
			currentNode = currentNode.getNext();
			i++;
		}
		
		return currentNode;
	}
	
        @Override
	public String toString(){
		String s = "";
		StudentNode current = headNode;
		s += current;
		try{
			while (current.getNext() != null){
				s += "\n";
				current = current.getNext();
				s += current;
			}
		}
		catch (NullPointerException e){
			return "List is Empty";
		}
		s += "\n";
		return s;
	}
	
}

