import java.util.*;
import java.io.*;

class Item { // um ítem
  int valor, peso;
}

class Mochila {
  int capacidade;
  static Item[] itens;
  List<Integer> carga = new ArrayList<Integer>();
  
  int pesoTotal() { // retorna peso total dentro da mochila
    int p = 0;
    for(int i : this.carga) p += this.itens[i].peso;
    return p;
  }

  int valorTotal() { // retorna valor total dentro da mochila
    int v = 0;
    for(int i : this.carga) v += this.itens[i].valor;
    return v;
  }
}

class EP {
  static Mochila criaMochila(String path) { // lê o arquivo de config, cria uma mochila inteira baseado nele
    Mochila m = new Mochila();
    
    try {
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
    } catch(FileNotFoundException fnfe) { 
      System.out.println(fnfe.getMessage());
    } catch(IOException io) {
      System.out.println(io.getMessage());
    }
    
    return m;
  }
  
  public static void main(String[] args) {
    String config;
    if(args.length > 0) config = args[0];
    else config = "config.txt";
    
    long runTime;
    double valorOtimo;
    
    Mochila m1 = criaMochila(config);
    runTime = System.nanoTime();
    Tentativa.tentativa(m1);
    runTime = (System.nanoTime() - runTime);
    System.out.println("Tentativa e erro: " + m1.carga + " " + m1.pesoTotal() + " " + m1.valorTotal());
    System.out.println("Tempo: " + runTime/1000000.0 + "ms");
    valorOtimo = m1.valorTotal();
    //valorOtimo = 160;
    
    Mochila m2 = criaMochila(config);
    runTime = System.nanoTime();
    Guloso.guloso1(m2);
    runTime = (System.nanoTime() - runTime);
    System.out.println("Guloso 1: " + m2.carga + " " + m2.pesoTotal() + " " + m2.valorTotal());
    System.out.println("Tempo: " + runTime/1000000.0 + "ms Aproveitamento: " + (m2.valorTotal()/valorOtimo)*100.0 + "%");
    
    Mochila m3 = criaMochila(config);
    runTime = System.nanoTime();
    Guloso.guloso2(m3);
    runTime = (System.nanoTime() - runTime);
    System.out.println("Guloso 2: " + m3.carga + " " + m3.pesoTotal() + " " + m3.valorTotal());
    System.out.println("Tempo: " + runTime/1000000.0 + "ms Aproveitamento: " + (m3.valorTotal()/valorOtimo)*100.0 + "%");
  }
}