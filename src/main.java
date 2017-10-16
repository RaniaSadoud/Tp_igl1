import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Rania on 15/10/2017.
 */
public class main
{

    public static void main(String[] args)
    {
        /** pour le saisie des vecteurs **/
        System.out.println("Donnez la taille des vecteurs :");
        System.out.println("vecteur1 : ");
        Scanner scanner = new Scanner(System.in);
        int taille = scanner.nextInt();

        /** le vect1 et 2 et le résul**/
        Vector<Integer> Tab1 = new Vector<Integer>();
        Vector<Integer> Tab2 = new Vector<Integer>();
        Vector<Integer> Tab3 = new Vector<Integer>();


        System.out.println("Saisisez les valeurs vect1 :");
        for ( int i = 0 ;  i < taille ; i++)
        {
            Scanner scanner3 = new Scanner(System.in);
            int elem = scanner.nextInt();
            Tab1.add(i,elem);
        }


        System.out.println("vecteur2 :");
        Scanner scanner2 = new Scanner(System.in);
        int taille2 = scanner.nextInt();

        System.out.println("Saisisez les valeurs vect2 :");
        for ( int i = 0 ;  i < taille2 ; i++)
        {
            Scanner scanner3 = new Scanner(System.in);
            int elem = scanner.nextInt();
            Tab2.add(i,elem);
        }

        Vector<Integer> tab = new Vector<Integer>();
        Somme2Vect somme= new Somme2Vect();

         somme.getSomme(Tab1,Tab2,Tab3);

       /*  for ( int j =0 ; j < Tab3.size();j++)
         {
             System.out.print(Tab3.get(j));
         }*/

         System.out.print("le max d'un vecteurs ");
         MaxMin m= new MaxMin();
         MaxMin mi= new MaxMin();



        System.out.print( m.maxVect(Tab1));
        System.out.print("le min d'un vecteurs ");
        System.out.print(mi.minVect(Tab2));

    }
}
