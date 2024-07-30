package NPolimorfismo.domain.test;

import NPolimorfismo.domain.servico.RepositorioArquivo;
import NPolimorfismo.domain.servico.RepositorioBancoDeDados;
import NPolimorfismo.repositorio.Repositorio;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorioArquivo = new RepositorioArquivo();
        Repositorio repositorioBancoDados = new RepositorioBancoDeDados();

        repositorioArquivo.salvar();
        repositorioBancoDados.salvar();
    }
}
