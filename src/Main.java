import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));

        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta no conjunto: "+notas.contains(5.0));
        System.out.println("exiba a menor nota: "+ Collections.min(notas));
        System.out.println("exiba a maior nota: "+ Collections.max(notas));

        Iterator<Double> interated = notas.iterator();
        double soma =0d;
        while (interated.hasNext()){
            double val = interated.next();
            soma += val;
        }

        System.out.println("soma dos valores: "+ soma);
        System.out.println("media dos valores: "+ (soma/notas.size()));

        System.out.println("remova a nota 0.0 ");
        notas.remove(0d);
        System.out.println(notas.toString());

        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            double next = iterator.next();
            if (next < 7){
                iterator.remove();
            }
        }

        System.out.println("remova as notas menores que 7");
        System.out.println(notas.toString());

        System.out.println("exiba as notas na ordem que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2.toString());

        System.out.println("Exiba as notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague o conjunto ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Verifique se o conjunto está vazio: "+ notas.isEmpty());




    }
}