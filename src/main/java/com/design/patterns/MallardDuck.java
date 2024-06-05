package com.design.patterns;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehaviour = new NoFly();
		quackBehaviour = new Quack();
		// TODO Auto-generated constructor stub
	} 
	public void Display() {
		System.out.println("I am Mallard Duck");
	}
	
}
