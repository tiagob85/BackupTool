
import backuptool.classes.FolderCopy;
import backuptool.gui.FrMain;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.apache.commons.io.FileUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Projeto - BackupTool");
   
        FrMain objFr = new FrMain();
        objFr.setVisible(true);
      
    }//metodo main
}
