/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author HP
 */
public class Q100 {
    public static double distance( int x1, int y1, int x2, int y2 )
	{
            double d ;
            double X = x2 -x1 ;
            double Y = y2 -y1 ;
            d = sqrt((pow(X,2) + pow(Y,2))) ;
            return d ;
	}
    
    public static void main( String[] args )
	{
            System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5)) ;

        }

    
}
