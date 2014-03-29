package Exception;

/**
 *
 * @author larissa
 */
public class TratamentoDeExcecoes {

    public static void validarNome(String nome) throws NomeInvalidoException {

        boolean validado = false;
        boolean retorno = false;

        int numCaracteresValidos = 0;
        String caracteresValidos = "qwertyuiopasdfghjklçzxcvbnm ";

        for (int i = 0; i < nome.length(); i++) {
            for (int j = 0; j < caracteresValidos.length(); j++) {
                if (nome.toLowerCase().charAt(i) == caracteresValidos.charAt(j)) {
                    numCaracteresValidos++;
                }
            }
        }

        if (numCaracteresValidos == nome.length()) {
            validado = true;
        }

        if ((nome != null) && (!nome.equals("")) && (!nome.equals(" ")) && validado) {
            retorno = true;
        }

        if (!retorno) {
            throw new NomeInvalidoException("O campo Nome não pode ser vazio ou conter caracteres especiais.");
        }

    }

    public static void validarCurso(String curso) throws CursoInvalidoException {

        boolean validado = false;
        boolean retorno = false;
        
        int numCaracteresValidos = 0;
        String caracteresValidos = "qwertyuiopasdfghjklçzxcvbnm ";

        for (int i = 0; i < curso.length(); i++) {
            for (int j = 0; j < caracteresValidos.length(); j++) {
                if (curso.toLowerCase().charAt(i) == caracteresValidos.charAt(j)) {
                    numCaracteresValidos++;
                }
            }
        }

        if (numCaracteresValidos == curso.length()) {
            validado = true;
        }
        if( (curso != null) && (!curso.equals("")) && (!curso.equals(" ")) && validado ){
            retorno = true;
        }
   
        if (!retorno) {
            throw new CursoInvalidoException("O campo curso não pode ser vazio ou conter caracteres especiais.");
        }   
        
    }

    public static void validarMatricula(String matricula) throws MatriculaInvalidaException {


        int NUMCARACTERES = 9;
        String numeros = "0123456789";
        int numValidoEncontrado = 0;

        boolean validado = true;
        boolean retorno = false;


        for (int i = 0; i < matricula.length(); i++) {

            for (int j = 0; j < numeros.length(); j++) {
                if (matricula.charAt(i) == numeros.charAt(j)) {
                    numValidoEncontrado++;
                }
            }
        }


        if (numValidoEncontrado == matricula.length()) {
            validado = true;
        }

        if (matricula.length() != NUMCARACTERES) {
            validado = false;
        }

         if( (matricula != null) && (!matricula.equals("")) && (!matricula.equals(" ")) && validado ){
           retorno = true;
         }
         if (!retorno) {
            throw new MatriculaInvalidaException("O campo da Matricula não pode ser vazio ou conter caracteres especiais.");
        }        
        
       
    }
}
