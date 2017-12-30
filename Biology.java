import acm.program.*;
import java.util.*;

public class Biology extends Program {
	public void run() {
		println("findFirstMatchingPosition is a method that gives the index of the first matching position between the do DNA cells.");
		println("You have to give the two DNA chains!");
		println("DNA chains can only be part of A,C,T,G!");
		String s1=readLine("Give the short DNA chain:");
		s1=checkLetters(s1);
		String s2=readLine("Give the long DNA chain:");
		s2=checkLetters(s2);
		
		/*String c1;
		String c2;
		boolean error1, error2;
		while (true) {
			error1=false;
			for (int i=0; i<s1.length(); i++) {
				c1=s1.charAt(i);
				if ((c1.equalsIgnoreCase("a") || c1.equalsIgnoreCase("t") || c1.equalsIgnoreCase("c") || c1.equalsIgnoreCase("g"))==false) {
					error1==true;
				}
			}
			if (error1==false) {
				break;
			} else {
				s1=readLine("You have inserted a wrong letter. Please give the short DNA chain again: ");
			}
		}*/
		
		while (s1.length()>s2.length()) {
			println("Long chain is bigger than short chain. Give again!");
			s1=readLine("Give the short DNA chain:");
			s1=checkLetters(s1);
			s2=readLine("Give the long DNA chain:");
			s2=checkLetters(s2);
		}
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		println(findFirstMatchingPosition(s1,s2));
	}
	
	
	private String checkLetters(String s) {
		boolean error=false;
		String c="";
		while (error==false) {
			c="";
			for (int i=0; i<s.length(); i++) {
				c=s.charAt(i)+"";
				if (!((c.equalsIgnoreCase("a")) || (c.equalsIgnoreCase("t")) || (c.equalsIgnoreCase("c")) || (c.equalsIgnoreCase("g")))) {
					error=true;
				}
			}
			if (error==false) {
				break;
			} else {
				s=readLine("You have inserted a wrong letter. Please give the DNA chain again: ");
			}
		}
		return s;
	}
	
	
	private int findFirstMatchingPosition(String shortDNA, String longDNA) {
		int len1=shortDNA.length();
		int len2=longDNA.length(); 
		int same, pos;
		int ans=-1;
		String cS="";
		String cL="";
		for (int i=0; i<=(len2-len1); i++) {
			same=0;
			pos=i;
			for (int j=0; j<len1; j++) {
				cS=shortDNA.charAt(j)+"";
				cL=longDNA.charAt(pos)+"";
				if ((cS.equals("A") && cL.equals("T")) || (cS.equals("T") && cL.equals("A")) || (cS.equals("C") && cL.equals("G")) || (cS.equals("G") && cL.equals("C"))) {
						same+=1;
						pos+=1;
					} else {
						break;
					}
			}
			if (same==len1) {
				ans=i;
				break;
			}
		}
		return ans;
	}
	
	




	
}



