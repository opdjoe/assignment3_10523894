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
public class Q83b {
    public static void main( String[] args )
	{
		double y, y2;

		Q83 gp1 = new Q83(10,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			y = 1*x + 0;
			gp1.drawPoint(x,y);
		}

		Q83 gp2 = new Q83(320,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			y = -7*x - 3;
			gp2.drawPoint(x,y);
		}

		Q83 gp3 = new Q83(630,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			y = 1*x + 0;
			gp3.drawPoint(x,y);
		}

		Q83 gp4 = new Q83(10,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			y = 1*x + 0;
			gp4.drawPoint(x,y);
		}

		Q83 gp5 = new Q83(320,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			y  = 1*x + 0;
			y2 = 1*x + 1;
			gp5.drawPoint(x,y);
			gp5.drawPoint(x,y2);
		}

		Q83 gp6 = new Q83(630,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			y = 1*x + 0;
			gp6.drawPoint(x,y);
		}

	}
    
}
