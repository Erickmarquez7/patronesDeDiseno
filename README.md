# Patrones de Diseño
Conocer los distintos patrones de diseño. 

Los ejemplos no necesariamente están relacionados entre sí, son solo diferentes situaciones en que se podría aplicar dicho Patrón

## Tipos de patrones

* [Comportamiento](src/comportamiento/):
Se encargan de una comunicación efectiva y la asignación de responsabilidades entre objetos.
  * [Command](src/comportamiento/command/)
  * [Observer](src/comportamiento/observer/) 
  * [State](src/comportamiento/state/)
  * [Strategy](src/comportamiento/strategy/)

* [Creación](src/creacion/): 
Como su nombre lo indica, proporcionan soluciones
a posibles problemas que podemos tener en la creación de ejemplares de Clases, haciendo uso del encapsulamiento.
  * [Singleton](src/creacion/singleton/)
  * [Prototype](src/creacion/prototype/)
  * [Factory Method](src/creacion/factory/)

* [Estructurales](src/estructurales/):
Solucionan los problemas de composición entre clases
para que puedan trabajar juntos, sin precisamente ser
dependientes entre sí.
  * [Decorator](src/estructurales/decorator/)
  * [Adapter](src/estructurales/adapter/)
## Principios del diseño:

1. Identificar lo que cambia de lo constante. Encapsula lo que varia

2. Programar la interfaz o super tipo, no la clase 

3. Favorecer la composición sobre la herencia

4. Esforzarse por hacer diseños debilemente acoplados,
esto da más flexibilidad

5. Las clases deben estar abiertas para extender, pero
cerradas para modificar

6. Dependa de abstracciones. No de las clases concretas. 