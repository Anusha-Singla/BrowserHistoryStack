package stack;

import java.util.Stack;

public class BHistory {

	private static Stack<String> browserHistory = new Stack<String>();
	
	public static Boolean isBrowserHistoryEmpty() {
		// TODO Auto-generated method stub
		if(browserHistory.size() == 0) {
			System.out.println("You have not searched anything yet");
			return true;
		}
		else {
			System.out.println("Browser history is not empty");
			return false;
		}
		
	}
	public static String mostRecentlyVisitedSite() {
		return browserHistory.peek();
	}
	public static String addSiteToHistory(String url) {
		
//		browserHistory.push(url);
	return browserHistory.push(url);
	}

	public static void goBackInTime(int n) {
		int size = browserHistory.size();
	//	System.out.println(size);
		if(browserHistory.size() == 0) {
			System.out.println("Empty browser history");
		}
		else {
			while(n>0){
		        browserHistory.pop();
		        n--;
		      }
//			System.out.println(size);
		}
	    
		
	}
	public static void printBrowsingHistory() {
		System.out.println(browserHistory);
	}

	
	public static void main(String[] args) {
      System.out.println(isBrowserHistoryEmpty());
        browserHistory.add("google.com");
        browserHistory.add("gmail.com");
        browserHistory.add("facebook.com");
        browserHistory.add("youtube.com");
        browserHistory.add("javatpoint.com");
        browserHistory.add("stackoverflow.com");

//    	System.out.println(isBrowserHistoryEmpty());
		System.out.println(mostRecentlyVisitedSite());
		addSiteToHistory("http://203.190.154.99/Index.html#/viewemployeedetail/10036");
		goBackInTime(2);
	    System.out.println(browserHistory.size());
        printBrowsingHistory();
}
}
