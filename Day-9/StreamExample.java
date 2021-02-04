import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamExample {

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

		// Stream x = (Stream) strCollection.stream();

		// Filter
		System.out.println("\n Filtered collection");
		strCollection.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);

		// Sorted
		System.out.println("\n Sorted collection");
		strCollection.stream().filter(s -> s.startsWith("a")).sorted().forEach(System.out::println);

		// Map (transformation)
		System.out.println("\n Map (transformation) of collection");
		strCollection.stream().map(s -> s.toUpperCase()).forEach(str -> System.out.println(str));

		// Match
		System.out.println("\n Match element in a collection");
		boolean anyStringStartsWithA = strCollection.stream().anyMatch(s -> s.startsWith("z"));
		System.out.println(anyStringStartsWithA);

		// Count
		System.out.println("\n Match element in a collection");
		long countStrStartingWithA = strCollection
											.stream()
											.filter(s -> s.startsWith("a"))
											.count();
		System.out.println(countStrStartingWithA);
		
		//Reduce
		List<String> emptyCollection = new ArrayList<>();
		System.out.println("\n Reduce operation in a collection");
		Optional<String> reducedString = emptyCollection.stream()
				.sorted()
				.reduce((s1, s2) -> s1 + ',' + s2);
		System.out.println(reducedString);
		
	}

}
