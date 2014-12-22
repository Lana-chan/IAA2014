import java.util.*;

public class Tentativa {
  public static void tentativa(Mochila bag) {
    List<Integer> melhor = new ArrayList<Integer>();
    int melhorValor = 0;
    
    for(int n = 0; n < Math.pow(2,bag.itens.length); n++) { // roda todas as combinações
      bag.carga.clear(); // começa com mochila vazia
      for(int i = 0; i < bag.itens.length; i++) if((n & (int)Math.pow(2,i)) != 0) bag.carga.add(i); // faz combinação binária
      if(bag.pesoTotal() < bag.capacidade) { // se cabe na mochila
        if(bag.valorTotal() > melhorValor) melhor = new ArrayList<Integer>(bag.carga); // se for melhor que o anterior
      }
    }
    
    bag.carga = melhor;
  }
}