public class Guloso{
  public void Guloso1(Mochila bag){
    Item aux = new Item();
    for(int i = 0; i < bag.itens.length - 1 ; i++){
      if (bag.itens[i].valor/bag.itens[i+1].peso < bag.itens[i+1].valor/bag.itens[i+1].peso){ //ordena o vetor em relação valor/peso
        aux = bag.itens[i+1];
        bag.itens[i+1] = bag.itens[i];
        bag.itens[i]= aux;        
      }
    }
    for(int i = 0; i < bag.itens.length; i++){ //coloca os itens que foram ordenados dentro da mochila até enxer
      bag.carga.add (i);
      if (bag.capacidade - bag.pesoTotal < 0){
        bag.carga.remove (i);
        return;
      }
    }
  }
  public void Guloso2(Mochila bag){
    Item aux = new Item();
    for(int i = 0; i < bag.itens.length - 1 ; i++){
      if (bag.itens[i].peso > bag.itens[i+1].peso){//ordena o vetor em relação do menor peso para o maior peso, tenta colocar a maior quantidade de itens possiveis na mochila
        aux = bag.itens[i+1];
        bag.itens[i+1] = bag.itens[i];
        bag.itens[i]= aux;        
      }
    }
    for(int i = 0; i < bag.itens.length; i++){ //coloca os itens que foram ordenados dentro da mochila até enxer
      bag.carga.add (i);
      if (bag.capacidade - bag.pesoTotal < 0){
        bag.carga.remove (i);
        return;
      }
    }
  }
}