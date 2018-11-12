package lol;

public class Dijkstra {
	
	private int[][] caminosCortos;
	private Grafito gg;

	public Dijkstra(Grafito g) {
		gg = g;
		caminosCortos =  new int[g.getMatriz().length][g.getMatriz().length];
		for (int i = 0; i < caminosCortos.length; i++) {
			for (int j = 0; j < caminosCortos.length; j++) {
				caminosCortos[i][j] = -1;
			}
		}
	}
	
	public void algoritmo() {
		long startTime;
		long endTime;
		startTime = System.currentTimeMillis();
		//TODO
		endTime = System.currentTimeMillis();
		System.out.println("Dijkstra tardó " +(endTime-startTime) + " milisegundos");
	}
}
