
public class Arabe implements idioma{
    private String palabra;
    public String getPalabra() {
        return palabra;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    @Override
    public String traduccion(String p) {
        switch (p){
            case "HOLA":
                palabra="marhabaan";
                break;
            case "ADIOS":
                palabra="wadaeaan";
                break;
            case "PROGRAMANDO":
                palabra="birmija";
                break;
            case "CORRER":
                palabra="jawla";
                break;
            case "SALTAR":
                palabra="qafz";
                break;
        }
        
        return palabra;
    }
    
}
