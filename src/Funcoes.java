public class Funcoes {

    protected static double IdentificarLadoMenor(double largura, double comprimento) {
        return Math.min(largura, comprimento);
    }

    protected static double IdentificarLadoMaior(double largura, double comprimento) {
        return Math.max(largura, comprimento);
    }

    protected static double CalcularAreaMaterialUsado(double maiorLado, double larguraMaterial) {
        return maiorLado * larguraMaterial;
    }

    protected static double CalcularOrcamento(double areaMaterialUsada, double valorMetroQuadrado) {
        return areaMaterialUsada * valorMetroQuadrado;
    }

    protected static void SelecionarOpcao(){
        Procedimentos.menuSelecaoOpcao();
    }

    private static Material materialSelecionado = null;
    protected static void checarValidadeOpcao(int opcao){

        if(opcao > 0 && opcao <= CatalagoMaterias.getListaMateriais().size()){
            materialSelecionado = CatalagoMaterias.getListaMateriais().get(opcao - 1);
            System.out.println("Você escolheu: " + materialSelecionado.getTipoMaterial());
        } else {
            System.err.println("OPÇÃO INVÁLIDA! Tente novamente, com uma opção válida.");
        }

    }

    protected static void checarCompatibilidadeTrabalhoMaterial(double menorLado, double larguraIdealMaterial) {

        for (int i = 0; i < materialSelecionado.getLargurasDisponiveis().size(); i++) {

            if (menorLado < materialSelecionado.getLargurasDisponiveis().get(i)) {
                larguraIdealMaterial = materialSelecionado.getLargurasDisponiveis().get(i);
                break;
            } else if (menorLado > materialSelecionado.getLargurasDisponiveis().getLast()) {
                System.err.println("Tamanho de materias invalidos tente novamente.");
            }

        }

    }

    protected static double valorMetroQuadrado(){
        return materialSelecionado.getValorMetroQuadrado();
    }

    protected double areaMaterialTotal(double maiorLado, double larguraIdealMaterial){
        return maiorLado * larguraIdealMaterial;
    }


    protected double previaOrcamento(double areaFormatada, double valorM2){
        return  areaFormatada * valorM2;
    }

}
