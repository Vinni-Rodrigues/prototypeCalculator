import java.util.ArrayList;

public class Funcoes {

    protected static double IdentificarLadoMenor(double largura, double comprimento) {
        return Math.min(largura, comprimento);
    }

    protected static double IdentificarLadoMaior(double largura, double comprimento) {
        return Math.max(largura, comprimento);
    }

    protected static void SelecionarOpcao(){
        Procedimentos.menuSelecaoOpcao();
    }

    protected static Material checarValidadeOpcao(int opcao, ArrayList<Material> materiais){

       Material materialSelecionado = new Material("", 0);

        if(opcao > 0 && opcao <= materiais.size()){
            materialSelecionado = CatalagoMaterias.getListaMateriais().get(opcao - 1);
        } else {
            System.err.println("OPÇÃO INVÁLIDA! Tente novamente, com uma opção válida.");
        }

        return materialSelecionado;
    }

    protected static double checarCompatibilidadeTrabalhoMaterial
            (double menorLado, Material materialSelecionado) {


        for (int i = 0; i < materialSelecionado.getLargurasDisponiveis().size(); i++) {

            if (menorLado < materialSelecionado.getLargurasDisponiveis().get(i)) {
                return materialSelecionado.getLargurasDisponiveis().get(i);
            }

        }

        return 0.0;
    }

    protected static double valorMetroQuadrado(Material materialSelecionado){
        return materialSelecionado.getValorMetroQuadrado();
    }

    protected static double AreaMaterialTotal(double maiorLado, double larguraIdealMaterial){
        return maiorLado * larguraIdealMaterial;
    }


    protected static double PreviaOrcamento(double areaFormatada, double valorM2){
        return  areaFormatada * valorM2;
    }



}
