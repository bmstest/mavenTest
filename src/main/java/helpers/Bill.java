package helpers;

public class Bill {
    private String id;

    public Bill(String id) {
	this.id = id;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    @Override
    public String toString() {
	return "OldBill{id='" + id + "\'}";
    }

}
