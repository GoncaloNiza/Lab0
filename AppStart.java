
/**
 * Write a description of class AppStart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppStart
{
    
    public static void main(String args[]) {
        int ordem = 1;
        String name = "MEDIUM ";
        Size Medium = Size.MEDIUM;
        System.out.println("Name: " + name );
        System.out.println("tostring(): " + Medium.toString());
        System.out.println("Ordem: " + ordem);
        System.out.println("Valor Minimo: " + Medium.getMinValue());
        System.out.println("Valor Maximo: " + Medium.getMaxValue());
        System.out.println("Codigo: " + Medium.getCode());
    }
}
