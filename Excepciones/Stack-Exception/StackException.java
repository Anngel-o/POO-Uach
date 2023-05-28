import java.util.EmptyStackException;
import java.util.Stack;

public class StackException{
    // Las operaciones básicas son push (que introduce un elemento en la pila), pop (que saca un elemento de la pila), peek (consulta el primer elemento de la cima de la pila), empty (que comprueba si la pila está vacía) y search (que busca un determinado elemento dentro de la pila y devuelve su posición dentro de ella)

    // Uno de los casos más usados en informática de una pila es el de querer verificar si una determinada sentencia o instrucción está equilibrada en cuanto a número de paréntesis, corchetes o llaves de apertura y cierre. Cuando se escribe código de programación si no existe equilibrio entre signos de apertura (por ejemplo un paréntesis de apertura) y cierre (por ejemplo un paréntesis de cierre) ni siquiera debería procesarse la sentencia ya que no estaría formalmente bien construida. De esto se encargan los analizadores léxicos de los compiladores.
    public static void main(String[] args) throws Exception{
        try {
            String cad1 = "( Cadena no equilibrada en paréntesis( ()()() )) ) )";
            String cad2 = "(Cadena equilibrada en parentesis())";
            System.out.print("La cadena uno es: ");
            checkParenths(cad1);
            System.out.print("La cadena dos es: ");
            checkParenths(cad2);
            System.out.println("Buscar cadena 1 en la pila: ");
        } catch (EmptyStackException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public static void checkParenths(String cad) throws EmptyStackException{
        Stack<String> stack = new Stack<String>();
        int i = 0;
        while (i < cad.length()){//Se recorre la cadena carácter por caractér {
            if (cad.charAt(i) == '(') { //Se apila si el paréntesis es de apertura
                stack.push("(");
            }
            else if (cad.charAt(i) == ')') {
                if (!stack.empty()) { //Si la pila no está vacía desapilamos
                    stack.pop();
                }
                else { //La pila no puede empezar con un cierre, se apila y salimos
                    stack.push(")");
                    break;
                }
            }
            i++;
        }
        if (stack.empty()) {
            System.out.println("Equilibrada");
        } else {
            System.out.println("No Equilibrada");
        }

        int pos = stack.search(cad);
        if (!stack.empty()) {
            if (pos > 0) {
                System.out.println("La posición del elemento es: " + pos);
            }
        } else {
            throw new EmptyStackException();
        }
    }
}

// Programa tomado como referencia didáctica para implementación de Stack:
// DIDACTICA Y DIVULGACIÓN DE LA PROGRAMACIÓN.
// https:www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=608:la-estructura-de-datos-pila-en-java-clase-stack-del-api-java-ejemplo-simple-y-ejercicios-resueltos-cu00923c&catid=58&Itemid=180
