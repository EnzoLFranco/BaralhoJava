
public class Baralho {

    static Carta[] cartas = new Carta[56];

    public static void preencherBaralho(){
        String[] naipes = {"Copas","Espadas","Ouros","Paus"};
        String[] valores = {"Ás","2","3","4","5","6","7","8","9","10","J","Q","K"};

        int index = 0;
        for(String naipe : naipes){
            for(String valor : valores){
                cartas[index] = new Carta(valor,naipe);
                index++;
            }
        }

        for(int i = 0; i < 4; i++){
            cartas[index] = new Carta("Coringa" + i, "Coringa");
            index++;
        }
    }

    public static void print(){
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }

    public static void main(String[] args) {
        preencherBaralho();
        print();

    }
}
