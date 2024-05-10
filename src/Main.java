import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        // Obtendo a classe Tabela
        Class<Tabela> tabelaClass = Tabela.class;

        // Verificando se a anotação TabelaValores está presente na classe Tabela
        if (tabelaClass.isAnnotationPresent(TabelaValores.class)) {

            // Obtive a instância da anotacao @TabelaValores da classe Tabela
            TabelaValores tabelaValores = tabelaClass.getAnnotation(TabelaValores.class);

            System.out.println(tabelaValores);

            // Valores impressos
            System.out.println("Nome da tabela: " + tabelaValores.nome());
            System.out.println("Linha: " + tabelaValores.linha());
            System.out.println("Coluna: " + tabelaValores.coluna());
            System.out.println("Valor: " + tabelaValores.valor());
        } else {
            System.out.println("A anotação @TabelaValores não está presente na classe Tabela.");
        }
        }
    }
