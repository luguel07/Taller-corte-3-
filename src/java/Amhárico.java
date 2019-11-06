
public class Amhárico implements idioma{
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
                palabra="selami";
                break;
            case "adios":
                palabra="dehina huni";
                break;
            case "programando":
                palabra="pirogirami";
                break;
            case "correr":
                palabra="merot’i";
                break;
            case "saltar":
                palabra="zileli";
                break;
        }
        
        return palabra;
    }
}
