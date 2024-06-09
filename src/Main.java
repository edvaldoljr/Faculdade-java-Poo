//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.cor = "prata";
        carro1.motor = "2.0";
        carro1.marca = "citroen";

        System.out.println(carro1.cor);
        System.out.println(carro1.marca);
        System.out.println(carro1.motor);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}