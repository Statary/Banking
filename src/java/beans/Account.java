package beans;

public class Account {
    private Integer ID;
    private String fio;
    private String doc;
    private Integer balance;

//    public Account(Integer ID, String fio, String doc, Integer balance) {
//        this.ID = ID;
//        this.fio = fio;
//        this.doc = doc;
//        this.balance = balance;
//    }

    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public String getDoc() {
        return doc;
    }
    public void setDoc(String doc) {
        this.doc = doc;
    }
    public Integer getBalance() {
        return balance;
    }
    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
