// Interface para Reprodutor Musical
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para Aparelho Telefônico
public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface para Navegador na Internet
public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone que implementa todas as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() {
        System.out.println("A música está tocando.");
    }

    public void pausar() {
        System.out.println("A música foi pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("A música " + musica + " foi selecionada.");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero + ".");
    }

    public void atender() {
        System.out.println("Chamada atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
    }
}
