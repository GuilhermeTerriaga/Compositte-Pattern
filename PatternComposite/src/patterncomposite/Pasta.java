/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterncomposite;

import java.util.*;

/**
 *
 * @author guilherme
 */
public class Pasta extends Arquivo{
    private List<Arquivo> arquivos = new ArrayList<Arquivo>();

    public Pasta(String nome) {
        super(nome);
    }
    
    public void addArquivo(Arquivo arquivo){
       this.arquivos.add(arquivo);
    }
    
    
}
