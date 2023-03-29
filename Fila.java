public class Fila {
    private String impressora;
    private int qtFolhas;
    private static  Fila  _fila;
    public static Fila getInstance(){
        if (_fila == null)
        {
            _fila = new Fila();
        }
        return _fila;
    }
    public void setImpressora(String impressora)
    {
        this.impressora = impressora;
    }
    public void setFolhas(int qtFolhas)
    {
        this.qtFolhas = qtFolhas;
    }
    public String getImpressora()
    {
        return impressora;
    }
    public int getFolhas()
    {
        return qtFolhas;
    }
    private Fila() {

    }
}
