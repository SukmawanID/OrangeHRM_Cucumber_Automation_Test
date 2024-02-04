package Automation.Selenium.sukmawan;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SeleniumSeason2Part1Episode1TestNGArrayList {
	@Test
	public void regular() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Adam");
	names.add("Angga");
	names.add("dhawy");
	names.add("Agung");
	names.add("Azmi");
	names.add("Wawan");
	
	int count= 0;
	
	for (int i=0; i<names.size();i++) {
		String actual = names.get(i);
		if(actual.startsWith("A")) {
			count++;
		}
	}
	System.out.println("Test Case 1");
	System.out.println("Count all names start with A");
	System.out.println("Names with A are "+count);
	System.out.println("-----------------");
	}
	
	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Angga");
		names.add("Dhawy");
		names.add("Agung");
		names.add("Azmi");
		names.add("Wawan");
		
		Long nameswithA = names.stream().filter(s->s.startsWith("A")).count();
		Long nameswithD = names.stream().filter(s->s.startsWith("D")).count();
		Long nameswithW = names.stream().filter(s->s.startsWith("W")).count();
		
		System.out.println("Test Case 2");
		System.out.println("Count all names start with A");
		System.out.println("Names with A are "+nameswithA+" with Stream filter");
		System.out.println("-----------------");
		System.out.println("Test Case 3");
		System.out.println("Count all names start with D");
		System.out.println("Names with D are "+nameswithD+" with Stream filter");
		System.out.println("-----------------");
		System.out.println("Count all names start with W");
		System.out.println("Test Case 4");
		System.out.println("Names with W are "+nameswithW+" with Stream filter");
		System.out.println("-----------------");
	}
	@Test
	public void streamFilterName() {
		String name = "Sukmawan";
		String nameLowerCase = name.toLowerCase();
		String nameUpperCase = name.toUpperCase();
		Long countofW = nameLowerCase.chars().filter(ch->ch=='w').count();
		Long countofa = nameLowerCase.chars().filter(ch->ch=='a').count();
		Long countofA = nameUpperCase.chars().filter(ch->ch=='A').count();
		System.out.println("Test Case 5");
		System.out.println("Count char names start with a");
		System.out.println("Count of a in "+name+" are "+countofa);
		System.out.println("-----------------");
		System.out.println("Test Case 6");
		System.out.println("Count char names start with A");
		System.out.println("Count of A in "+name+" are "+countofA);
		System.out.println("-----------------");
	}
	@Test
	public void streamFilterGroupName() {
		Long groupName = Stream.of("Adam","Angga","Dhawy","Azmi","Agung","Wawan").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println("Test Case 7");
		System.out.println("Find group names start with A");
		System.out.println("Group Names start with A are "+groupName);
		System.out.println("-----------------");
		
	}
	@Test
	public void streamWithForEach() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("Angga");
		names.add("Dhawy");
		names.add("Agung");
		names.add("Azmi");
		names.add("Wawan");
		System.out.println("Test Case 8");
		System.out.println("Length names more than 4");
		names.stream().filter(s->s.length()>4).forEach(s->
		System.out.println("Length names more than 4 is "+ s));
		System.out.println("-----------------");
	}
	
	@Test
	public void streamMap() {
		System.out.println("Test Case 9");
		System.out.println("Find names end with n and translate to Uppercase");
		Stream.of("Adam","Angga","Dhawy","Azmi","Agung","Wawan","Hilmi").filter(s->s.endsWith("n"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println("My name is "+s));
		System.out.println("-----------------");
		System.out.println("Test Case 10");
		System.out.println("Find names start with A and translate to Uppercase");
		Stream.of("Adam","Angga","Dhawy","Azmi","Agung","Wawan","Hilmi").filter(s->s.startsWith("A"))
		.map(s->s.toUpperCase()).forEach(s->System.out.println("My name is "+s));
		System.out.println("-----------------");
		System.out.println("Test Case 11");
		System.out.println("Find names start with A and translate to Uppercase as well as sorted");
		List<String> listNames = Arrays.asList("Adam","Angga","Dhawy","Azmi","Agung","Wawan","Hilmi");
		listNames.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("-----------------");
	}
	
	@Test
	public void mergearrayList() {
		ArrayList<String> listNameOthers = new ArrayList<String>();
		listNameOthers.add("Adryan");
		listNameOthers.add("Arjun");
		listNameOthers.add("Michael");
		listNameOthers.add("Danang");
		System.out.println("Test Case 12");
		System.out.println("Find merge list names and sorted");
		List<String> listNames = Arrays.asList("Adam","Angga","Dhawy","Azmi","Agung","Wawan","Hilmi");

		Stream<String> listAllNames = Stream.concat(listNameOthers.stream(), listNames.stream()); 
		listAllNames.sorted().forEach(s->System.out.println(s));
		System.out.println("-----------------");
	}
	
	@Test
	public void validateArrayList() {
		ArrayList<String> listNameOthers = new ArrayList<String>();
		listNameOthers.add("Adryan");
		listNameOthers.add("Arjun");
		listNameOthers.add("Michael");
		listNameOthers.add("Danang");
		System.out.println("Test Case 13");
		System.out.println("Find Adam in list");
		List<String> listNames = Arrays.asList("Adam","Angga","Dhawy","Azmi","Agung","Wawan","Hilmi");

		Stream<String> listAllNames = Stream.concat(listNameOthers.stream(), listNames.stream());
		boolean findNames = listAllNames.anyMatch(s->s.equals("Adam"));
		
		// Recreate the stream before the second anyMatch operation
        listAllNames = Stream.concat(listNameOthers.stream(), listNames.stream());
        
		boolean flag = listAllNames.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println("There is name for "+ findNames+" is "+flag);
		Assert.assertTrue(flag);
		System.out.println("-----------------");
	}
	
	@Test
	public void validateArrayListandFindNames() {
		ArrayList<String> listNameOthers = new ArrayList<String>();
		listNameOthers.add("Adryan");
		listNameOthers.add("Arjun");
		listNameOthers.add("Michael");
		listNameOthers.add("Danang");
		System.out.println("Test Case 14");
		System.out.println("Find Adam in list");
		List<String> listNames = Arrays.asList("Adam","Angga","Dhawy","Azmi","Agung","Wawan","Hilmi");

		Stream<String> listAllNames = Stream.concat(listNameOthers.stream(), listNames.stream());
		
		boolean flag = listAllNames.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println("There is name for adam is "+flag);
		Assert.assertTrue(flag);
		System.out.println("-----------------");
	}
	
	@Test
	public void streamCollect() {


		List<String> listNames = Arrays.asList("Adam","Angga","Dhawy","Azmi","Agung","Wawan","Hilmi");
		List<String> filteredAndSortedNames = listNames.stream().filter(s->s.endsWith("n")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Test Case 15");
		System.out.println("Find names end with n");
		System.out.println(filteredAndSortedNames);
		System.out.println("-----------------");
	}
	
	@Test
	public void findValues() {
		System.out.println("Test Case 15");
		System.out.println("remove double value");
		List<Integer> values = Arrays.asList(3,2,2,1,7,7,8,8,9,6,5,4);
		values.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("-----------------");
		System.out.println("Test Case 16");
		System.out.println("finding number 3 in values");
		List<Integer> list = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(list.get(2));
		System.out.println("-----------------");
		
		
	}
}
