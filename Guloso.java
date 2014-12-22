public class Guloso {
  public static void guloso1(Mochila bag){
    Item aux = new Item();
    for(int i = 0; i < bag.itens.length - 1 ; i++){
      if (bag.itens[i].valor/bag.itens[i+1].peso < bag.itens[i+1].valor/bag.itens[i+1].peso){
        aux = bag.itens[i+1];
        bag.itens[i+1] = bag.itens[i];
        bag.itens[i] = aux;        
      }
    }
    for(int i = 0; i < bag.itens.length; i++){
      bag.carga.add(i);
      if (bag.capacidade - bag.pesoTotal() < 0){
        bag.carga.remove(i);
        return;
      }
    }
  }
  
  public static void guloso2(Mochila bag){
    Item aux = new Item();
    for(int i = 0; i < bag.itens.length - 1 ; i++){
      if (bag.itens[i].peso > bag.itens[i+1].peso){
        aux = bag.itens[i+1];
        bag.itens[i+1] = bag.itens[i];
        bag.itens[i] = aux;        
      }
    }
    for(int i = 0; i < bag.itens.length; i++){
      bag.carga.add (i);
      if (bag.capacidade - bag.pesoTotal() < 0){
        bag.carga.remove(i);
        return;
      }
    }
  }
}