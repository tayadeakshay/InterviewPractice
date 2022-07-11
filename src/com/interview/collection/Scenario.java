package com.interview.collection;

import java.util.function.Function;
import java.util.function.Predicate;

public class Scenario {
static Function<Integer,Integer> f = i -> i*i;
public static void main(String[] args) {
	System.out.println(f.apply(4));

Predicate<Integer> p=j -> j%2 ==0;
System.out.println(p.test(60));

}
}
@FunctionalInterface
interface Inter
{
	public void m1();
	public static void m11()
	{
		
	}
}
//@FunctionalInterface
interface Inter2 extends Inter
{
	public void m2();
}