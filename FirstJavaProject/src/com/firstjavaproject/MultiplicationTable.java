/**
 * 
 */
package com.firstjavaproject;

/**
 * @author vjekoslavaleksic
 *
 */
public class MultiplicationTable{
   void print(int p_max) {
	   for (int i=1;i<=p_max;i++) {
		   for (int j=1;j<=p_max;j++) {
		   System.out.printf("%d x %d = %d", i,j,i*j).println();
		   }
	   }
   }
}
