import javax.swing.JOptionPane;

class Limonada {
  private int vasos = 100, cucharadas = 80;
  private float azucar = 0.50f, sinAzucar = 0.45f;

  void resultado(int option) {
    int numeroVasos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de vasos"));
    vasos -= numeroVasos;
    if (option == 1) {
      while (true) {
        try {
          option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de curachadas"));
          cucharadas -= option;
          System.out.printf(
              "Su limonada tiene un costo de %s\nNumero de vasos: %s, Cantidad de curachadas de azucar: %s",
              azucar, vasos, cucharadas);
          break;
        } catch (Exception e) {
          System.err.println(e);
        }
      }
    } else {
      while (true) {
        try {
          option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de curachadas"));
          cucharadas -= option;
          System.out.printf(
              "Su limonada tiene un costo de %s\nNumero de vasos: %s, Cantidad de curachadas de azucar: %s",
              sinAzucar, vasos, cucharadas);
          break;
        } catch (Exception e) {
          System.err.println(e);
        }
      }
    }
  }
}