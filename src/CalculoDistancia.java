public class CalculoDistancia {

    public static void main(String[] args) {

        double velocidade_carro = 110.0;
        double velocidade_caminhao = 80.0;
        double distancia = 100.0;
        double tempo_total = distancia / (velocidade_carro + velocidade_caminhao);
        double distancia_carro = velocidade_carro * tempo_total;
        double distancia_caminhao = distancia - distancia_carro;

        if (distancia_caminhao == 0){
            System.out.println("O carro está a mesma distancia do caminhão.");
        }
        else if (distancia_caminhao < 0) {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        }
        else {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        }
    }
}
// O carro está mais próximo de Ribeirão Preto