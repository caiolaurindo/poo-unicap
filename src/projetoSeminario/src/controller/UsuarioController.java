package controller;

import model.UsuarioModel;
import view.UsuarioView;

public class UsuarioController {
    private UsuarioModel modelo;
    private UsuarioView view;

    public UsuarioController(UsuarioModel modelo, UsuarioView view) {
        this.modelo = modelo;
        this.view = view;
    }

    public void atualizarNome(String novoNome) {
        modelo.setNome(novoNome);
        view.exibirMensagem("Nome atualizado para: " + novoNome);
    }

    public void mostrarUsuario() {
        view.exibirUsuario(modelo.getNome(), modelo.getEmail());
    }
}
