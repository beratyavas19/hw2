package demo.junit_class_demo.grades;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import org.jfree.chart.JFreeChart;

public class HistogramGeneratorTes {

	demo.junit_class_demo.grades.HistogramGenerator hg = new demo.junit_class_demo.grades.HistogramGenerator(new demo.junit_class_demo.grades.ChartIO());

	@Test
	public void test_generate_normal() {

	}

	@Test
	public void calculate_frequencies() {
		int[] kontrol={1,2,3,4,5,6,7,8,9,10,11};
		Assert.assertEquals(kontrol,hg.calculateFrequencies(kontrol));
	}
	@Test
	public void test_frequencies() {
		int[] list = {1,2,3,4,5,6,7,8,9,10,11};
		int[] test = {1,1,1,1,1,1,1,1,1,1,1};
		Assert.assertArrayEquals(test, hg.calculateFrequencies(list));
	}


	
}
