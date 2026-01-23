import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Material> materiais = CatalagoMaterias.getListaMateriais();


        Procedimentos.textoCabecalho();

        Procedimentos.novaLinha();
        Procedimentos.novaLinha();


        Procedimentos.cabecalhoMenuInserirDimensoes();

        Procedimentos.novaLinha();

        Procedimentos.informarLargura();
        double largura = scan.nextDouble();

        Procedimentos.informarComprimento();
        double comprimento = scan.nextDouble();


        Procedimentos.novaLinha();
        Procedimentos.novaLinha();

        Funcoes.SelecionarOpcao();
        int opcao = scan.nextInt();


        Procedimentos.novaLinha();

        Material materialSelecionado = Funcoes.checarValidadeOpcao(opcao, materiais);


        double maiorLado = Funcoes.IdentificarLadoMaior(largura, comprimento);
        double menorLado = Funcoes.IdentificarLadoMenor(largura, comprimento);

        Procedimentos.nomeOpcaoSelecionada(materialSelecionado);
        Procedimentos.valorMetroOpcaoSelecionada(materialSelecionado);

        // Existe algum erro daqui para frente no código
        double larguraIdealMaterial = Funcoes.checarCompatibilidadeTrabalhoMaterial(menorLado, materialSelecionado);


        double areaMaterial = Funcoes.AreaMaterialTotal(maiorLado, larguraIdealMaterial);
        //double area = Utils.formatarArea(areaMaterial);

        double previaorcamento = Funcoes.PreviaOrcamento(areaMaterial, materialSelecionado.getValorMetroQuadrado());
        String orcamento = Utils.paraReais(previaorcamento);


        Procedimentos.novaLinha();
        Procedimentos.separarMenus();
        Procedimentos.novaLinha();

        Procedimentos.apresentarInformacoesFinais(areaMaterial, larguraIdealMaterial, orcamento);

        scan.nextLine();
        scan.close();


    }
}