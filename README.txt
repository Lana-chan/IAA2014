  Este EP foi escrito em Java SE 7.
  
Arquivos:
  EP.java           - Código principal, declara classes e chama algorítmos de resolução.
  Tentativa.java    - Código do algorítmo de tentativa e erro.
  Guloso.java       - Código dos algorítmos gulosos.
  geraTeste.java    - Gerador de configuração de testes.
  geraDez.bat       - Arquivo de lote para geração de 10 configurações.
  testaDez.bat      - Arquivo de lote para teste de 10 configurações.
  
Para compilar:
    javac EP.java
  
Para rodar:
    java EP [CONFIG]
  Onde [CONFIG] é opcional e refere ao nome de arquivo da configuração de teste.
  Caso não tenha sido passado um arquivo, o programa procura por "config.txt" como padrão.
  
geraTeste:
    javac geraTeste.java
    java geraTeste [N]
  Onde [N] é opcional e refere ao número de ítens a serem gerados na configuração.
  Caso não tenha sido passado um número, o programa gera um número aleatório entre 1 e 20.
  
Alunos:
  Erin Pinheiro Manal           - 8921433
  Thompson Mario Galvao Junior  - 8598753
  Nicolas Leal de Melo	        - 8517223
