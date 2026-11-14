package homework;

class EvenDie extends Die {
	
	public void roll() {
		super.roll();
		if (getNumber() % 2 != 0) {
			setNumber(getNumber() + 1);
		}
	}

}
