
public class CostaDeMarfil extends Pais{
    frances fr=new frances();
  Calcular f=new Calcular();
    private String gentilicio, moneda, capital, idioma, texto;
   private double calcular;

    public String getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public double getCalcular() {
        return calcular;
    }

    public void setCalcular(double calcular) {
        this.calcular = calcular;
    }

    public CostaDeMarfil(String pais,double cantidad, String palabra) {
         super(pais, cantidad, palabra);
        llenar();
    }
   public void llenar(){
        setGentilicio("Marfileño");
        setMoneda("Franco");
        setCapital("Yamusukro");
        setIdioma("Frances");
        setTexto( fr.traduccion(palabra));
        setCalcular(f.calcularValor((int) cantidad, 0.02));
    }
    public String implimir(){
        String  todo=" <font color=\"white\">"+"Pais: "+getPais()+" Camerún"+"<br>"+"Capital: "+getCapital()+"<br>Idioma: "+getIdioma()+"<br>Moneda: "+getMoneda()+"<br>Gentilicio: "+getGentilicio()+"<br>"+palabra+"="+getTexto()+"<br>"+cantidad+" Pesos "+"="+getCalcular()+" Francos";
        return todo;
    }
    
   
   
}
