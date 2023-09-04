public class PortaOr {
  private Porta a;
  private Porta b;
  private Porta saida;

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

  PortaOr() {

  }

  PortaOr(String a, String b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaOr(Porta a, Porta b) {
    this.a = a;
    this.b = b;
  }

  PortaOr(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  PortaOr(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(b);
  }

  public PortaOr or() {
    saida = new Porta();
    saida.setEstado(a.getEstado() && b.getEstado());
    return this;
  }

  public boolean getEstadoSaida() {
    return this.saida.getEstado();
  }

  public PortaOr setPortaOr(Porta a, Porta b) {
    this.a = a;
    this.b = b;
    return this.or();
  }

  public PortaOr setPortaOr(boolean a, boolean b) {
    this.a = new Porta(a);
    this.b = new Porta(a);
    return this.or();
  }

  public PortaOr setPortaOr(int a, int b) {
    this.a = new Porta(a);
    this.b = new Porta(a);
    return this.or();
  }

  public String toString() {
    return String.format("a: %d, b: %d, saida: %d", a.getEstadoInt(), b.getEstadoInt(), saida.getEstadoInt());
  }

  public static void main(String[] args) {
    PortaAnd porta = new PortaAnd(1, 0);
    System.out.println(porta.and());
    porta.getA().off();
    System.out.println(porta.and());
    porta.getA().on();
    porta.getB().on();
    porta.and();
    System.out.println(porta);
    porta.setPortaAnd(1, 0);
    System.out.println(porta.and());

  }
}
