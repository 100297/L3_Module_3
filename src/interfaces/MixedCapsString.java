package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String rev = "";
		int caps = 1;
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (caps % 2 == 0) {
				a = Character.toUpperCase(a);
			}
			if (caps == 1) {
				a = Character.toLowerCase(a);
			}
			rev += a;
			caps++;
		}
		return rev;
	}

}
