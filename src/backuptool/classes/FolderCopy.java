/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backuptool.classes;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Usuario
 */
public class FolderCopy {
    
    String DirOrigin;
    String DirDest;
    File FOrig;
    File FDest;
    boolean StatusReturn;
    
    public FolderCopy()
    {
    }//construtor
    
    public void setFolderOrigin(String directoryOrigin){
        DirOrigin = directoryOrigin;
    }
    
    public void setFolderDest(String directoryDest){
        DirDest = directoryDest;
    }
    
    //Retorna o diretório de origem
    File getFolderOrigin(){
        FOrig = new File(DirOrigin.replace("\\", "\\\\"));
        return FOrig;
    }
    
    //Retorna o diretório de origem
    File getFolderDest(){
        FDest = new File(DirDest.replace("\\", "\\\\"));
        return FDest;
    }    
    
    //Copia os arquivos e subpastas do diretorio origem para o diretorio destino.
    public boolean CopyDirectory(){
        StatusReturn = false;

        //Verifica se os diretórios não são iguais.
        if (DirDest.equals(DirOrigin)) 
        {
            StatusReturn = false;
        } 
        else 
        {
            try 
            {
                FileUtils.copyDirectoryToDirectory(getFolderOrigin(), getFolderDest());
                StatusReturn = true;
            } catch (IOException ex) {
                Logger.getLogger(FolderCopy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return StatusReturn;
    }
    
}//classe FolderCopy
