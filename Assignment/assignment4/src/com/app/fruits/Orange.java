package com.app.fruits;

public class Orange extends Fruits{

		public Orange() {
			super("Orange" , true);
		}
		
		@Override
		public String taste() {
			return "sour";
		}

		@Override
		public void accept() {
			super.accept();
		}
		

	}
