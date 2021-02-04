import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		List<String> strCollection = new ArrayList<>();
		strCollection.add("ddd2");
		strCollection.add("aaa2");
		strCollection.add("bbb1");
		strCollection.add("aAa1");
		strCollection.add("bBb3");
		strCollection.add("ccc");
		strCollection.add("bbb2");
		strCollection.add("ddd1");
		
		long startTime = System.nanoTime();
		
		//Operation
		long cnt = strCollection
			.parallelStream()
			.sorted()
			.count();
		
		long endTime = System.nanoTime();
		
		long milliSecTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
		
		System.out.println("The time taken to execute the operation is :: " + milliSecTime);
		
		//Parallel sort + count   - 64 ms
		//sequential sort + count - 66 ms
	}
}
