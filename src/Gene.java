public class Gene implements Comparable <Gene>{

private int gene_id;
private String symbol;
private String Chromosome_map_location;

    public Gene(int gene_id, String symbol, String chromosome_map_location) {
        this.gene_id = gene_id;
        this.symbol = symbol;
        Chromosome_map_location = chromosome_map_location;
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
//19q13.43
    public int compareTo(Gene g){
        String[] zelf_chromosoom = this.Chromosome_map_location.split(String.valueOf('p'|'q'));
        String[] ander_chromosoom = g.Chromosome_map_location.split(String.valueOf('p'|'q'));



        if (zelf_chromosoom > ander_chromosoom) {
            if()
            return +1;
        } else if (this.Chromosome_map_location.equals(g.Chromosome_map_location)) {
            return 0;
        } else return -1; }



}
