package lol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Grafito {
	
	private int[][] caminos;
	
	public Grafito(String entrada) {
		
		try {
    		File f = new File(entrada);
    		BufferedReader laptmporfin = new BufferedReader(new FileReader(f));
    		String ln = laptmporfin.readLine();
    		String[] num = ln.split("\t");
    		caminos = new int[num.length][num.length];
    		int i = 0;
    		while(ln != null){
    				
    				for (int j = 0; j < num.length; j++) {
					
    					caminos[i][j] = Integer.parseInt(num[j]);
    					
					}
    				ln = laptmporfin.readLine();
    				if(ln != null) num = ln.split("\t");
    				i++;
    			}
    		laptmporfin.close();
			
				
		}catch(Exception e) {
			System.out.println("Haha");
		}
	}
	
	public int[][] getMatriz(){
		return caminos;
	}
	
	public static void main(String[] args) {
		
		Grafito g = new Grafito("./data/matriz3.txt");
		System.out.println(g.getMatriz()[999][998]);
	}

}
