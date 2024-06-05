package com.design.patterns;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck MD = new MallardDuck();
		MD.performFly();
		MD.performQuack();
		MD.setFlyBehaviour(new FlyWithWings());
		MD.performFly();
		MD.Display();
	}

}
