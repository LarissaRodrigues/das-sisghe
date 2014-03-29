package DAO;

import Model.Aluno;
import Model.Disciplina;
import Model.Grade;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */

public class DAOPdf {
    
    private static Font titleFont = new Font (Font.FontFamily.HELVETICA, 20, Font.BOLD);
    private static Font disciplinaFont = new Font (Font.FontFamily.HELVETICA,9,Font.ITALIC,BaseColor.BLUE);
    private static Font disciplinaFont2 = new Font (Font.FontFamily.HELVETICA,9,Font.BOLD,BaseColor.BLUE);
    private static Font listaDisciplinaFont = new Font (Font.FontFamily.HELVETICA,9,Font.ITALIC,BaseColor.RED);
    private static Font listaDisciplinaFont2 = new Font (Font.FontFamily.HELVETICA,9,Font.BOLD,BaseColor.RED);
    private static Font normal = new Font (Font.FontFamily.HELVETICA,10,Font.NORMAL,BaseColor.BLACK);
    private static Font normal2 = new Font (Font.FontFamily.HELVETICA,10,Font.BOLD,BaseColor.BLACK);

    public  Aluno aluno;
    public  ArrayList<Disciplina> listaDisciplina;
    public  String arquivo;
    public  String tipo;
    public  Grade grade;

        @Override
        public String toString() {
            
            return aluno.toString(); 
        }

    public DAOPdf(Aluno aluno) {
        this.aluno = aluno;
    }

       public DAOPdf(Aluno aluno,ArrayList<Disciplina> listaDisciplina, String arquivo,String tipo){
            this.aluno = aluno;
            this.listaDisciplina = listaDisciplina;
            this.arquivo = arquivo;
            this.tipo = tipo;           
    }
       public DAOPdf(Aluno aluno,ArrayList<Disciplina> listaDisciplina, String arquivo,String tipo, Grade grade){
            this.aluno = aluno;
            this.listaDisciplina = listaDisciplina;
            this.arquivo = arquivo;
            this.tipo = tipo;
            this.grade = grade;
    }
       
    
    public static int addLinhaVazia(Paragraph paragraph, int number) {
      
        try{
            for (int i = 0; i < number; i++) {
                paragraph.add(new Paragraph(" "));
            }
            return 1;
        } catch(Exception e){
            return -1;
        }

    }
    
