import java.util.Date;

public class Client extends Person {
  private Date birthday;
  private DUL document;

  public Client(String fio, Date birthday, DUL document) {
    super(fio);
    this.birthday = birthday;
    this.document = document;
  }

  public Client() {}
}
