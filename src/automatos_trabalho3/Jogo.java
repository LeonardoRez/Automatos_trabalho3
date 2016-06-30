package automatos_trabalho3;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Jogo {

    private Scanner e;
    Random random;
    int escolha;
    String nome;
    boolean monitoria = false;

    public int inicio() {
        System.out.println("Seja bem vind0 ao Universo Fantástico Teórico! Depois de"
                + " um longo período de treinamento básico, você \n"
                + "finalmente deixa os livros de fantasia de lado \n"
                + "e decide "
                + "viver suas próprias aventuras!!\n\n"
                + "Mas antes de iniciar essa jornada, você deve passar\n "
                + "por uma última bateria de ensinamentos e \n"
                + "se provar realmente digno de tal oportunidade! \n");
        System.out.println("Digite seu nome: ");
        e = new Scanner(System.in);
        nome = e.nextLine();
        System.out.println("Confirmar nome: Bicho (S/N)");
        nome = e.nextLine();
        System.out.println("Certeza que seu nome é Bicho? (S/N)");
        nome = e.nextLine();
        System.out.println("Seja bem vindo, Bicho.");
        System.out.println("Ao fim da sua extensa viagem pela Kjadineva,\n "
                + "você se encontra nesse novo mundo desconhecido e hostiil,\n "
                + "onde muitos perigos o aguardam...");
        int c = 0;
        do {
            System.out.println("\n\nEscolha uma ação: ");
            System.out.println("1 - Estudar o ambiente.");
            System.out.println("2 - Seguir para o Sul");
            System.out.println("3 - Procurar o setor de otimização");
            escolha = e.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Você não entende nada.");
                    break;
                case 2:
                    System.out.println("O sol está muito forte. Melhor não.");
                    break;
                case 3:
                    return bardo1();
                default:
                    if (c++ < 1) {
                        System.out.println("Opção inválida!");
                    } else {
                        System.out.println("Você é môco ou é burro?");
                    }

            }
        } while (true);
    }

    public void jogar() {
        //random = new Random();
        //System.out.println(""+random.nextInt(10));
        int r = inicio();
        if (r == -2) {
            System.out.println("\nParabéns pelas conquistas! Até a "
                    + "próxima jornada!\n");
        } else {
            System.out.println("GAME OVER!");
        }
    }

    private int bardo1() {

        System.out.println("Você encontra um bardo poeta com um poder de persuasão\n "
                + "muito forte, que aparece de tempos em tempos pra distrair pequenas\n "
                + "multidões e alimentar seu próprio ego com histórias do seu suposto tempo\n de glória. "
                + "Depois de ouvir muitos contos sobre tantas viagens e apresentações\n feitas você se vê entediado:");
        int opcao = 0, c = 0;
        System.out.println("Escolha uma ação:");
        System.out.println("1 - continuar ouvindo, mesmo sabendo que sua paciência \nacabará em breve.");
        System.out.println("2 - apontar as incoerências nas histórias e questionar \no bardo sobre a veracidade dos seus contos.");
        System.out.println("3 - começar a contar suas próprias histórias por achar \nque são ainda mais interessantes que as dele.");
        opcao = e.nextInt();
        switch (opcao) {
            case 2:
                System.out.println("O bardo se ofende instantaneamente e começa a despejar\n teorias da conspiração e um bocado de sermão na sua direção. "
                        + "Todo mundo sai do transe"
                        + "e o bardo foge. Você segue seu caminho.");
                break;
            case 1:
                System.out.println("Você dorme. Os participantes dormem. \nO bardo dorme. Você acorda e segue intuitivamente seu caminho");
                break;
            case 3:
                System.out.println("O bardo dorme. Todos saem do transe e logo o grupo se desfaz. Você segue seu caminho.");
                break;
            default:
                System.out.println("Tu é môco ou é burro?");
        }
        return helena();
    }

    public int helena() {
        System.out.println("Você percorre um edifício comprido que se parece um túnel \ne encontra uma anã detentora de grandes poderes "
                + "arcanos (um tipo de magia muito complexa).");
        int opcao;
        System.out.println("Escolha uma ação:");
        System.out.println("1 - perguntar para onde fica o setor de otimização.");
        System.out.println("2 - Escolher a ação 1.");
        opcao = e.nextInt();
        System.out.println("Com deboche, Anelleh diz: \"aaaaaaaaahahahaha.... isso é dúvida lá do ensino básico! Procure um monitor!");
        System.out.println("...");
        System.out.println("Logo em seguida, ela se arrepende e diz que te ajudará, desde que você \nconsiga resolver a seguinte charada bonus:");

        System.out.println("Três formigas, das quais duas carregam folhas, andam formando uma fila.\n"
                + " Sabe-se que a que carrega folha verde sempre diz a verdade; a que carrega \n"
                + "folha amarelada às vezes diz a verdade; e a que não carrega qualquer folha \n"
                + "sempre mente. A que está na frente diz “a formiga que carrega folha verde \n"
                + "está no meio\". A que está no meio diz “eu carrego a folha amarelada\". \n"
                + "A que está atrás diz “a formiga que está no meio não carrega folha alguma\". \n"
                + "Logo, pode-se concluir que a formiga que:\n");
        System.out.println("1 - carrega folha verde está atrás das outras duas.");
        System.out.println("2 - está atrás é a que sempre mente.");
        System.out.println("3 -  carrega a folha amarelada está no meio.");
        System.out.println("4 - sempre mente está à frente daquela que carrega a folha amarelada.");
        opcao = e.nextInt();
        int cont = 0;
        switch (opcao) {
            case 1:
                System.out.println("\"Gostei de ver!!\nO setor de otimização fica no segundo andar! \"");
                return dojo();
            case 2:
                System.out.println("A anã perde a cabeça: \n -----------------------\"!!!!REPROVIS INSTANTANUS!!!!\" -----------------------");
                return -2;
            case 3:
                System.out.println("A anã perde a cabeça: \n -----------------------\"!!!!REPROVIS INSTANTANUS!!!!\" -----------------------");
                return -2;
            case 4:
                System.out.println("A anã perde a cabeça: \n -----------------------\"!!!!REPROVIS INSTANTANUS!!!!\" -----------------------");
                return -2;
            default:
                System.out.println("Tu é môco ou é burro?");
        }
        return -2;
    }

    public int dojo() {

        random = new Random();
        int r = random.nextInt(10);
        if (r < 5) {
            System.out.println("\n\nApós subir o último lance de escadas, você abre \n"
                    + "uma porta e entra no Dojo. Um aventureiro do grupo dos"
                    + "renegados se aproxima. Ele te convida para jogar um óraculo de cartas\n"
                    + " que pode facilitar muito a sua jornada.");
            System.out.println("\nEscolha uma ação:");
            int opcao;
            System.out.println("1 - Você fica curioso para saber o que as cartas podem trazer de bom e aceita jogar.");
            System.out.println("2 - Você acha uma perda de tempo se arriscar com isso.");
            opcao = e.nextInt();
            if (opcao == 1) {
                System.out.println("No meio do jogo, um portal para \"PORFALTAZ REPROVADUS\" se abre no chão que estava em baixo de você.");
                return -1;
            } else {
                return otimizacao();
            }

        } else {
            System.out.println("Após subir o último lance de escadas, você abre \n"
                    + "uma porta e entra no Dojo. Uma jovem paladina vem em sua direção e \nte"
                    + " convida para participar de uma monitoria.");
            do {
                System.out.println("Escolha uma ação:");
                int opcao;
                System.out.println("1 - Você não se interessa pela monitoria e decide \n"
                        + "seguir com o objetivo principal.");
                System.out.println("2 - Você fica curioso para descobrir o que \n"
                        + "pode ser aprendido na monitoria.");
                opcao = e.nextInt();
                switch (opcao) {
                    case 1:
                        return otimizacao();
                    case 2:
                        monitoria = true;
                        return otimizacao();
                    default:
                        System.out.println("tu é moco ou é burro?");
                }
            } while (true);
        }
    }

    public int otimizacao() {
        System.out.println("Ao chegar na sala 62, você encontra Anailuj, a humana de altura mediana,"
                + " que, sem nenhuma serimônia, pede para você resolver"
                + "um problema que parece muito simples. ");
        int opcao;
        System.out.println("Escolha uma ação:");
        System.out.println("1 - resolver o problema de maneira intuitiva.");
        System.out.println("2 - resolver o problema pensando em seu desempenho.");
        System.out.println("3 - meditar 3 horas e calmamente bolar uma estratégia para alcançar o resultado ótimo.");
        opcao = e.nextInt();
        if (opcao == 3) {
            System.out.println("Anailuj fica bastante satisfeita e lança \n"
                    + "em você a magia \"benção do primeiro período\","
                    + " que deixa seu atributo \"Determinação\" com um bônus de \n"
                    + "5 pontos! (Esse efeito só acaba se o jogador for corrompido pelo"
                    + " GREVES ETERNIS)");
            return -2;
        } else if (opcao == 1) {
            if (monitoria) {
                System.out.println("Quando Anailuj está prestes a conjurar \n"
                        + "Reprovis Instantanus, "
                        + "você é cercado por uma energia defensiva proveniente \n"
                        + "do atendimento da monitoria!! Você volta um turno e pode"
                        + "mudar a sua escolha:");
                int o;
                System.out.println("Escolha uma ação:");
                System.out.println("2 - resolver o problema pensando em seu desempenho.");
                System.out.println("3 - meditar 3 horas e calmamente bolar uma \n"
                        + "estratégia para alcançar o resultado ótimo.");
                o = e.nextInt();
                if (o == 2) {
                    System.out.println("REPROZÓDIA, OBLITERÁÁÁ!!");
                    return -1;
                } else {

                    System.out.println("Anailuj fica bastante satisfeita e lança \n"
                            + "em você a magia \"benção do primeiro período\","
                            + " que deixa seu atributo \"Determinação\" com um bônus de \n"
                            + "5 pontos! (Esse efeito só acaba se o jogador for corrompido pelo"
                            + " GREVES ETERNIS)");
                    return -2;
                }
            }
            System.out.println("REPROZÓDIA, OBLITERÁÁÁ!!");
            return -1;
        }
        System.out.println("REPROZÓDIA, OBLITERÁÁÁ!!");
        return -1;
    }

}
