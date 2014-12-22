public class Guloso{
  public Mochila Guloso1(Mochila bag){
    Item aux = new Item();
    for(int i = 0; i < bag.itens.length - 1 ; i++){
      if (bag.itens[i].valor/bag.itens.peso < bag.itens[i+1].valor/bag.itens[i+1].peso){
        aux = A[i+1]
        A[i+1] = A[i]
        A[i]= aux;        
      }
    }
    for(int i = 0; i < bag.itens.length; i++){
      bag.carga.add (i);
      if (bag.capacidade - bag.pesoTotal < 0){
        bag.carga.remove (i);
        return bag;
      }
    }
  }
  public Item[] Guloso2(int peso, Item[] A){
    
  }
}