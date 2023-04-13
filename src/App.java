import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        Limonada limonada = new Limonada();
        boolean salir = true;
        while (salir) {
            try {
                int option = Integer.parseInt(JOptionPane.showInputDialog("1. Para vaso endulzado\n2. Para sin dulce"));
                switch (option) {
                    case 1:
                        limonada.resultado(option);
                        salir = false;
                        break;
                    case 2:
                        limonada.resultado(option);
                        salir = false;
                        break;
                    default:
                        System.out.println("Ingrese un numero entre 1 y 2");
                        break;
                }
            } catch (Exception e) {
                System.err.println(e);
            }

        }

    }
}
