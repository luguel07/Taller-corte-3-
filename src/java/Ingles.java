
public class Ingles implements idioma{

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
            case "hola":
                palabra="hi";
                break;
            case "adios":
                palabra="bye";
                break;
            case "programando":
                palabra="programming";
                break;
            case "correr":
                palabra="run";
                break;
            case "saltar":
                palabra="jump";
                break;
        }
        
        return palabra;
    }
}
