public class Procedimentos {


    protected static void novaLinha(){
        System.out.println();
    }

    protected static void textoCabecalho(){

        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("    Calculo Orçamentario    ");
        System.out.println("----------------------------");
        System.out.println("----------------------------");

    }


    protected static void cabecalhoMenuInserirDimensoes(){
        System.out.println("Insira as dimensões do trabalho:");
    }

    protected static void informarLargura(){
        System.out.println("Digite a largura(metros):");
    }

    protected static void informarComprimento(){
        System.out.println("Digite o comprimento(metros):");
    }

    protected static void separarMenus(){
        System.out.println("=======================");
    }

    protected static void menuSelecaoOpcao(){

        for (int i = 0; i < CatalagoMaterias.getListaMateriais().size(); i++){
            System.out.println("[" + (i + 1) + "] " +
                    CatalagoMaterias.getListaMateriais().get(i).getTipoMaterial());
        }

        System.out.print("Opção: ");
    }

    protected static void nomeOpcaoSelecionada(Material materialSelecionado){
        System.out.println("Você escolheu: " + materialSelecionado.getTipoMaterial());
    }


    protected static void apresentarInformacoesFinais(double area, double larguraIdealMaterial, String orcamento){
        System.out.printf("A área total de material usado foi: %.3f", area, "m");
        System.out.println("\nA largura do material foi de: " + larguraIdealMaterial + "m");
        System.out.println("O orçamento ficou em: R$ " + orcamento);
    }


}
