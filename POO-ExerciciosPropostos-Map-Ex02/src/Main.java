import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> dado = new TreeMap<>() {{
            put("Lado1",0);
            put("Lado2",0);
            put("Lado3",0);
            put("Lado4",0);
            put("Lado5",0);
            put("Lado6",0);
            }};

        int count=0;
        Random random = new Random();
        int numeroAleatorio = 0;

            while (count <100){
                int novoValor= 0;
                numeroAleatorio = random.nextInt(6);

                System.out.println(numeroAleatorio);

                switch (numeroAleatorio){
                    case 0: dado.put("Lado1", dado.get("Lado1")+1);
                        break;
                    case 1: dado.put("Lado2", dado.get("Lado2")+1);
                        break;
                    case 2: dado.put("Lado3", dado.get("Lado3")+1);
                        break;
                    case 3: dado.put("Lado4", dado.get("Lado4")+1);
                        break;
                    case 4: dado.put("Lado5", dado.get("Lado5")+1);
                        break;
                    case 5: dado.put("Lado6", dado.get("Lado6")+1);
                        break;
                }

                count++;
        };
        System.out.println(dado);
    }
}