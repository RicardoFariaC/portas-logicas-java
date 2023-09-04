public class PortaXor {
  private Porta a;
  private Porta b;
  private Porta saida;

  PortaXor() {

  }

  PortaXor(String a, String b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaXor(Porta a, Porta b) {
    this.a = a;
    this.b = b;
  }

  PortaXor(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaXor(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  public PortaXor xor() {
    saida = new Porta();
    saida.setEstado((!a.getEstado() && b.getEstado()) || (!b.getEstado() && a.getEstado()));
    return this;
  }

  public boolean getEstadoSaida() {
    return saida.getEstado();
  }

  public PortaXor setPortaXor(Porta a, Porta b) {
    this.a = a;
    this.b = b;
    return this.xor();
  }

  public PortaXor setPortaXor(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
    return this.xor();
  }

  public PortaXor setPortaXor(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
    return this.xor();
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
