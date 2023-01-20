package main.java.local.fechasecadeas.tarefa3;

public class tarefa3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int ano = sc.nextInt();
        int mes = sc.nextInt();

        GregorianCalendar diasmes = new GregorianCalendar(ano, mes - 1, 1);

    }

}
