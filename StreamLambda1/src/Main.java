import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        List<String> nomes =
                Arrays.asList("Paulo Dick");
        numeros.stream()
                .map(n -> n*2)
                .forEach(System.out::println);
        List<String> nfilter = nomes.stream()
                        .filter(nome ->nome.length()>5)
                        .toList();

        nfilter.forEach(System.out::println);

        List<Integer> numerosDick =
                Arrays.asList(1,2,3,4,5);

        int somaDobroPares = numerosDick.stream()
                .filter(n-> n%2==0)
                .map(n -> n*2)
                .reduce(0,Integer::sum);

        System.out.println(somaDobroPares);

    }
}