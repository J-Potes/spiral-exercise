package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
    	int[][] arr = new int[rows][columns];
    	int cont = 1;
    	int min_x = 0;
    	int min_y = 0;
    	int max_x = columns;
    	int max_y = rows;
    	int mov = 1;
    	
    	int i = min_x;
    	int j = min_y;
    	while(cont <= (rows*columns)) {
    		switch(mov) {
	    		case 1:
        			if(i < max_x) {
        				arr[j][i] = cont;
        				i++;
        			}
        			else {
        				i--;
        				max_x = i;
        				j++;
        				min_y = j;
        				arr[j][i] = cont;
        				j++;
        				mov = 2;
        			}
	        		break;
	        		
	        	case 2:
	        		if(j < max_y) {
	    				arr[j][i] = cont;
	    				j++;
	    			}
	    			else {
	    				j--;
	    				max_y = j+1;
	    				i--;
	    				arr[j][i] = cont;
	    				i--;
	    				mov = 3;
	    			}
	        		break;
	        		
	        	case 3:
	        		if(i >= min_x) {
	    				arr[j][i] = cont;
	    				i--;
	    			}
	    			else {
	    				i++;
	    				min_x = i+1;
	    				j--;
	    				max_y = j+1;
	    				arr[j][i] = cont;
	    				j--;
	    				mov = 4;
	    			}
	        		break;
	        		
	        	case 4:
	        		if(j >= min_y) {
	    				arr[j][i] = cont;
	    				j--;
	    			}
	    			else {
	    				j++;
	    				min_y = j;
	    				i++;
	    				arr[j][i] = cont;
	    				i++;
	    				mov = 1;
	    			}
	        		break;
	        		
    		}
    		cont++;
    	}
    	
        return arr;
    }
}
