package study;

class OddDie extends Die {
	
	public void roll() {
		super.roll();
		if (getValue() % 2 != 1) {
			setValue(getValue() + 1);
		}
	}

}
