public class MarvelSwitch {
    public static void main(String[] args) {
        String faseWanda = "Feiticeira Escarlate";

        String status;
        switch (faseWanda) {
            case "Vingadora":
                status = "Heróina em treinamento e controle de poderes.";
                break;
            case "WandaVision":
                status = "Criação de realidade alternativa (Hex) por luto.";
                break;
            case "Feiticeira Escarlate":
                status = "Poder máximo: Manipulação de magia do caos e do Darkhold.";
                break;
            case "Civil War":
                status = "Confinamento no complexo dos Vingadores.";
                break;
            default:
                status = "Fase não identificada no multiverso.";
        }

        System.out.println("Status da Wanda: "+ status);
    }
}