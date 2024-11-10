package org.tamil;

import org.english.English;

public class Tamil extends English {
	public void tamilLanguage() {
		System.out.println("Tamil Language");
	}
public static void main(String[] args) {
	Tamil t=new Tamil();
	t.tamilLanguage();
	t.englishLanguage();
	t.telguLanguage();
}
}
