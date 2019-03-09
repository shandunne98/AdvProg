package com.raeside.family; //Major Eclipse issue with imports, build destinations and or source folders

import com.raeside.family.exceptions.*;
import com.raeside.family.*;

public class MakeFamilyRobinson {

	public static void main(String[] args){
		
		Person member1 = new Person("John","Robinson");
		Person member2 = new Person("Paul","Robinson");
		Person member3 = new Person("Peter","Robinson");
		Person member4 = new Person("Missy","Robinson");
		Person member5 = new Person("John","Robinson");
		Person member6 = new Person("Jessy","James");
		
		Family robinsons = new Family("Robinson");
		
		try {
			robinsons.addFamilyMember(member1);
			robinsons.addFamilyMember(member2);
			robinsons.addFamilyMember(member3);
			robinsons.addFamilyMember(member4);
			robinsons.addFamilyMember(member5);
			robinsons.addFamilyMember(member6);
		}
		catch(FirstNameExistsException ex) {
			ex.printStackTrace();
		}
		catch(SurnameMismatchException ex)
		{
			ex.printStackTrace();
		}
		
		String[] familyList = robinsons.getFamilyMembers();
		
		for(int i=0;i<familyList.length;i++) {
			System.out.println(familyList[i]);
		}

	}

}
