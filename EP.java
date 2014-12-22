import java.util.*;

class Item { // um ítem
  int valor, int peso;
}

class Mochila {
  int capacidade;
  Item[] itens;
  List<Integer> carga = new ArrayList<Integer>();
  
  // TODO: valor total, peso total
}

class EP {
  Mochila criaMochila(String path) { // lê o arquivo de config, cria uma mochila inteira baseado nele
    Mochila m = new Mochila();
    FileReader file = new FileReader(path);
    BufferedReader fread = new BufferedReader(file);
    String buf; // buffer
    
    buf = fread.readLine(); // linha 1 - capacidade da mochila
    m.capacidade = Integer.parseInt(buf);
    
    buf = fread.readLine(); // linha 2 - número de ítens
    int i = Integer.parseInt(buf);
    m.itens = new Item[i];
    
    for(int n = 0; n < i; n++) { // linhas 3+ - peso, valor
      buf = fread.readLine();
      String[] inp = buf.split(" ");
      Item it = new Item();
      it.peso = Integer.parseInt(inp[0]);
      it.valor = Integer.parseInt(inp[1]);
      Mochila.itens[n] = it;
    }
  }
  
  public static void main(String[] args) {
    String config = args[0];
    
    // TODO: chamar algoritmos
  }
}