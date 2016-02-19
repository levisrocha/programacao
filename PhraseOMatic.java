

public class PhraseOMatic{
    public static void main(String [] args){
        
        String[] wordListOne = {"24/7", "varias camadas", "30.000 pes", "B-to-B", "todos ganham", "front-end", "Baseado na Web", "Difundido", "Inteligente", "Seis sigma", "caminho crítio", "dinâmico" };

	String[] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuido", "agrupado", "solidificado", "independente da maquina", "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};
	String[] wordListThree = {"processo", "ponto máximo", "solucao", "arquitetura", "Habilitacao no nucleo", "estratégia", "mindshare", "portal", "espaco", "visao", "paradigma", "missao"};

	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;

	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);
	
	
	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

	System.out.println("precisamos de " + phrase );


    }

}
