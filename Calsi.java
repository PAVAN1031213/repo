package pattern;

import java.util.Scanner;

//Calculator of percentage to CGPA convertor;

class Calsi {
	float pre;      //pre variable created
	float cgpa;		//cgpa variable created
	
	public float pre(float pre) { 
		return this.pre=pre;
	}
	
	public float cgpa(float cgpa) {
		return this.cgpa=cgpa;
	}
	
	public void display() {			 //disply the result
	double cgpa_result;
		
	if(pre>=0&&pre<100) {			//condition chacking
		cgpa_result=pre/9.5;
		
		System.out.println(pre+"% is converted into cgpa is "+cgpa_result);
	}  
}
	
    public static void main(String[] args)
    {
    	Calsi obj=new Calsi(); 				//object creatated
    	System.out.print("Enter your percentage : ");
    	Scanner sc=new Scanner(System.in); //scanner input from the user
    	obj.pre(sc.nextFloat());
    	obj.display();
       
    }
}