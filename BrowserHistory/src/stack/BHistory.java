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
	public static Boolean mostRecentlyVisitedSite() {
		return null;
		
	}
	public static Boolean addSiteToHistory(String url) {

		return null;
		
	}

	public static void goBackInTime(int n) {
	    // Add CODE BELOW
	}
	public static void printBrowsingHistory() {
	    // Add CODE BELOW
	}

	
	public static void main(String[] args) {
      System.out.println(isBrowserHistoryEmpty());
}
}
