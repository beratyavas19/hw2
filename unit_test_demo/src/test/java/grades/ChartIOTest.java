package demo.junit_class_demo.grades;

import javafx.scene.chart.Chart;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.rules.ExpectedException;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;

public class ChartIOTest {
	demo.junit_class_demo.grades.ChartIO io = new demo.junit_class_demo.grades.ChartIO();



	@Test
	public void test_readFile_happyPath() {
		int[] a=io.readFile("/Users/macbookpro/Desktop/bil481-hw2-beratyavas19-master-2/BIL481_HW2/project/unit_test_demo/src/main/java/grades/grade.txt");
		Assert.assertNotEquals(0,a.length);
	}
	@Test (expected = IllegalArgumentException.class)
	public void test_readFile_SadPath() {
		io.readFile("asdasfdzad");
	}
	@Test (expected = NumberFormatException.class)
	public void test_wrong_format() {
		io.readFile("/Users/macbookpro/Desktop/bil481-hw2-beratyavas19-master-2/BIL481_HW2/project/unit_test_demo/src/main/java/grades/wrongGrade.txt");
	}


	//write file icin 2 adet test kodu;
	//3 adet Test kodu eklemem gerekiyor.





}