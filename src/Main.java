public class Main {

    public static void main(String[] args) {
        Persona jose = new Persona("jose", "perdedor", 20);
        jose.comer();
        jose.dormir();
        System.out.println(jose.hacerLoSuyo());

        Estudiante MechonLetal = new Estudiante("mechon", "dcc", 2);
        MechonLetal.comer();
        MechonLetal.dormir();
        System.out.println(MechonLetal.hacerLoSuyo());

        Academico Godoy = new Academico("Matias Godoy", "el mismisimo", 21, "como rajar muy facil 1 link mediafire");
        Godoy.comer();
        Godoy.dormir();
        System.out.println(Godoy.hacerLoSuyo());
        System.out.println("mi paper se llama " + Godoy.publicarPaper());

    }
}
