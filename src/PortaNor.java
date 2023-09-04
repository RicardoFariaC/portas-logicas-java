public class PortaNor {
  private Porta a;
  private Porta b;
  private Porta saida;

  PortaNor() {

  }

  PortaNor(String a, String b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaNor(Porta a, Porta b) {
    this.a = a;
    this.b = b;
  }

  PortaNor(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaNor(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  public PortaNor nor() {
    saida = new Porta();
    saida.setEstado(!(a.getEstado() || b.getEstado()));
    return this;
  }

  public boolean getEstadoSaida() {
    return saida.getEstado();
  }

  public PortaNor setPortaNor(Porta a, Porta b) {
    this.a = a;
    this.b = b;
    return this.nor();
  }

  public PortaNor setPortaNor(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
    return this.nor();
  }

  public PortaNor setPortaNor(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
    return this.nor();
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
