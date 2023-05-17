
package enumeracion;


public enum Continentes {
    AFRICA(53),
    EUROPA(23),
    ASIA(43),
    AMERICA(24),
    OCEANIA(6);
    
    private final int paises;
    //S e puede colocar mas atributos y se puede aumentar en cada valor parta que siga creciendo
    Continentes(int paises){
        this.paises=paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
