class Evento {
    private int id;

    private Data ocorrencia;

    private String nome;

    public Evento() {
        this.ocorrencia = new Data();
        this.nome = "";
    }

    public Data getOcorrencia(){
        return this.ocorrencia;
    }     

    public void setOcorrencia(int d, int m, int a){
        this.ocorrencia.setDia(d);
        this.ocorrencia.setMes(m);
        this.ocorrencia.setAno(a);
    }

    public int getId(){
        return this.id;
    }

    public void setId(int i){
        this.id= i;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String j){
        this.nome= j;
    }

    public String toString(){
        String all =  nome+" - "+Integer.toString(ocorrencia.getDia())+"/"+Integer.toString(ocorrencia.getMes())+"/"+Integer.toString(ocorrencia.getAno());
        return all; 
    }
}