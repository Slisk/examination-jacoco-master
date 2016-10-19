package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	@Test
	public void testAgeGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);
	} 
	@Test
	public void testResultForGender() {
		ResultFromInputs resultFromInputs = new ResultFromInputs(); 
		resultFromInputs.setResultForGender(10);
		assertEquals("The result should be 10", resultFromInputs.getResultForGender(), 10); 
	}
	@Test
	public void testResultForAge() {
		ResultFromInputs resultFromInputs = new ResultFromInputs(); 
		resultFromInputs.setResultForAge(20);
		assertEquals("The result should be 20", resultFromInputs.getResultForAge(), 20); 
	}
	@Test
	public void testResultForHomeCity() {
		ResultFromInputs resultFromInputs = new ResultFromInputs(); 
		resultFromInputs.setResultForHomeCity(20);
		assertEquals("The result should be 20", resultFromInputs.getResultForHomeCity(), 20); 
	}

}
