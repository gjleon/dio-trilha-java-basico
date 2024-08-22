package equipamentos.iphone;

import equipamentos.aparelhoTelefonico.AparelhoTelefonico;
import equipamentos.navegadorInternet.NavegadorInternet;
import equipamentos.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina: " + url);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Musica: " + musica);
    }
}
