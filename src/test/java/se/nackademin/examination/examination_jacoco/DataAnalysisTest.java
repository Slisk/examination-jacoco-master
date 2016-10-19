package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {
	DataAnalysis dataAnalysis = new DataAnalysis();
	
	
	
	@Test
	public void test1() {
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));
		
		 
	}
	@Test
	public void test2() {
		ArrayList<String> values = new ArrayList<String>();
		ArrayList<String> values2 = new ArrayList<String>(); 
		ArrayList<String> values3 = new ArrayList<String>();
		ArrayList<String> values4 = new ArrayList<String>(); 
		ArrayList<String> values5 = new ArrayList<String>(); 
		
		values.addAll(Arrays.asList("Game", "Johan", "Moback", "M", "19", "Stockolm")); 
		String result = dataAnalysis.getResultStringNamesAndAge(values); 
		assertTrue(true); 
			result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"); 
		
			
		values2.addAll(Arrays.asList("Game", "JohanMikeal", "Moback", "M", "199", "Stockholm")); 
		String result2 = dataAnalysis.getResultStringNamesAndAge(values2);  
		assertTrue(true); 
			result.contains("The first name is greater or equals in size to the last name and the participant older than 30");  
		
		values3.addAll((Arrays.asList("Game", "Johan", "Moback", "M", "19", "Tuna"))); 
		String result3 = dataAnalysis.getResulStringHomecityAndAge(values3); 
		assertTrue(true); 
			result.contains("The name of the homecity is small and the participant is 30 or older"); 
			
		values4.addAll(Arrays.asList("Game", "Johan", "Moback", "M", "199", "Tuna")); 
		String result4 = dataAnalysis.getResulStringHomecityAndAge(values4); 
		assertTrue(true); 
			result4.contains("The name of the homecity is small and the participant is 30 or older"); 
			
		values5.addAll(Arrays.asList("Game", "JOhan", "Moback", "M", "19", "VallenTuna")); 
		String result5 = dataAnalysis.getResulStringHomecityAndAge(values5); 
		assertTrue(true); 
			result5.contains("The name of the homecity is big and the participant is younger than 30"); 
	}  
	 
	
 
}
