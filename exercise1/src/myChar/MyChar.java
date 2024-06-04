package myChar;

public class MyChar {

	char charFromUser;
	
	public MyChar(char charFromUser1) {
		this.charFromUser = charFromUser1;
  }

	public String isVowel() {
		// Convert the character to a string and use .matches to check if it is a vowel
		String result = Character.toString(this.charFromUser).matches("[aeiouAEIOU]") ? "Vowel" : "Not a vowel";
	        return result;
  }

	public boolean isNumber() {
		if (charFromUser >= '0' && charFromUser <= '9') {
			System.out.println("Character is a number!");
		} else {
			System.out.println("Character is not a number!");
		}
		return (charFromUser >= '0' && charFromUser <= '9');
	}


	public boolean isAlphabet() {
		return (charFromUser >= 'a' && charFromUser <= 'z') || (charFromUser >= 'A' && charFromUser <= 'Z');
	}

	public void printCaseAlphabets() {
		if (isAlphabet()) {
			if (charFromUser >= 'A' && charFromUser <= 'Z') {
			System.out.println("Character is Upper Case aplhabet character!");
			} else {
			System.out.println("Character is Lower Case aplhabet character!");
		}
	} else {
		 System.out.println("Character is not an aplhabet character!"); 
	   }
  }

}
