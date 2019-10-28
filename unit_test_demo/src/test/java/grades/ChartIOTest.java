package demo.junit_class_demo.grades;

import org.jfree.chart.ChartUtils;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.rules.ExpectedException;

public class ChartIOTest {

	ChartIO io = new ChartIO();

	@Test
	public void test_readFile_happyPath() {

	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_readFile_SadPath() {
		io.readFile("asdasfdzad");
	}
	@Test (expected = NumberFormatException.class)
	public void test_wrong_format() {
		io.readFile("/Users/macbookpro/Desktop/bil481-hw2-beratyavas19-master-2/BIL481_HW2/project/unit_test_demo/src/main/java/grades/wrongGrade.txt");
	}





}
