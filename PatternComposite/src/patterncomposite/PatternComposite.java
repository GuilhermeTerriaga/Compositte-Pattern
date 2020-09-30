/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterncomposite;

/**
 *
 * @author guilherme
 */
public class PatternComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Imagem imagem = new Imagem("paisagem.jpg");
        
        Texto texto = new Texto("monografia.docx");
        
        Video video = new Video("aula_java.avi");
        
        Pasta meusDocumentos = new Pasta("Meus documentos");
        meusDocumentos.addArquivo(imagem);
        meusDocumentos.addArquivo(texto);
        
        Pasta meusVideos = new Pasta("Meus videos");
        meusVideos.addArquivo(video);
        
        meusDocumentos.addArquivo(meusVideos);
    }
    
}