    public  int addMetaDados(Document document){
        try{
            document.addTitle("Grade Horaria - "+ aluno.getMatricula() + aluno.getNome());
            document.addSubject("geredo por SISGHE");
            document.addKeywords("Grade , Horaria, UnB");
            document.addAuthor(System.getProperty("user.name"));
            document.addCreator("SISGHE");
            return 1;
        }catch (Exception e){
            return -1;
        }
    }

    
    public  int addConteudo(Document document) throws DocumentException{
        try{
        Paragraph para = new Paragraph();      
        Paragraph aux;
        
        
        // adicionando titulo
        aux = new Paragraph("Grade Horaria - sisGHE", titleFont);
        para.add(aux);
        aux.setAlignment(Element.ALIGN_CENTER);
        
        //pula uma linhas
        addLinhaVazia(para,1);
        
        //preenchendo informações do aluno
        aux = new Paragraph("Nome: "+ aluno.getNome()+"\n"
                          + "Matricula: "+ aluno.getMatricula()+"\n"
                          + "Curso: "+ aluno.getCurso()+"\n"
                          + "Semestre: "+aluno.getSemestre()+"º",normal);    
        para.add(aux);

        addLinhaVazia(para,2);
        
        //adiciona a grade do aluno no PDF;
        
        aux = new Paragraph ("",normal);
        Phrase p = new Phrase("Grade Horaria de disciplinas: \n", normal2);
        aux.add(p);
        for (int i =0;i<grade.getMatriculas().size();i++){
            
            aux.add("   "+grade.getMatriculas().get(i).getNomeDisciplina() + " - " 
                    + grade.getMatriculas().get(i).getTurma().getNome() + ":\n");
            
            for(int j = 0; j< grade.getMatriculas().get(i).getTurma().getHorario().size();j++){
                aux.add("       >"+grade.getMatriculas().get(i).getTurma().getHorario().get(j).getDiaDaSemana()
                        + ": " + grade.getMatriculas().get(i).getTurma().getHorario().get(j).getHora()+"\n");
            }
        }
        aux.add("\n");
        para.add(aux);
        
        
       
        //adiciona disciplinas cursadas ao documento
        
        aux = new Paragraph("", disciplinaFont);
        p = new Phrase("Lista de disciplinas cursadas (CODIGO - NOME - REQUISITO):\n", disciplinaFont2);
        aux.add(p);
        for (int i =0;i<aluno.getDisciplinasCursadas().size();i++){
        aux.add("   >"+aluno.getDisciplina(i).getCodigo() + " - " 
                + aluno.getDisciplina(i).getNome() + " - "
                + aluno.getDisciplina(i).getPre_req()+ "\n");
        }
        aux.add("\n\n");
        para.add(aux);
          


        //adicinar tudo no documento
        document.add(para);
        return 1;
        }catch(Exception e){
            return -1;
        }
    
    };
    private int addConteudoDisciplinas(Document document)throws DocumentException{
         try{
                Paragraph para = new Paragraph();
                Paragraph aux;
                aux = new Paragraph("",listaDisciplinaFont);
                
                Phrase p = new Phrase("Disciplinas Disponiveis (COdigo - Nome - Codigo do Prerequisito):\n", listaDisciplinaFont2);
                aux.add(p);
                for(int i=0;i<listaDisciplina.size();i++){
                    aux.add("   >"+listaDisciplina.get(i).getCodigo() + " - " 
                    + listaDisciplina.get(i).getNome() + " - "
                    + listaDisciplina.get(i).getPre_req()+ "\n");
                    
                }
                para.add(aux);
                document.add(para);
                return 1;
         }catch(Exception e){
             return -1;
         }
    
    }
    
    public  int gerarPdf(){
        //System.out.println("GERAR PDF = "+ aluno.toString());
        //System.out.println("GERAR PDF = " + disciplinaCursada.toString());
        Document document = new Document();
           String FILE = arquivo;
           try{
               if("Aluno".equals(tipo)){
                    PdfWriter.getInstance(document, new FileOutputStream(FILE));
                    document.open();
                    addMetaDados(document);//metodos os quais irei criar abaixo (deveriam estar em outra classe na minha opiniao
                    addConteudo(document);
                    document.close();
                    JOptionPane.showMessageDialog(null, "PDF salvo em:\n"+FILE);
                    return 1;
               }if("Lista Disciplinas".equals(tipo)){
                    PdfWriter.getInstance(document, new FileOutputStream(FILE));
                    document.open();
                    addMetaDados(document);//metodos os quais irei criar abaixo (deveriam estar em outra classe na minha opiniao
                    addConteudoDisciplinas(document);
                    document.close();
                    JOptionPane.showMessageDialog(null, "PDF salvo em:\n"+FILE);
                    return 1;
               }if("Completo".equals(tipo)){
                    PdfWriter.getInstance(document, new FileOutputStream(FILE));
                    document.open();
                    addMetaDados(document);//metodos os quais irei criar abaixo (deveriam estar em outra classe na minha opiniao
                    addConteudo(document);
                    addConteudoDisciplinas(document);
                    document.close();
                    JOptionPane.showMessageDialog(null, "PDF salvo em:\n"+FILE);
                    return 1;
               }
           }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao criar PDF, certifique-se de que o "
                        + "arquivo nao esta sendo utilizado.");
               
                 e.printStackTrace();
               return -1;
           }
           return -2;
    }
 
}
