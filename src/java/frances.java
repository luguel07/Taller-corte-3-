
public class frances implements idioma {

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
                palabra="Salut";
                break;
            case "adios":
                palabra="adieu";
                break;
            case "programando":
                palabra="programmation";
                break;
            case "correr":
                palabra="courir";
                break;
            case "saltar":
                palabra="sauter";
                break;
        }
        
        return palabra;
    }
}
