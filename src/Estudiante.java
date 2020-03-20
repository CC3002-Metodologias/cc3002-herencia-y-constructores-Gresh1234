public class Estudiante extends Persona {
    public Estudiante(String nombre, String ocupacion, int edad) {
        super(nombre, ocupacion, edad);
    }
    public void comer() {
        System.out.println("Ñom Ñom completos de gorbea");
    }

    public void dormir() {
        System.out.println("ZzzZzZ");
    }

    public String hacerLoSuyo() {
        return "La peli de Death Note en Netflix esta buenisima loco ajjaj ".concat(super.hacerLoSuyo());
    }

}
