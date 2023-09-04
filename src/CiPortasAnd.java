public class CiPortasAnd {
  private PortaAnd portas[];

  CiPortasAnd(int qtdPortasAnd) {
    this.portas = new PortaAnd[qtdPortasAnd];
    for (int i = 0; i < qtdPortasAnd; i++) {
      this.portas[i] = new PortaAnd(0, 0).and();
    }
  }

  public PortaAnd[] getPortas() {
    return portas;
  }

  public PortaAnd getPorta(int index) {
    return portas[index];
  }

  public String toString() {
    for (int i = 0; i < portas.length; i++) {
      System.out.println(String.format(
          "porta[%d] = + { \"a\":\"%d\", \"b\":\"%d\", \"saida\":\"%d\"}",
          i, this.portas[i].getA().getEstadoInt(), this.portas[i].getB().getEstadoInt(),
          this.portas[i].getSaida().getEstadoInt()));
    }
    return "";
  }

  public static void main(String[] args) {
    CiPortasAnd ci = new CiPortasAnd(4);
    ci.getPorta(1).setPortaAnd(1, 1);
    System.out.println(ci);
  }

}
