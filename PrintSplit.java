package Day3;

public class PrintSplit {
	public static void main(String[]args) {
		String brands = "Lenovo@Dell@Hp@Acer";
		String[] words = brands.split("@");
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		System.out.println(words[3]);
		
	}

}
