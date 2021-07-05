package solucaoProblema;
/**Classe onde são feitos os teste utilizando alguns grafos**/
public class Teste {
    public static void main(String[]args){

        //Grafo 1
        GrafoVetor grafo = new GrafoVetor();
        String[]vertices= {"a","b","c","d"};
        grafo.setVertices(vertices);
        String[][] arestas = {{"a","b"},{"b","c"},{"c","d"},{"d","a"},{"a","c"}};
        grafo.setArestas(arestas);
        System.out.println("Vertices para cobertura mais barata: "+ CoberturaDeGrafos.coberturaBarata(grafo));
        /** Note que as arestas e os vértices foram setados de vetores completamente diferentes,
         o recomendado é utilizar o vetor de vétices para setar o de arestas, isso previnirá erros na execução,
         apesar de mais complicado**/

        /*//Grafo 2
        GrafoVetor grafo = new GrafoVetor();
        String[]vrtcs= {"a","b","c","d","e","f","g"};
        grafo.setVertices(vrtcs);
        String[][] arestas = {{vrtcs[0],vrtcs[1]},{vrtcs[1],vrtcs[2]},{vrtcs[2],vrtcs[3]},{vrtcs[3],vrtcs[4]},
                {vrtcs[4],vrtcs[2]},{vrtcs[4],vrtcs[5]},{vrtcs[5],vrtcs[3]},{vrtcs[3],vrtcs[6]}};
        grafo.setArestas(arestas);
        System.out.println("Vertices para cobertura mais barata: "+ CoberturaDeGrafos.coberturaBarata(grafo));*/
        /**Como feito neste exemplo**/

        /**Para o restante, usarei a forma não recomendada, mas só pq tenho certeza de que os valores estão
         todos corretos :) */

       /* //Grafo 3
        GrafoVetor grafo = new GrafoVetor();
        String[]vertices= {"a","b","c","d"};
        grafo.setVertices(vertices);
        String[][] arestas = {{"a","b"},{"b","c"},{"c","d"},{"d","b"}};
        grafo.setArestas(arestas);
        System.out.println("Vertices para cobertura mais barata: "+ CoberturaDeGrafos.coberturaBarata(grafo));*/

       /* //Grafo 4
        GrafoVetor grafo = new GrafoVetor();
        String[]vertices= {"a","b","c","d","e","f","g","h","i","j","k"};
        grafo.setVertices(vertices);
        String[][] arestas = {{"a","b"},{"b","c"},{"b","d"},{"b","e"},{"e","f"},{"e","g"},{"e","h"},{"h","i"},{"h","j"},{"h","k"}};
        grafo.setArestas(arestas);
        System.out.println("Vertices para cobertura mais barata: "+ CoberturaDeGrafos.coberturaBarata(grafo));*/


    }
}
