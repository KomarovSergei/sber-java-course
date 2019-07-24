import java.util.Date;

public class DUL {
  private String type;
  private String seria;
  private String numberCode;
  private Date date;

  public void setType(String type) { this.type = type; }

  public void setSeria(String seria) { this.seria = seria; }

  public void setNumberCode(String numberCode) { this.numberCode = numberCode; }

  public void setType(Date date) { this.date = date; }

  public DUL(String type, String seria, String numberCode, String code, Date date){
    this.type = type;
    this.seria = seria;
    this.numberCode = numberCode;
    this.date = date;
  }

  public DUL(){ }
}
