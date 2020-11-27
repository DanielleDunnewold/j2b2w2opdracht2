import javax.swing.*;
import java.util.Arrays;

public class Gene implements Comparable <Gene>{

private int gene_id;
private String symbol;
private String Chromosome_map_location;
static private int amount;

    public Gene(int gene_id, String symbol, String chromosome_map_location) {
        this.gene_id = gene_id;
        this.symbol = symbol;
        Chromosome_map_location = chromosome_map_location;
        amount++;
    }

    public int getGene_id() {
        return gene_id;
    }

    public void setGene_id(int gene_id) {
        this.gene_id = gene_id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getChromosome_map_location() {
        return Chromosome_map_location;
    }

    public void setChromosome_map_location(String chromosome_map_location) {
        Chromosome_map_location = chromosome_map_location;

    }

    public int compareTo(Gene g){
       try{
        String[] zelf_chromosoom = this.getChromosome_map_location().split("p|q");
        String[] ander_chromosoom = g.getChromosome_map_location().split("p|q");

        if (this.getChromosome_map_location().equals(g.getChromosome_map_location())) {
            return 0; }
        else if (zelf_chromosoom[0].equals("-")||ander_chromosoom[0].equals("-")){
            return 0; }
        else if(ander_chromosoom[0].equals("X")&& zelf_chromosoom[0].equals("Y")){
            return -1; }
        else if(ander_chromosoom[0].equals("Y")&& zelf_chromosoom[0].equals("X")){
            return +1; }
        else if (zelf_chromosoom[0].equals("X") || zelf_chromosoom[0].equals("Y")){
            return -1; }
        else if (ander_chromosoom[0].equals("X") || ander_chromosoom[0].equals("Y")){
            return +1; }

        else if (Integer.parseInt(zelf_chromosoom[0]) > Integer.parseInt(ander_chromosoom[0])) {
            return +1;
        }
        else{return -1;
        }
       }
         catch(NumberFormatException numberformatexception) {
           JOptionPane.showMessageDialog(null,numberformatexception.getMessage());
            return 0; } }}
