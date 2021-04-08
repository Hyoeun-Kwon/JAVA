package com.javalec.base;



public abstract class Menu {

	
		//Field
		public int rice;
		public int bulgogi;
		public int banana;
		public int milk;
		public int almond;
		
		
		//Constructor
		public Menu() {
			// TODO Auto-generated constructor stub
		}


		public Menu(int rice, int bulgogi, int banana, int milk, int almond) {
			super();
			this.rice = rice;
			this.bulgogi = bulgogi;
			this.banana = banana;
			this.milk = milk;
			this.almond = almond;
		}
		
		
		//Method
		public abstract int calc();
		
		
		

}
