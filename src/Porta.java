public class Porta {
  private boolean estado;

  public void setEstado(boolean estado) {
    this.estado = estado;
  }

  public void setEstado(int estado) {
    if (estado == 0) {
      this.estado = false;
    } else if (estado == 1) {
      this.estado = true;
    } else {
      System.out.println("Estado não encontrado!");
    }
  }

  public boolean getEstado() {
    return this.estado;
  }

  public int getEstadoInt() {
    return getEstado() ? 1 : 0;
  }

  Porta() {
  }

  Porta(boolean estado) {
    this.estado = estado;
  }

  Porta(int estado) {
    if (estado == 0) {
      this.estado = false;
    } else if (estado == 1) {
      this.estado = true;
    } else {
      System.out.println("Estado não encontrado!");
    }
  }

  Porta(String estado) {
    if (estado == "on") {
      this.estado = true;
    } else if (estado == "off") {
      this.estado = false;
    } else {
      System.out.println("Estado não encontrado!");
    }
  }

  public Porta not() {
    this.estado = !this.estado;
    return this;
  }

  public String toString() {
    return String.format("estado: %d", estado ? 1 : 0);
  }

  public Porta on() {
    this.estado = true;
    return this;
  }

  public Porta off() {
    this.estado = false;
    return this;
  }

  public static void main(String[] args) {
    Porta p = new Porta(0);
    System.out.println(p);
    p.setEstado(true);
    System.out.println(p);
    p.off();
    System.out.println(p);
    p.on();
    System.out.println(p);
    p.setEstado(0);
    System.out.println(p);
    p.not();
    System.out.println(p);

  }

}
