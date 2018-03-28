        /* //////////////////////////////////////////////////////////////////////////////////////////////////////
        *                                             TP2 
        * Ciclo de Ejecucion :
        *
        *   -Primero se crea un objeto Auto, el cual extiende de Observable.
        *
        *   -Se crea un objeto Mecanico el cual Implementa Observer, por lo cual seria el observador.
        *
        *   -Se agrega como observador del objeto Auto al objeto Mecanico.
        *
        *   -Dentro de la clase Auto, en el metodo apagar(), se modifican los valores de las variables de dicha
        *   clase segun el tiempo que se mantuvo el auto encendido.
        *   Una ves realizados los cambios se marca que hubo un cambio en la clase, setChanged () y luego se notifica a
        *   sus observadores de dicho cambio notifyObservers ().
        *
        *   -Se notifica al observador de dichos cambios enviando un HashMap de los nuevos datos generados mediante       
        *   notifyObservers().
        *
        *   -En la clase Observer (Mecanico) , se captura la actualizacion de los datos mediante un metodo sobre-escrito 
        *   de la interfaz de Observer, Update().
        *
        *   -En el Objeto Mecanico, se comparan los nuevos valores y se notifica por consola, si es un valor critico para
        *   el auto. Es decir el Mecanico toma la desicion de que realizar con los nuevos valores del Auto y el Auto solo
        *   se encarga de notificar dichos cambios.
        *
        *
        * Metodo Update():
        *
        *   -El metodo Update() se ejecuta una ves que se hallan realizados los cambios del Auto y este Notifica de
        *   dichos cambios.
        *   Los argumentos que se pasan al metodo Update(), son un objeto del tipo Observable, y un objeto del tipo
        *   Object, en el cual residira los cambios que se hallan notificado mediante el notifyObservers().
        *
        /* //////////////////////////////////////////////////////////////////////////////////////////////////////
        *                                               OBSERVACIONES
        *
        * El AUTO es la clase observada (OBSERVABLE), por lo que el mismo notifica si ah habido un cambio en el.
        *
        * El MECANICO recive dicha notificacion y observa el auto (OBSERVER),por lo que el decide que hacer con
        * dicha modificacion .
        *
        * El OBSERVER debe conocer todo acerca de su clase observada OBSERVABLE, en cambio el OBSERVABLE no tiene por
        * que conocer a su observador. Es decir el OBSERVER esta fuertemente acoplado.
        *
        *
        *
        * ///////////////////////////////////////////////////////////////////////////////////////////////////////
        *                                               Notas
        *
        * (1) - El descuento de los valores se realiza una ves apagado el auto, por lo que al realizar la resta puede
        * llegar a valores negativos, eso no se encuentra contemplado en esta resolucion.
        *
        *
        * (2) - El desgaste es el coeficiente por el cual va a disminuir dicho atributo, en el TEST realizado:
        *
        *
        * El nivel de Aceite deciende (0.10 Lts) por cada segundo transcurrido.
        * El nivel de Agua deciende (0.50 Lts) por cada segundo transcurrido.
        * La precion de los neumaticos deciende (0.05 BAR's) por cada segundo transcurrido.
        *
        *
        * (3) - En los botones de la GUI se encuentra contemplado que el usuario trate de encender
        * el auto cuando este ya se encuentra encendido, o el caso contratio con el apagado del mismo.
        *
        *
        * (4) - Cada ves que el auto se detiene, el mecanico revisara el auto.
        *
        * /////////////////////////////////////////////////////////////////////////////////////////////////////// */
