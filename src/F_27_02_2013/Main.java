package F_27_02_2013;

public class Main {



    /*
    DIFERENCIAS ENTRE ESTA IMPLEMENTACION Y LA COMBINABLE:

         - La implementacion combinable permite (justamente) combinar las matrices en tiempo de ejecucion. La primera
            implementacion, mas rigida, no permite una combinacion de las clases en ninguna instancia. Todas trabajan
            sobre matrices basicas.
         - Permite tambien la modificacion del comportamiento de los OBJETOS sin modificar las clases. Es decir, se puede
            implementar un cambio en un objeto determinado sin afectar a todos los otros de la misma subclase.
         - La implementacion rigida no permite estas combinaciones/modificaciones. Favorece la herencia como metodo
            de modificacion antes que la composicion. Si en el futuro se quiere implementar una matriz que registre
            las lecturas y escrituras, tengo que armar una clase nueva y repetir codigo.
     */
}
