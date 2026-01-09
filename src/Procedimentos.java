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



    protected static void apresentarInformacoesFinais(double areaFormatada, double larguraIdealMaterial, String orcamento){
        System.out.println("A área total de material usado foi: " + areaFormatada);
        System.out.println("A largura do material foi de: " + larguraIdealMaterial + "m");
        System.out.println("O orçamento ficou em: R$ " + orcamento);
    }




}
