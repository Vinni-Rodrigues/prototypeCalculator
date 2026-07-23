import com.github.vinnirodrigues.model.Material;
import com.github.vinnirodrigues.service.CalculadoraMaterial;
import com.github.vinnirodrigues.repository.CatalagoMaterias;
import com.github.vinnirodrigues.service.CalculadoraOrcamento;
import com.github.vinnirodrigues.service.Procedimentos;
import com.github.vinnirodrigues.utils.utilitarios;


import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Material> materials = CatalagoMaterias.getListaMateriais();


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

        Procedimentos.menuSelecaoOpcao();
        int opcao = scan.nextInt();


        Procedimentos.novaLinha();

        Material materialSelecionado = CalculadoraMaterial.checarValidadeOpcao(opcao, materials);


        double maiorLado = CalculadoraMaterial.IdentificarLadoMaior(largura, comprimento);
        double menorLado = CalculadoraMaterial.IdentificarLadoMenor(largura, comprimento);


        double valorM2 = CalculadoraOrcamento.valorMetroQuadrado(materialSelecionado);

        System.out.print("Você escolheu: " + materialSelecionado.getTipoMaterial());
        System.out.printf("\nO valor do M²: R$%.2f", valorM2);


        // Existe algum erro daqui para frente no código
        double larguraIdealMaterial = CalculadoraMaterial.checarCompatibilidadeTrabalhoMaterial(menorLado, materialSelecionado);


        double areaMaterial = CalculadoraOrcamento.areaMaterialTotal(maiorLado, larguraIdealMaterial);
        double area = utilitarios.formatarArea(areaMaterial);

        double previaorcamento = CalculadoraOrcamento.calcularPreviaOrcamento(area, valorM2);
        String orcamento = utilitarios.paraReais(previaorcamento);


        Procedimentos.novaLinha();
        Procedimentos.separarMenus();
        Procedimentos.novaLinha();

        Procedimentos.apresentarInformacoesFinais(areaMaterial, larguraIdealMaterial, orcamento);

        scan.nextLine();
        scan.close();


    }
}