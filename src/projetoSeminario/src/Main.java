import controller.UsuarioController;
import model.UsuarioModel;
import view.UsuarioView;

public class Main {
    public static void main(String[] args) {
        // Cria o Model
        UsuarioModel usuario = new UsuarioModel("Ana Silva", "ana@email.com");

        // Cria a View
        UsuarioView view = new UsuarioView();

        // Cria o Controller ligando os dois
        UsuarioController controller = new UsuarioController(usuario, view);

        // Exibe os dados iniciais
        controller.mostrarUsuario();

        // Atualiza via Controller (nunca direto no Model)
        controller.atualizarNome("Ana Costa");

        // Exibe novamente
        controller.mostrarUsuario();
    }
}