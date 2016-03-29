/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3;

/**
 *
 * @author HP
 */
public class Q84 {
    public static void main( String[] args )
	{
		double y;
		double a, h, k;

		Q83 gp1 = new Q83(10,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp1.drawPoint(x,y);
		}

		Q83 gp2 = new Q83(320,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp2.drawPoint(x,y);
		}

		Q83 gp3 = new Q83(630,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp3.drawPoint(x,y);
		}

		Q83 gp4 = new Q83(10,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp4.drawPoint(x,y);
		}

		Q83 gp5 = new Q83(320,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp5.drawPoint(x,y);
		}

		Q83 gp6 = new Q83(630,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp6.drawPoint(x,y);
		}

	}
    
}
