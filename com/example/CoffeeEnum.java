public enum CoffeeEnum {
	SMALL(10, "A"), NORMAL(20), HUGE(50) {
		// @Override is optional here
		@Override
		public int getSize() {
			return 100;
		}

		// you are not allowed to use override, as this
		// method does not exist in the outer class/enum
		//@Override
		public void saySomething() {
		    System.out.println("I would like to say something: " + this.getSize());
		}

		// you are also override the inherited methods
		public String toString() {
			return "Really Huge";
		}
	};

	private int size;
	private String type;

	// you are not allowed to use public
	// as enum contructor's access modifier
	CoffeeEnum(int size) {
		this.size = size;
	}

	CoffeeEnum(int size, String type) {
		this(size);
		this.type = type;
	}

	public int getSize() {
		return this.size;
	}

	public static void main(String[] args){
		System.out.println("this is a test");
		
		// you are not able to call the inner class's method, which
		// is not a override of existing method
		//System.out.println(CoffeeEnum.HUGE.saySomething());
		System.out.println(CoffeeEnum.HUGE.getSize());

		System.out.println(CoffeeEnum.HUGE);
	}
}
