package Striver_DoublyLinkedList;

class BrowserNode {										// Created a class with the following class variables
    String data;
    BrowserNode next;
    BrowserNode back;

    BrowserNode(String data){							// This Constructor is enough for us
        this.data = data;
    }
}

public class DLL_13_DesignBrowserHistory {				// Master class
	
	BrowserNode currentPage;							// Created a new node

    public DLL_13_DesignBrowserHistory(String homepage) {// Constructor
        currentPage = new BrowserNode (homepage);		// Homepage is loaded and saved as currentPage
    }
    
    public void visit(String url) {						// visit function
        BrowserNode newNode = new BrowserNode(url);		// Created a new node with URL
        currentPage.next = newNode;						// Set the next
        newNode.back = currentPage;						// Set the back
        currentPage = newNode;							// newNode is the new currentPage
    }
    
    public String back(int steps) {						// back function
        while (steps > 0) {
            if (currentPage.back != null){
                currentPage = currentPage.back;
            }
            else break;									// It can't go beyond
            steps--;
        }
        return currentPage.data;						// We return the current page URL
    }
    
    public String forward(int steps) {					// forward function
        while (steps > 0){
            if (currentPage.next != null){
                currentPage = currentPage.next;
            }
            else break;									// It can't go further
            steps--;
        }
        return currentPage.data;						// We return the current page URL
    }

}