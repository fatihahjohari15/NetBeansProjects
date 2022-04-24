public class LList 
{
    private Node firstNode; // reference to first node
    private int numberOfEntries;
    public LList()
    {
        clear();
    } // end default constructor


    public final void clear()  // note the final method
    {
        firstNode = null;
        numberOfEntries = 0;
    } // end method clear


    /*Implementations of the public methods , remove, replace, getEntry, contains,
    getLength, isEmpty, and toArray go here.
    . . .
    */

    public void add(Student newEntry)
    {
        Node newNode = new Node(newEntry);
        if (isEmpty())
            firstNode = newNode;
        else // add to end of nonempty list
        {
            Node lastNode = getNodeAt(numberOfEntries);
            lastNode.setNextNode(newNode); // make last node reference new node
        } // end if
        numberOfEntries++;
    } // end method add (Student newEntry)


    public boolean add(int newPosition, Student newEntry)
    {
        boolean isSuccessful = true;
        if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1))
        {
            Node newNode = new Node(newEntry);
            if (newPosition == 1) // case 1
            {
                newNode.setNextNode (firstNode);
                firstNode = newNode;
            }
            else // case 2: list is not empty
            { // and newPosition > 1
                Node nodeBefore = getNodeAt(newPosition - 1);
                Node nodeAfter = nodeBefore.getNextNode ();
                newNode.setNextNode(nodeAfter);
                nodeBefore.setNextNode(newNode);
            } // end if
            numberOfEntries++;
        }
        else
            isSuccessful = false;
        return isSuccessful;
    } // end method add (int newPosition, Student newEntry)


    public boolean isEmpty()
    {
        boolean result;
        if (numberOfEntries == 0) // or getLength() == 0
        {
            assert firstNode == null;
            result = true;
        }
        else
        {
            assert firstNode != null;
            result = false;
        } // end if
        return result;
    } // end method isEmpty ()


    public Student [] toArray()
    {
        // the cast is safe because the new array contains null entries
        //@ SuppressWarnings ("unchecked")
        Student [] result = new Student[numberOfEntries];
        int index = 0;
        Node currentNode = firstNode;
        while ((index < numberOfEntries) && (currentNode != null))
        {
            result[index] = currentNode.getData();
            currentNode = currentNode.getNextNode();
            index++;
        } // end while
        return result;
    } // end method toArray()

    public Student remove(int givenPosition)
    {
        Student result = null; // return value
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
        {
            assert !isEmpty();
            if (givenPosition == 1) // case 1: remove first entry
            {
                result = firstNode.getData(); // save entry to be removed
                firstNode = firstNode.getNextNode();
            }
            else // case 2: not first entry
            {
                Node nodeBefore = getNodeAt(givenPosition - 1);
                Node nodeToRemove = nodeBefore.getNextNode();
                Node nodeAfter = nodeToRemove.getNextNode();
                nodeBefore.setNextNode(nodeAfter);
                result = nodeToRemove.getData(); // save entry to be removed
            } // end if
            numberOfEntries--;
        } // end if

        return result; // return removed entry, or
        // null if operation fails
    } // end method remove (int givenPosition)

 

    public boolean replace(int givenPosition, Student newEntry)
    {
        boolean isSuccessful = true;
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
        {
            assert !isEmpty();
            Node desiredNode = getNodeAt(givenPosition);
            desiredNode.setData(newEntry);
        }

        else
            isSuccessful = false;
        return isSuccessful;
    } // end method replace (int givenPosition, Student newEntry)

    public Student getEntry(int givenPosition)
    {
        Student result = null; // result to return
        {
            assert !isEmpty ();
            result = getNodeAt(givenPosition).getData();
        } // end if

        return result;
    } // end getEntry

    public boolean contains(Student anEntry)
    {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && (currentNode != null))
        {
            if (anEntry.getName().equals(currentNode.getData().getName()))
                found = true;
            else
                currentNode = currentNode.getNextNode();
        } // end while
        return found;
    } // end contains



    // Returns a reference to the node at a given position.
    // Precondition: List is not empty;
    // 1 <= givenPosition <= numberOfEntries.
    private Node getNodeAt(int givenPosition)
    {
        assert (firstNode != null) && (1 <= givenPosition) && (givenPosition <= numberOfEntries);
        Node currentNode = firstNode;
        // traverse the chain to locate the desired node
        for (int counter = 1 ; counter < givenPosition ; counter++)
            currentNode = currentNode.getNextNode();
        assert currentNode != null;
        return currentNode;
    } // end getNodeAt


    private class Node
    {
    	private Student data; // entry in bag
    	private Node next; // link to next node
    	
        private Node(Student dataPortion)
    	{
     	   this (dataPortion, null);
    	} // end constructor


    	private Node(Student dataPortion, Node nextNode)
    	{
            data = dataPortion;
            next = nextNode;
    	} // end constructor


    	private Student getData()
    	{
            return data;
    	} // end getData


    	private void setData(Student newData)
    	{
            data = newData;
    	} // end setData


    	private Node getNextNode()
    	{
     	   return next;
    	} // end getNextNode


    	private void setNextNode(Node nextNode)
    	{
            next = nextNode;
    	} // end setNextNode
    } // end Node
	
} // end class LList