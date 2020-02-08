package posJava;

public class Valores implements ValoresITF {
	
	int[] arr = new int[10];

	@Override
	public boolean ins(int v) {
		int indice = indiceVazio();
		if(indice != -1 && v > 0) {
			arr[indice] = v;
			return true;
		}
		return false;
	}

	@Override
	public int del(int i) {
		if(size() == 0) {
			return -1;
		}
		if(i >= 0 && i < 10) {
			int valorRemovido = arr[i];
			arr[i] = 0;
			return valorRemovido;	
		}
		return -1;
	}

	@Override
	public int size() {
		int size = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] != 0) {
				size++;
			}
		}
		return size;
	}
	
	public int indiceVazio() {
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public void toStringln() {
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
