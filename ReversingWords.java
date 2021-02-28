package Basic;

public class ReversingWords {

		public static void main(String[] args) {
			String reg = "today is May 31st 2017";
			StringBuilder sb = new StringBuilder();
			sb.append(reg);
			String reverse = sb.reverse().toString();
			System.out.println(reg);
			System.out.println(reverse);
		}
}
