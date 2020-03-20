public class Academico extends Persona {
    protected String paper;
    public Academico(String nombre, String ocupacion, int edad, String paper) {
        super(nombre, ocupacion, edad);
        this.paper = paper;
    }
    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZz");
    }

    public String hacerLoSuyo() { return "como c usa esto xddd ".concat(super.hacerLoSuyo()); }

    public String publicarPaper() { return this.paper; }
}
