package Exception;

public class NomeInvalidoException extends Exception{
	
	public NomeInvalidoException(){
		super();
	}
	public NomeInvalidoException(String mensagem){
		super(mensagem);
	}

}
