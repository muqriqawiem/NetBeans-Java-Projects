/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_8;

/**
 *
 * @author Muqri Qawiem
 */
public class Vertex<T extends Comparable<T>, N extends Comparable<N>> {

    T vertexInfo;
    int indeg;
    int outdeg;
    Vertex<T, N> nextVertex;
    Edge<T, N> firstEdge;

    public Vertex() {
        this(null, null);
    }

    public Vertex(T vertexInfo, Vertex<T, N> nextVertex) {
        this.vertexInfo = vertexInfo;
        this.indeg = 0;
        this.outdeg = 0;
        this.nextVertex = nextVertex;
        this.firstEdge = null;
    }
}
