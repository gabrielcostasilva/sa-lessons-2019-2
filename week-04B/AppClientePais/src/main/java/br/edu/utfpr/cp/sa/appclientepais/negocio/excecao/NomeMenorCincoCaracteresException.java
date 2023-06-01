package br.edu.utfpr.cp.sa.appclientepais.negocio.excecao;

public class NomeMenorCincoCaracteresException extends Exception {

    public NomeMenorCincoCaracteresException() {
        super("O nome do cliente não pode ser menor que 5 caracteres");
    }
    
}
