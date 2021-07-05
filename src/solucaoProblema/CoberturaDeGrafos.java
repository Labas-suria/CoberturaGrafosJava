package solucaoProblema;
/***Livro CLRS, Algoritmos Teoria e Prática
34.5.2 O PROBLEMA  DE  COBERTURA  DE  VÉRTICES pg.878***/

/** Clase abstrata que implementa os métodos necessarios para a resolução do problema**/
public abstract class CoberturaDeGrafos {
    //método que recebe como arg um vetor de inteiros e retorna o indice do seu maior valor
    public static int indexMaiorValorVetor(int[] vetor){
        int maior=0,index=0;
        if(vetor!=null){//!!!Só faz a busca se o vetor não for null
            for (int i=0;i<vetor.length;i++){
                if (vetor[i]>=maior){
                    maior=vetor[i];
                    index=i;
                }
            }
        }
        return index;
        /**!!!!!!!!!Problema!!!!!!!
         se o vetor recebido como arg for null, o método retonará 0.
         Siga as recomendações na classe Teste.java**/
    }

    /*método que recebe um objeto do tipo GrafoVetor e retorna uma String com os nomes
    (separados por virgula) dos vertices que fazem a cobertura mais barata do grafo*/
    public static String coberturaBarata(GrafoVetor grafo){
        String coberturaBarata=new String(),vertcMaiorQdt;
        int [] qtdVertNoGrafo;/*vetor de int que será associado ao vetor de vertices do grafo,
        onde cada posição sua é equivalente a mesma posição no vetor dos vertices. Ele receberá
        a quantidade de vezes que cada vértice aparece no grafo*/

        //Apenas se o grafo não for null
        if(grafo!=null){
            qtdVertNoGrafo = new int[grafo.getQtdVertices()];//o momento em que ele é associado ao vetor de vértices!!
            int primeiroIndx, segundoIndx;

            while (!grafo.estaVazio()){//Enquanto o grafo não estiver vazio
                for(int i=0;i<grafo.getQtdArestas();i++){//Laço que percorre as arestas do grafo

                    //se a dupla de vértices da aresta não forem null
                    if(grafo.getArestas()[i][0]!=null&&grafo.getArestas()[i][1]!=null){
                        //procura o indice de cada vertice na aresta da posição 'i' e armazena
                        primeiroIndx = grafo.retornaIndexDoVertice(grafo.getArestas()[i][0]);
                        segundoIndx =  grafo.retornaIndexDoVertice(grafo.getArestas()[i][1]);
                        //para em seguida incrementar sua recorrencia na posição equivalente no
                        // vetor que armazena suas quantidades
                        qtdVertNoGrafo[primeiroIndx]+=1;
                        qtdVertNoGrafo[segundoIndx]+=1;
                    }
                }
                //a variavel recebe a string contendo o nome do vertice que tem maior recorrencia no grafo
                //isso só é posivel devido os vetores das quantidades e de vértices estarem associados.
                /*o método q retorna o inice do maior valor no vetor é passado como indice do vetor de vértice,
                como ambos são equivalentes, os seus indices tambem serão equivalentes*/
                vertcMaiorQdt = grafo.getVertices()[indexMaiorValorVetor(qtdVertNoGrafo)];
                coberturaBarata += (vertcMaiorQdt+", ");//o nome do vetor com maior quantidade, seguido de uma virgula
                // é concatenado a resposta
                grafo.retiraArestaDoGrafo(vertcMaiorQdt);//e finalmente, todas as arestas que possuem esse vertice são
                // removidas do grafo

                for (int j =0;j<qtdVertNoGrafo.length;j++) qtdVertNoGrafo[j]=0;//o vetor das quantiidades é zerado
            }
            return coberturaBarata.substring(0,coberturaBarata.length()-2);//retorna a resposta,
            // retirando do seu final a virgula e o espaço
        }else{
            System.out.println("Grafo vazio...");//Se o grafo for nulo
        }
        return coberturaBarata;//Se o grafor for nulo, retornará uma string vazia
    }
}
