import java.util.Vector;

/**
 * Created by Rania on 15/10/2017.
 */
public class Somme2Vect

{
    private int [] vect1;
    private int [] vect2;
    private int [] VectSomme;

   /*  public Somme2Vect (int [] a, int [] b , int [] c )
     {
         a=vect1;
         b=vect2;
         c=VectSomme;

     }
*/
     public Vector<Integer> getSomme (Vector<Integer> a , Vector<Integer> b ,Vector<Integer> c){
        for (int i = 0; i < a.size(); ++i)
        {
            c.add(i, a.get(i)+b.get(i));
        }
        return c;
    }

}
