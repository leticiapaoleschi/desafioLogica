import java.util.ArrayList;

public class Resoluçao {

	public static void main(String[] args) {

//		Dada a função findAge, que recebe uma string contendo chaves e valores, 
//      onde key possui o nome de uma pessoa e value possui a idade dela, retorne a quantidade 
//   	e os nomes das pessoas com idade abaixo de 29 anos
//
//		Input: '0key1: Matheus,2 value:3 25; key: Henrique, value: 29; key: Glória, value: 21'
//		Output: "2 Pessoa(s): Matheus, Glória"
		

		findAge("key: Matheus, value: 25; key: Henrique, value: 29; key: Glória, value: 21;key: Matheus, value: 25");
		
		
		
		
}

	public static String findAge(String string){
		
		String result = "";
		
		// Armazenara os nomes com idade menor que 29
		String ultimoNomedeMenor = "";
		
		// List para armazenar os nomes
		ArrayList<String> nomesQueMederamRaiva = new ArrayList<String>();
		
		// Quebrando a string em , : e ; para identificar a idade
		String[] stringsSplited = string.split("[,;:]");
		int deMenor29 = 0;
		
		
        for (int i=0; i < stringsSplited.length; i++) {
    		// Limpando os espacos em branco para tratamento da string
        	stringsSplited[i].replaceAll(" ", "");
        	
        	//Verificando se a string eh um numero para checar idade
        	if(stringsSplited[i].matches(".[0-9].")) {
        		//Limpando os espacos em branco para tratamento da string
        		String ageTratada = stringsSplited[i].replaceAll(" ", "");
        		//Convertendo em idade a string
        		int age = Integer.parseInt(ageTratada);
        		if(age < 29) {
        			deMenor29++;
        			//O nome da pessoa vai estar sempre duas posicoes atras da idade,
        			//usando essa logica entrcontrei o nome das pessoas com idade menor que 29
        			ultimoNomedeMenor = stringsSplited[i-2];
        			//Salvando na lista
        			nomesQueMederamRaiva.add(ultimoNomedeMenor);
        		}
        	}
        }

        System.out.println("Existem " + deMenor29 + " pessoas menores que 29 anos\n"
        + "Nomes:\n" + nomesQueMederamRaiva);
		return result ;
	}

}
