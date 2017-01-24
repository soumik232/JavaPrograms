/*
 *Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
 *I/P -> N Distinct Coupon Number
 *Logic -> repeatedly choose a random number and check whether it's a new one.
 *O/P -> total random number needed to have all distinct numbers.
 *Functions => Write Class Static Functions to generate random number and to process distinct coupons.
 */
package com.bridgelabz.util;
import java.util.Random;
import com.bridgelabz.couponApp.CouponImpln;
public class CouponTester 
{
	public static void main(String[] args) 
	{
		CouponImpln cp = new CouponImpln();
		cp.generateCoupon();
		System.out.println("Generted coupons......");
		cp.displayCoupon();
	}

}
