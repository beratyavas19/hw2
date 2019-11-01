package demo.junit_class_demo.grades;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import org.jfree.chart.JFreeChart;

public class HistogramGeneratorTest {

	demo.junit_class_demo.grades.HistogramGenerator hg = new demo.junit_class_demo.grades.HistogramGenerator(new demo.junit_class_demo.grades.ChartIO());

	@Test
	public void test_generate_normal() {
		hg.generateHistogram("/Users/macbookpro/Desktop/bil481-hw2-beratyavas19-master-2/BIL481_HW2/project/unit_test_demo/src/main/java/grades/grade.txt","olusan");
	}
	@Test
	public void test_frequencies() {
		int[] list = {0,1,2,3,4,5,6,7,8,9,10};
		int[] test=	{1,1,1,1,1,1,1,1,1,1,1};
		Assert.assertArrayEquals(test, hg.calculateFrequencies(list));
	}
	@Test
	public void test_creatChart() {
		int[] list = {0,1,2,3,4,5,6,7,8,9,10};
		JFreeChart dizi=hg.createChart(list);

	}
	@Test
	public void test_exportChart(){
		int[] list = {0,1,2,3,4,5,6,7,8,9,10};
		hg.exportChart("exportchart",hg.createChart(list));

	}


	
}
