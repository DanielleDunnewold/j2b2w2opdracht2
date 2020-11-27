import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        String filename="C:\\Users\\ddunn\\IdeaProjects\\j2b2w2opdracht2\\src\\Homo_sapiens.gene_info";
        ArrayList genes= readFile(filename);
        System.out.println(genes);
        Collections.sort(genes);
        System.out.println(genes);

    }


    public static ArrayList readFile(String filename) {
        String line;
        BufferedReader inFile = null;
        try {
            inFile = new BufferedReader(new FileReader(filename));
            ArrayList<Gene> genes=new ArrayList<>();
            inFile.readLine();
            while ((line = inFile.readLine()) != null) {
                   String[] attributes=line.split("\t");
                    int gene_id=Integer.parseInt(attributes[1]);
                    String symbol= attributes[2];
                    String Chromosome_map_location =attributes[7];
                    genes.add(new Gene(gene_id,symbol,Chromosome_map_location));
            }
            return genes;


        }
        catch (IOException|NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            return null;
        }
        finally {
            try {
                inFile.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage());
            }
        }
}}
