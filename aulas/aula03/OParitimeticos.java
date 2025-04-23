package aula03;

public class OParitimeticos {
   public static void main(String[] args){
    // + - / *  ---> operadores basicos
    int n1 = 10;
    int n2 = 20;
    System.out.println(n2 + n1);

    //  % --> operador de resto da divisao
int res = 21 % 2;
System.out.println(res);

// <> <= => >= == !=
// != --> diferente
boolean isDezMaiorQueVinte = 10 > 20;
boolean isDezMenorQueVinte = 10 < 20;
boolean isDezIgualVinte = 10 == 20;
System.out.println("isDezmaiorQuevinte " + isDezMaiorQueVinte);
System.out.println("isDezmaiorQuevinte " + isDezMenorQueVinte);
System.out.println("isDezmaiorQuevinte " + isDezIgualVinte);



var nome = "ola";
int id = 17;
var frase = String.format("Meu nome é %s e eu tenho %d anos", nome, id);
System.out.println(frase);
   }
}




// tipos de format para facilitar a digitação:

/*
  %s            | String                       | "João"                     |
| %d            | Inteiro decimal              | 25                         |
| %f            | Número decimal (float/double)| 3.14                       |
| %.2f          | Decimal com 2 casas decimais | 3.14, 2.00                 |
| %c            | Caractere único              | 'A'                        |
| %b            | Booleano                     | true                       |
| %n            | Quebra de linha              | (como "\n")                |
| %%            | Símbolo de porcentagem       | %                          |

 */