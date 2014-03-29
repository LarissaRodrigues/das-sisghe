
package Exception;

/**
 *
 * @author larissa
 */    
      public class MateriaInvalidaException extends Exception {
      public MateriaInvalidaException(){
		super();
	}
	public MateriaInvalidaException(String mensagem){
		super(mensagem);
	}
}
