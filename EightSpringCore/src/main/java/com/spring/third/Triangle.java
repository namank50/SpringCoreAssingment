package com.spring.third;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class Triangle {

	private Point A;
	private Point C;
	private Point B;

	@Required
	public Point getA() {
		return A;
	}

	public void setA(Point a) {
		A = a;
	}

	public Point getC() {
		return C;
	}

	public void setC(Point c) {
		C = c;
	}

	public Point getB() {
		return B;
	}

	public void setB(Point b) {
		B = b;
	}

	public void draw() {
		System.out.println("Point A = " + getA().getX() + "," + getA().getY());
		System.out.println("Point B = " + getB().getX() + "," + getB().getY());
		System.out.println("Point C = " + getC().getX() + "," + getC().getY());

	}

	public void pa() {
		System.out.println("Init method called by XML");
	}

	public void pc() {
		System.out.println("In destroy method called by XML");
	}

	@PostConstruct
	public void p() {
		System.out.println("In post construct method");
	}

	@PreDestroy
	public void pz() {
		System.out.println("In pre destroy method");
	}

}
