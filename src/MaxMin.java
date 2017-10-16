import java.util.Vector;

/**
 * Created by Rania on 15/10/2017.
 */
public class MaxMin
{

    public int maxVect(Vector<Integer> a)
    {
        int max =0 ;
        for ( int i =0 ; i < a.size() ; i++)
        {
            if ( a.get(i) > max ) max =a.get(i);
        }
        return max;
    }
    public int minVect(Vector<Integer> a)
    {
        int min=a.get(0) ;
        for ( int i =0 ; i < a.size() ; i++)
        {
            if ( a.get(i) < min ) min =a.get(i);
        }
        return min;
    }
}
