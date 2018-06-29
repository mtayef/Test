public class GenericTest {

	public static void main(String[] args) {
		
		System.out.println(add(5.0,6.0f));
	}

	
	public static <T extends Number> double add (T one, T two)
	{
	    return one.doubleValue() + two.doubleValue(); 
	}
}
