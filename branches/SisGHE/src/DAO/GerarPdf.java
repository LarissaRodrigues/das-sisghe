/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Aluno;
import DisciplinasCursadas.Modelo.*;
import Disciplinas.Modelo.Disciplina;
import Disciplinas.Modelo.Turma;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class GerarPdf {
    
    private static Font titleFont = new Font (Font.FontFamily.HELVETICA, 20, Font.BOLD);
    private static Font disciplinaFont = new Font (Font.FontFamily.HELVETICA,9,Font.ITALIC,BaseColor.BLUE);
    private static Font listaDisciplinaFont = new Font (Font.FontFamily.HELVETICA,9,Font.ITALIC,BaseColor.RED);
    
    private static Aluno aluno;
    private static ArrayList<DisciplinaCursada> disciplinaCursada;
    private static ArrayList<Disciplina> listaDisciplina;
    private static String arquivo;
    private static String tipo;

    
    public GerarPdf(Aluno aluno, ArrayList<DisciplinaCursada> disciplinaCursada) {
        this.aluno = aluno;
        this.disciplinaCursada = disciplinaCursada;
    }

    public GerarPdf(Aluno aluno,ArrayList<DisciplinaCursada> disciplinaCursada,ArrayList<Disciplina> listaDisciplina){
        this.aluno = aluno;
        this.disciplinaCursada = disciplinaCursada;
        this.listaDisciplina = listaDisciplina;
    }
    
       public GerarPdf(Aluno aluno, ArrayList<Disciplina> listaDisciplina, int i) {
        this.aluno = aluno;
        this.listaDisciplina = listaDisciplina;
    }
       public GerarPdf(Aluno aluno,ArrayList<DisciplinaCursada> disciplinaCursada,ArrayList<Disciplina> listaDisciplina, String arquivo,String tipo){
        this.aluno = aluno;
        this.disciplinaCursada = disciplinaCursada;
        this.listaDisciplina = listaDisciplina;
        this.arquivo = arquivo;
        this.tipo = tipo;
    }
       
    
    public static void addLinhaVazia(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
          paragraph.add(new Paragraph(" "));
        }//fim do for    
    }//fim func
    
    public static void addMetaDados(Document document){

        document.addTitle("Grade Horaria - "+ aluno.getMatricula() + aluno.getNome());
        document.addSubject("geredo por SISGHE");
        document.addKeywords("Grade , Horaria, UnB");
        document.addAuthor(System.getProperty("user.name"));
        document.addCreator("Gandalf, the white");
    }
    
    public static void addConteudo(Document document) throws DocumentException{
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
                          + "Semestre: "+aluno.getSemestre());    
        para.add(aux);

        addLinhaVazia(para,2);
        
        //adiciona disciplinas cursadas ao documento
        aux = new Paragraph("Disciplinas Cursadas (COD - NOME _ pre req)\n", disciplinaFont);
        for (int i =0;i<disciplinaCursada.size();i++){
        aux.add(disciplinaCursada.get(i).getCodigo() + " - " 
                + disciplinaCursada.get(i).getNome() + " - "
                + disciplinaCursada.get(i).getCod_preReq()+ "\n");
        }
        aux.add("\n\n");
        para.add(aux);
         


        //adicinar tudo no documento
        document.add(para);
            
    
    };
    private void addConteudoDisciplinas(Document document)throws DocumentException{
            Paragraph para = new Paragraph();
            Paragraph aux;
            aux = new Paragraph("Disciplinas Disponiveis (COdigo - Nome - Codigo do Prerequisito) \n",listaDisciplinaFont);
            for(int i=0;i<listaDisciplina.size();i++){
                aux.add(listaDisciplina.get(i).getCodigo() + " - " 
                + listaDisciplina.get(i).getNome() + " - "
                + listaDisciplina.get(i).getPre_req()+ "\n");
         }
         para.add(aux);
         document.add(para);
         
    
    }
    public  void gerarPdf(){
        //System.out.println("GERAR PDF = "+ aluno.toString());
        //System.out.println("GERAR PDF = " + disciplinaCursada.toString());
        Document document = new Document();
           //nessa parte que ocorre a principal integração entre o itext e o sistema e java
           //indica qual fluxo de saida ele vai
           String FILE = arquivo;
           
           //FILE = "C:/temp/funfou.pdf";
           try{
               if(tipo == "Aluno"){
                    PdfWriter.getInstance(document, new FileOutputStream(FILE));
                    document.open();
                    addMetaDados(document);//metodos os quais irei criar abaixo (deveriam estar em outra classe na minha opiniao
                    addConteudo(document);
                    document.close();
                    JOptionPane.showMessageDialog(null, "PDF salvo em:\n"+FILE);
               }if(tipo == "Lista Disciplinas"){
                    PdfWriter.getInstance(document, new FileOutputStream(FILE));
                    document.open();
                    addMetaDados(document);//metodos os quais irei criar abaixo (deveriam estar em outra classe na minha opiniao
                    addConteudoDisciplinas(document);
                    document.close();
                    JOptionPane.showMessageDialog(null, "PDF salvo em:\n"+FILE);
               }if(tipo == "Completo"){
                    PdfWriter.getInstance(document, new FileOutputStream(FILE));
                    document.open();
                    addMetaDados(document);//metodos os quais irei criar abaixo (deveriam estar em outra classe na minha opiniao
                    addConteudo(document);
                    addConteudoDisciplinas(document);
                    document.close();
                    JOptionPane.showMessageDialog(null, "PDF salvo em:\n"+FILE);
               }
           }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao criar PDF, certifique-se de que o "
                        + "arquivo nao esta sendo utilizado.");
               e.printStackTrace();
           }   
    }
    //TODO: melhorar forma de salvar o PDF, como inserir grade horaria, e disciplinas cursadas, futuramente
    // o usuario podera selecionar quais elementos ele quer no PDF
    
    
}
