public class Operator extends Person{
  private String login;
  private String vsp;

  public Operator(String login, String vsp) {
    super(login);
    this.vsp = vsp;
  }

  public Operator(){}
}
