package herenciasimple2;
class Animal{
    double peso_usuario_animal;
    double peso_usuario;

void MostrarCaracteristicasPeso(){
    System.out.println("El peso del usuario más el peso del animal es: "
                        +peso_usuario_animal+" Libras " +
                       "\nEl peso del usuario es: "+peso_usuario+" Libras");
 }
}
//Herencia simple: Una subclase de Animal es Gato
class Gato extends Animal{
    String tipo;
    double CalcularPeso(){
        return peso_usuario_animal-peso_usuario;
    }
    void mostrarTipo(){
        System.out.println("El Tipo de Animal es: "+tipo);
    }
}
//Herencia simple: Una subclase de Animal es Perro
class Perro extends Animal{
    String tipo;
    double CalcularPeso(){
        return peso_usuario_animal-peso_usuario;
    }
    void mostrarTipo(){
        System.out.println("El Tipo de Animal es: "+tipo);
    }
}
public class Herenciasimple2 {
    public static void main(String[] args) {
        Gato gato1=new Gato();
        Perro perro1=new Perro();

        gato1.peso_usuario_animal=134;
        gato1.peso_usuario=130;
        gato1.tipo="Gato Tailandés";

        perro1.peso_usuario_animal=144;
        perro1.peso_usuario=130;
        perro1.tipo="Perro Dálmata";

        System.out.println("Información para Gato: ");
        gato1.mostrarTipo();
        gato1.MostrarCaracteristicasPeso();
        System.out.println("El peso del gato es: "+gato1.CalcularPeso()+" Libras");
        System.out.println("");

        System.out.println("Información para Perro: ");
        perro1.mostrarTipo();
        perro1.MostrarCaracteristicasPeso();
        System.out.println("El peso del perro es: "+perro1.CalcularPeso()+" Libras");
    }
}
