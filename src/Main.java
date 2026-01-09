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

        Funcoes.checarValidadeOpcao(opcao);

        double maiorLado = Funcoes.IdentificarLadoMaior(largura, comprimento);
        double menorLado = Funcoes.IdentificarLadoMenor(largura, comprimento);
        double larguraIdealMaterial = 0.0;

        Funcoes.checarCompatibilidadeTrabalhoMaterial(menorLado, larguraIdealMaterial);


        double areaMaterial = Funcoes.CalcularAreaMaterialUsado(maiorLado, larguraIdealMaterial);
        double areaFormatada = Math.floor(areaMaterial * 1000) / 1000;


        double previaorcamento = Funcoes.CalcularOrcamento(areaFormatada, Funcoes.valorMetroQuadrado());
        String orcamento = Utils.paraReais(previaorcamento);




        Procedimentos.apresentarInformacoesFinais(areaFormatada, larguraIdealMaterial, orcamento);

        scan.nextLine();
        scan.close();


    }
}