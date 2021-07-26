package IntroduçãoAoJUnit5;

public class TesteIngenuoCalculadora {
    public static void main(String [] args) {

        Calculadora calculadora = new Calculadora();

        if (temErroNaSoma(calculadora)) {
            System.exit(1);
        }

        if (subtracaoEstaOk(calculadora) == false ) {
            System.out.println("\n\n## Houve um erro  na validação da soma ##\n\n");
            System.exit(1);
        }

        System.out.println("\n\n==> Todos os testes passaram <==");
        System.exit(0);
    }

    private static boolean temErroNaSoma(Calculadora calc) {
        boolean temErro = false;
        if (calc.soma(2,2) != 4) {
            temErro = true;
        }
        if (calc.soma(2,-2) !=0) {
            temErro = true;
        }
        if (calc.soma(-2,2) !=0) {
            temErro = true;
        }
        if (calc.soma(-2,-2) != -4) {
            temErro = true;
        }
        if (temErro) {
            System.out.println("\n\n## Houve um erro na validação da soma ##\n\n");
        }
        return temErro;
    }

    private static boolean subtracaoEstaOk(Calculadora calc) {
        if (calc.subtrai(2,2) !=0) {
            return false;
        }
        if (calc.subtrai(2,-2) !=4) {
            return false;
        }
        if (calc.subtrai(-2,2) !=-4) {
            return false;
        }
        if (calc.subtrai(-2,-2) !=0) {
            return false;
        }
        if (calc.subtrai(0,0) !=0) {
            return false;
        }
        return true;

    }



}
