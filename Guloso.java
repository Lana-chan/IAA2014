public class Guloso {
  public static void guloso1(Mochila bag) {
    int[] A = new int[bag.itens.length];
    for(int i = 0; i < A.length; i++) A[i] = i; // ids do vetor de itens
    int aux;
    for(int i = 0; i < bag.itens.length - 1 ; i++) {
      if (bag.itens[A[i]].valor/bag.itens[A[i+1]].peso < bag.itens[A[i+1]].valor/bag.itens[A[i+1]].peso) { //ordena o vetor em relação valor/peso
        aux = A[i+1];
        A[i+1] = A[i];
        A[i] = aux;
      }
    }
    for(int i = 0; i < bag.itens.length; i++) { //coloca os itens que foram ordenados dentro da mochila até encher
      bag.carga.add(A[i]);
      if (bag.capacidade - bag.pesoTotal() < 0) {
        bag.carga.remove(i);
        return;
      }
    }
  }
  
  public static void guloso2(Mochila bag) {
    int[] A = new int[bag.itens.length];
    for(int i = 0; i < A.length; i++) A[i] = i; // ids do vetor de itens
    int aux;
    for(int i = 0; i < bag.itens.length - 1 ; i++){
      if (bag.itens[A[i]].peso > bag.itens[A[i+1]].peso){ //ordena o vetor em relação do menor peso para o maior peso, tenta colocar a maior quantidade de itens possiveis na mochila
        aux = A[i+1];
        A[i+1] = A[i];
        A[i] = aux;
      }
    }
    for(int i = 0; i < bag.itens.length; i++){ //coloca os itens que foram ordenados dentro da mochila até encher
      bag.carga.add(A[i]);
      if (bag.capacidade - bag.pesoTotal() < 0){
        bag.carga.remove(i);
        return;
      }
    }
  }
}