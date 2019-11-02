package demo.junit_class_demo.grades;

public class HistogramMain {

	public static void main(String[] args) {
		HistogramGenerator hg = new HistogramGenerator(new ChartIO());
		hg.generateHistogram("/Users/macbookpro/Desktop/bil481-hw2-beratyavas19-master-2/BIL481_HW2/project/unit_test_demo/src/main/java/grades/grade.txt", "histogram.jpeg");
		
		System.out.println("Program terminated");
	}

}
