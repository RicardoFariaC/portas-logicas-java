public class PortaAnd {
  private Porta a;
  private Porta b;
  private Porta saida;

  PortaAnd() {

  }

  PortaAnd(String a, String b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaAnd(Porta a, Porta b) {
    this.a = a;
    this.b = b;
  }

  PortaAnd(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaAnd(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  public PortaAnd and() {
    saida = new Porta();
    saida.setEstado(a.getEstado() && b.getEstado());
    return this;
  }

  public boolean getEstadoSaida() {
    return saida.getEstado();
  }

  public PortaAnd setPortaAnd(Porta a, Porta b) {
    this.a = a;
    this.b = b;
    return this.and();
  }

  public PortaAnd setPortaAnd(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
    return this.and();
  }

  public PortaAnd setPortaAnd(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
    return this.and();
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

  public Porta getSaida() {
    return saida;
  }

  public void setA(Porta a) {
    this.a = a;
  }

  public void setB(Porta b) {
    this.b = b;
  }

}
