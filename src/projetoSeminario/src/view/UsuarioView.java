package view;

public class UsuarioView {
    public void exibirUsuario(String nome, String email) {
        System.out.println("=== Dados do Usuário ===");
        System.out.println("Nome:  " + nome);
        System.out.println("Email: " + email);
    }

    public void exibirMensagem(String mensagem) {
        System.out.println("[INFO] " + mensagem);
    }
}
