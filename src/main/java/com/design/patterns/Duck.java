package com.design.patterns;

public class Duck {
	public FlyBehaviour flyBehaviour;
	public QuackBehaviour quackBehaviour;
	
	public void performFly() {
		flyBehaviour.fly();
	}
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour= qb;
	}
	
}
