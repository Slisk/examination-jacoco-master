package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {

	
	@Test
	public void testMethod1() {
		Game game = new Game();
		int i2 = game.calculateOutPutBasedOnNames("Johan", "Moback"); 
		assertEquals("The result should be 0 ", i2, 0); 
		
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva"); 
		assertEquals("The result should be 1", i, 1);
		
		int i3 = game.calculateOutPutBasedOnNames("Moback", "JohanM"); 
		assertEquals("The result should be 2", i3, 2); 
	}
	@Test
	public void TestRun() {
		Game game = new Game(); 
		ArrayList<String> values = new ArrayList<String>(); 
		values.addAll(Arrays.asList("Game", "Johan", "Moback", "M", "20", "Stockholm"));  
		
		game.run(values); 
	}
	
	
	
	@Test
	public void TestGetGenderFromInputValues() {
		Game game = new Game(); 
		ArrayList<String> values = new ArrayList<String>(); 
		values.addAll(Arrays.asList("a", "b", "c", "d", "e", "f")); 
		char result = game.getGenderFromInputValues(values); 
	}
	@Test
	public void TestGetAgeFromInputValues() {
		Game game = new Game(); 
		ArrayList<String> values = new ArrayList<String>(); 
		values.addAll(Arrays.asList("18", "19", "20", "21", "22", "23", "24", "25")); 
		int result = game.getAgeFromInputValues(values); 
	}
	@Test
	public void TestRunGame() {
		Game game = new Game();
		game.runGame("PacMan", "Johan", "Moback", 'M', 20, "Stockholm"); 
	}
	
	
	@Test 
	public void TestCalculateOutPutBasedOnGender() { 
		Game game = new Game(); 
		int i = game.calculateOutPutBasedOnGender('M'); 
		assertEquals("The result should be 0 ", i, 0); 
		
		int i2 = game.calculateOutPutBasedOnGender('F'); 
		assertEquals("The result should be 1", i2, 1); 
		
		int i3 = game.calculateOutPutBasedOnGender('J'); 
		assertEquals("The result should be 2 ", i3, 2); 
	}
	@Test 
	public void TestCalculateOutPutBasedOnAge() {
		Game game = new Game(); 
		int i = game.calculateOutPutBasedOnAge(20); 
		assertEquals("The result should be 0 ", i, 0);     
		
		int i2 = game.calculateOutPutBasedOnAge(100); 
		assertEquals("The result should be 1", i2, 1);  
														
	}
	@Test
	public void TestCalculateOutPutBasedOnHomeCity() {
		Game game = new Game(); 
		int i = game.calculateOutPutBasedOnHomeCity("Alingsås"); 
		assertEquals("The result should be A", i, 0); 
		
		int i2 = game.calculateOutPutBasedOnHomeCity("Borås"); 
		assertEquals("The result should be B", i2, 1); 
		
		int i3 = game.calculateOutPutBasedOnHomeCity("Cypern"); 
		assertEquals("The result should be C", i3, 2); 
		
		int i4 = game.calculateOutPutBasedOnHomeCity("Danderyd"); 
		assertEquals("The result should be D", i4, 3); 
		
		int i5 = game.calculateOutPutBasedOnHomeCity("Eslöv"); 
		assertEquals("The result should be E", i5, 4); 
		
		int i6 = game.calculateOutPutBasedOnHomeCity("Farsta"); 
		assertEquals("The result should be F", i6, 5); 
		
		int i7 = game.calculateOutPutBasedOnHomeCity("Gustavsberg"); 
		assertEquals("The result should be G", i7, 6);
		
		int i8 = game.calculateOutPutBasedOnHomeCity("Högsvred"); 
		assertEquals("The result should be H", i8, 7); 
		
		int i9 = game.calculateOutPutBasedOnHomeCity("IngenStadPåI"); 
		assertEquals("The result should be I", i9, 8);
		
		int i10 = game.calculateOutPutBasedOnHomeCity("Jönköping");  
		assertEquals("The result should be J", i10, 9); 
		
		int i11 = game.calculateOutPutBasedOnHomeCity("Öland"); 
		assertEquals("The result should be -", i11, 10); 
	}
	@Test
	public void TestBuildFinalString() {
		Game game = new Game(); 
	   
	}
	

}
