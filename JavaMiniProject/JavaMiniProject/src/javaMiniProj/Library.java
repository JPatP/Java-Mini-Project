package javaMiniProj;

import java.util.ArrayList;

public class Library {
	private ArrayList<References> referenceArray;
	public Library(){
		this.referenceArray = new ArrayList<References>();
	}
	public void addReference(References ref){
		referenceArray.add(ref);
	}
	public void showReferences(){
		for(int i=0; i<referenceArray.size(); i++){
			System.out.println("There is " + i + " item in the array.");
		}
	}
}
