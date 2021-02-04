import java.util.Optional;

public class BuiltInFunctionalInterface {

	public static void main(String[] args) {
		String strVar = "Ajay";
		Optional<String> optional = Optional.ofNullable(strVar);
		
		optional.isPresent(); //true
		
		System.out.println(optional.isPresent());
		//System.out.println(optional.get());
		System.out.println(optional.orElse("Replacement String"));
		
		optional.ifPresent(s -> System.out.println(s.charAt(0)));
	}
}



