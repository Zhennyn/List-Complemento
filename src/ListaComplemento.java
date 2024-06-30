import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaComplemento {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(0d);
        notas.add(7d);
        notas.add(3.6);

        System.out.println(notas);

        //POSIÇÃO NA TABELA - EM DUVIDA
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        //ADIÇÃO - RELEVANTE
        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
        notas.add(4, 8d);
        System.out.println(notas);

        //SUBSTITUIÇÃO - RELEVANTE
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //VERIFICAÇÃO - RELEVANTE
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        //SÓ UMA GRAÇA PRA DEIXAR UM EM CADA LINHA - RELEVANTE MAS NÃO O SUFICIENTE
        System.out.println("Exiba em ordem de informação:");
        for (Double nota : notas) System.out.println(nota);

        //DIFERENTE DE EXIBIR O INDEX AQUI USAMOS ELE PARA EXIBIR A NOTA - ISSO PODE FACILITAR PROBLEMAS FUTUROS
        System.out.println("Exiba a terceira nota: " + notas.get(2));


        //FRAMEWORK SENDO UTILIZADA - RELEVANTE E NECESSÁRIA PESQUISA
        //OBS: COLLECTIONS NO VSCODE ESTÁ BUGADA NECESSITANDO DE REINICIO IGUAL O PACKAGE
        //DUVIDA: ISSO É UTILIZADO NOS SISTEMAS DE NOTA DE QUALQUER ESCOLA OU NÃO?
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        //CRIAÇÃO DE UMA VARIAVEL DO NADA FUNCIONA NO INTELIJ MAS NO VSCODE É ESTRANHO A FORMA DE CRIAR
        System.out.println("Exiba a soma dos valores: ");
            Iterator<Double> iterator = notas.iterator();
            Double soma = 0d;
            while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma: " + soma);

        //É ESTRANHO DE OLHAR NA PRIMEIRA VEZ MAS DEPOIS ACOSTUMA
        System.out.println("Media: " + (soma/notas.size()));


        //QUASE ESQUEÇO QUE TINHA ADICIONADO E O INDEX É UM A MAIS KKKKKKK
        //METODO DE REMOÇÃO - RELEVANTE MAS PRECISA TOMAR CUIDADO CASO TENHA ALGO ADICIONADO ANTES
        //AÉ TEM COMO FAZER COMO OBJETO TAMBEM
        System.out.println("Removedor de notas: ");
        notas.remove(5);
        notas.remove(0d);
        System.out.println(notas);


        //REM9OÇÃO DE VALORES ESPECIFICOS - RELEVANTE
        System.out.println("Remoção de notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next =iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        
        //CLEAR NORMAL N TEM MUITO O QUE FALAR
        System.out.println("Apague toda lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Lista vazia: " + notas.isEmpty());
    }

}
