public class Guloso {
  public static void guloso1(Mochila bag){
    int[bag.itens.length] A;
    int escolhido;
    for(int i = 0; i < bag.itens.length ; i++){
      for (int j = 0; j < bag.itens.length ; j++){
        if (bag.itens[i].valor/bag.itens[i].peso <= bag.itens[j].valor/bag.itens[j].peso){ //ordena o vetor em relação valor/peso
          A[i]= j;
        } 
      }
    }
    for(int i = 0; i < bag.itens.length; i++){ //coloca os itens que foram ordenados dentro da mochila até encher
      bag.carga.add(A[i]);
      if (bag.capacidade - bag.pesoTotal() < 0){
        bag.carga.remove (i);
        return;
      }
    }
  }
  
  public static void guloso2(Mochila bag){
    int[bag.itens.length] A;
    int escolhido;
    for(int i = 0; i < bag.itens.length ; i++){
      for (int j = 0; j < bag.itens.length ; j++){
        if (bag.itens[i].peso >= bag.itens[j].peso){ //ordena o vetor em relação valor/peso
          A[i]= j;
        }
      }
    }
    for(int i = 0; i < bag.itens.length; i++){ //coloca os itens que foram ordenados dentro da mochila até encher
      bag.carga.add (A[i]);
      if (bag.capacidade - bag.pesoTotal() < 0){
        bag.carga.remove(i);
        return;
      }
    }
  }
}