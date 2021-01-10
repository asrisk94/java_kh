package com.oop.salary.model;

public abstract class Calculate {
	public static float incentive = 0.5f;	//인센티브 초기값 0.5(변동가능)
	abstract void calc();		//급여계산용
}
