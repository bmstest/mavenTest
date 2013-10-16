package helpers;

public class NewBill {
    private String id;

    public NewBill(String id) {
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
	return "NewBill{id='" + id + "\'}";
    }
}
