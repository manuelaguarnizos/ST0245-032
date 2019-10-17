/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

/**
 *
 * @author jroldan11
 */
public class par//que no tiene nada de par
{
    private int source;
    private int weight;
    private int destination;
    public par(int e,int c,int d)
    {
        source=e;
        weight=c;
        destination=d;
    }

    public int getSource() {
        return source;
    }

    public int getWeight() {
        return weight;
    }

    public int getDestination() {
        return destination;
    }

    
    
}