package org.lang;

public class StateDetails {
	
	public void southIndia() {
		// TODO Auto-generated method stub
		System.out.println("Tamil Nadu");

	}
	public void northIndia() {
		// TODO Auto-generated method stub
		System.out.println("New Delhi");

	}
	public static void main(String[] args) {
		
		StateDetails s=new StateDetails();
		s.northIndia();
		s.southIndia();
		
		LanguageInfo l=new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
	
}
	

}
