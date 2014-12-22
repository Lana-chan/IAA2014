public class Guloso {
  public static void guloso1(Mochila bag) {
    int[] A = new int[bag.itens.length];
    for(int i = 0; i < A.length; i++) A[i] = i; // ids do vetor de itens
    int aux;
    for(int i = 0; i < bag.itens.length ; i++) {
      for (int j = 0; j < bag.itens.length; j++){
        if (bag.itens[A[i]].valor/bag.itens[A[i]].peso < bag.itens[A[j]].valor/bag.itens[A[j]].peso) { //ordena o vetor em relação valor/peso
          aux = A[j];
          A[j] = A[i];
          A[i] = aux;
        }
      }
    }
    for(int i = 0; i < bag.itens.length; i++) { //coloca os itens que foram ordenados dentro da mochila até encher
      bag.carga.add(A[i]);
      if (bag.capacidade - bag.pesoTotal() < 0) {
        bag.carga.remove(A[i]);
      }
    }
    return;
  }
  
  public static void guloso2(Mochila bag) {
    int[] A = new int[bag.itens.length];
    for(int i = 0; i < A.length; i++) A[i] = i; // ids do vetor de itens
    int aux;
    for(int i = 0; i < bag.itens.length ; i++){
      for (int j = 0; j < bag.itens.length; j++){
        if (bag.itens[A[i]].peso < bag.itens[A[j]].peso){ //ordena o vetor em relação do menor peso para o maior peso, tenta colocar a maior quantidade de itens possiveis na mochila
          aux = A[j];
          A[j] = A[i];
          A[i] = aux;
        }
      }
    }
    for(int i = 0; i < bag.itens.length; i++){ //coloca os itens que foram ordenados dentro da mochila até encher
      bag.carga.add(A[i]);
      if (bag.capacidade - bag.pesoTotal() < 0){
        bag.carga.remove(A[i]);
        return;
      }
    }
  }
}