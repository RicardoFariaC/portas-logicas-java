public class PortaNand {
  private Porta a;
  private Porta b;
  private Porta saida;

  PortaNand() {

  }

  PortaNand(String a, String b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaNand(Porta a, Porta b) {
    this.a = a;
    this.b = b;
  }

  PortaNand(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaNand(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  public PortaNand nand() {
    saida = new Porta();
    saida.setEstado(!(a.getEstado() && b.getEstado()));
    return this;
  }

  public boolean getEstadoSaida() {
    return saida.getEstado();
  }

  public PortaNand setPortaNand(Porta a, Porta b) {
    this.a = a;
    this.b = b;
    return this.nand();
  }

  public PortaNand setPortaNand(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
    return this.nand();
  }

  public PortaNand setPortaNand(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
    return this.nand();
  }

  public String toString() {
    return String.format("a: %d, b: %d, saida: %d", a.getEstadoInt(), b.getEstadoInt(), saida.getEstadoInt());
  }

  public Porta getA() {
    return a;
  }

  public Porta getB() {
    return b;
  }

  public void setA(Porta a) {
    this.a = a;
  }

  public void setB(Porta b) {
    this.b = b;
  }

  public Porta getSaida() {
    return saida;
  }

}
