package project;

public class ValiedPassword {
	
	public static boolean inValid(String password) {
		
		if(!((password.length()>=8)&&(password.length()<=15))) {
			return false;
		}
		
		if(password.contains(" ")) {
			return false;
		}
		
		if(true) {
			int count=0;
			
			for(int i=0; i<=9; i++) {
				
				String str=Integer.toString(i);
				if(password.contains(str)) {
					count=1;
				}
			}
			if(count==0) {
				return false;
			}
		}
		
		if(!(password.contains("@") || password.contains("#")
	              || password.contains("!") || password.contains("~")
	              || password.contains("$") || password.contains("%")
	              || password.contains("^") || password.contains("&")
	              || password.contains("*") || password.contains("(")
	              || password.contains(")") || password.contains("-")
	              || password.contains("+") || password.contains("/")
	              || password.contains(":") || password.contains(".")
	              || password.contains(", ") || password.contains("<")
	              || password.contains(">") || password.contains("?")
	              || password.contains("|"))) {
			
			return false;
			
		}
		if(true) {
			
			int count=0;
			
			for(int i=65; i<=95; i++) {
				
				char c=(char)i;
				
				String str1= Character.toString(c);
				if(password.contains(str1)) {
					count=1;
				}
			}
			if(count==0) {
				return false;
			}
		}
		
if(true) {
			
			int count=0;
			
			for(int i=97; i<=122; i++) {
				
				char c=(char)i;
				
				String str1= Character.toString(c);
				if(password.contains(str1)) {
					count=1;
				}
			}
			if(count==0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {

		String password1="PavanSoma@123";
		
		if(inValid(password1)) {
			System.out.println(password1+" is valid password");
		}
		else {
			System.out.println(password1+" is invalid password");

		}
	}

}
