package solucaoProblema;
/**Classe usada para construir objetos do tipo Grafo usando vetores**/
public class GrafoVetor {

    private int qtdVertices;//quantidade de vétices que o grafo possui
    private int qtdArestas;//quantidade de arestas que o grafo possui
    private String [] vertices;//vetor para armazenar os vértices atráves de seus nomes (Strings)
    private String [][] arestas;//Vetor bidimensional para armazenar as duplas de vertices, que representam as arestas

    //método que retorna a quantidade de arestas
    public int getQtdArestas() {
        return this.qtdArestas;
    }

    //método que retorna a quantidade de vértices
    public int getQtdVertices() {
        return qtdVertices;
    }

    //método para setar os vertices do grafo, rebendo um vetor com os nomes dos vértices
    public void setVertices(String[] vertices) {
        //!!!!!só faz isso se o vetor não for null!!!!!
        if(vertices!=null){
            this.vertices = vertices;
            this.qtdVertices= vertices.length;//o valor de qtdVertices é setado apenas aqui
        }
    }

    //método que retorna o vetor de vértices do grafo
    public String[] getVertices() {
        return vertices;
    }

    //método para setar as arestas do grafo, rebendo um vetor bidimensional com as duplas de vértices
    public void setArestas(String[][] arestas) {
        //!!!!!só faz isso se o vetor não for null!!!!!
        if(arestas!=null){
            this.arestas = arestas;
            this.qtdArestas = arestas.length;//o valor de qtdArestas é setado apenas aqui
        }
    }

    //método que retorna o vetor bidimensional que representa as arestas
    public String[][] getArestas() {
        return arestas;
    }

    //método usado para retirar do grafo a aresta que possui o vérticie passado como arg
    public void retiraArestaDoGrafo(String vertice){
        for(int i=0;i<arestas.length;i++){
            for(int j=0;j<arestas[i].length;j++){
                if(arestas[i][j]!=null){
                    if(arestas[i][j]==vertice){
                        arestas[i][0]=null;
                        arestas[i][1]=null;
                        /**a forma utilizada para representar a exclusão de uma aresta
                         foi preecher os valores da dupla de véritces com null **/
                    }
                }
            }
        }
    }

    //método que retorna o índice do vértice recebido como arg, o seu indice no vetor de vértices
    public int retornaIndexDoVertice(String vertice){
        int aux=0;
        for (int i=0;i<vertices.length;i++){
            if (vertice == vertices[i]){
                aux=i;
            }
        }
        return aux;
        /**!!!!!!!!!!Problema!!!!!!!!!
         Se o vertice passado não existir no vetor, ele retornará sempre 0, a primeira posição do vetor
         siga as recomendações na classe Teste.java**/
    }

    //método que retorna true se o grafo estiver vazio, e false se não
    public boolean estaVazio(){
        int numVazios =0;
        if (vertices==null||arestas==null) return true;//se os vértices ou arestas não forem iniciados,
        // o grafo é considerado vazio

        for (int i =0;i<arestas.length;i++){
            if(arestas[i][0]==null && arestas[i][1]==null){
                numVazios++;//contando o numero de arestas apagadas
            }
        }
        if(numVazios== arestas.length) return true;//se o numero de arestas apagadas for igual o numero de arestas,
        // o grafo á considerado vazio

        return false;// caso contrário, ele não está vazio
    }
}
