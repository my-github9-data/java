package com.app.fruits;

	public class Mango extends Fruits {

			public Mango() {
				super("Mango" , true);	
			}

			@Override
			public String taste() {
				return "sweet";
			}

			@Override
			public void accept() {
				super.accept();
			}
			
		}
