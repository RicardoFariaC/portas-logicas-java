public class PortaXnor {
  private Porta a;
  private Porta b;
  private Porta saida;

  PortaXnor() {

  }

  PortaXnor(String a, String b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaXnor(Porta a, Porta b) {
    this.a = a;
    this.b = b;
  }

  PortaXnor(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaXnor(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  public PortaXnor xnor() {
    saida = new Porta();
    saida.setEstado(!((!a.getEstado() && b.getEstado()) || (!b.getEstado() && a.getEstado())));
    return this;
  }

  public boolean getEstadoSaida() {
    return saida.getEstado();
  }

  public PortaXnor setPortaXnor(Porta a, Porta b) {
    this.a = a;
    this.b = b;
    return this.xnor();
  }

  public PortaXnor setPortaXnor(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
    return this.xnor();
  }

  public PortaXnor setPortaXnor(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
    return this.xnor();
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
