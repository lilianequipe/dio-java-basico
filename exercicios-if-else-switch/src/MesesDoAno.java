import java.util.Scanner;

public class MesesDoAno {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[][] mesesDoAno = new String[1][13];
        Scanner Mes = new Scanner(System.in);
        int numeroMes;

        mesesDoAno[0][1] = "JANEIRO";
        mesesDoAno[0][2] = "FEVEREIRO";
        mesesDoAno[0][3] = "MARÇO";
        mesesDoAno[0][4] = "ABRIL";
        mesesDoAno[0][5] = "MAIO";
        mesesDoAno[0][6] = "JUNHO";
        mesesDoAno[0][7] = "JULHO";
        mesesDoAno[0][8] = "AGOSTO";
        mesesDoAno[0][9] = "SETEMBRO";
        mesesDoAno[0][10] = "OUTRUBRO";
        mesesDoAno[0][11] = "NOVEMBRO";
        mesesDoAno[0][12] = "DEZEMBRO";

        System.out.println("Digite o número do mês que deseja consultar: \n");
        numeroMes = Mes.nextInt();


        if(numeroMes <=12 && numeroMes !=0){
            System.out.println("O MÊS É: " + mesesDoAno[0][numeroMes]);
        }else{
            System.out.println("Ñ EXISTE ESTE MÊS");
        }
        /*
        if((numeroMes == 7) || (numeroMes == 12) || (numeroMes == 1)){
            System.out.println("\n ::FÉRIAS!::");
        }
        */
        switch (numeroMes) {
            case 1, 7, 12 -> System.out.println("\n ::FÉRIAS!::");
        }
    }
}