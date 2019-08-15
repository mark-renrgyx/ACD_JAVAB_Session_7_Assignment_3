package week1.day7.assignment3;

public class BuilderCapacity {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(0);
		System.out.println(sb.capacity());
		
		sb.append('a');
		System.out.println(sb.capacity());
		
		sb.append("bc");
		System.out.println(sb.capacity());
		
		sb.append("def");
		System.out.println(sb.capacity());
		
		sb.append("g");
		System.out.println(sb.capacity());
		
		sb.append("ghijklmopqrs");
		System.out.println(sb.capacity());
	}
}
