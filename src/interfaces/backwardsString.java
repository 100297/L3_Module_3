package interfaces;

public class backwardsString extends SpecialString {

	public backwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String rev = "";
		for (int i = s.length() - 1; i > -1; i--) {
			char a = s.charAt(i);
			rev += a;
		}
		return rev;
	}

}
