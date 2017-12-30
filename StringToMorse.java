import acm.program.*;
import java.util.*;

public class StringToMorse extends ConsoleProgram {
	public void run() {
		println("Give a string and it will be converted to Morse code!");
		String prim=readLine("Give your sentence: ");
		prim=prim.toUpperCase();
		StringTokenizer tokenizer=new StringTokenizer(prim," ");
		while (tokenizer.hasMoreTokens()) {
			String word=tokenizer.nextToken();
			word=converteToMorse(word);
			println(word);
		}
	}
	
	private String converteToMorse (String word) {
		String result="";
		for (int i=0; i<word.length(); i++) {
			char ch=word.charAt(i);
			if (Character.isLetter(ch)) {
				int index=ch-'A';
				result=result+" "+Morse[index];
			}
		}
		return result;
	}
	
	
	private static final String[] Morse={
		".-",
		"-...",
		"-.-.",
		"-..",
		".",
		"..-.",
		"--.",
		"....",
		"..",
		".---",
		"-.-",
		".-..",
		"--",
		"-.",
		"---",
		".--.",
		"--.-",
		".-.",
		"...",
		"-",
		"..-",
		"...-",
		".--",
		"-..-",
		"-.--",
		"--.."
	};
}