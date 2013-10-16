package helpers;

public class DTO {

    int no;
    Gender gender;
    State state;
    String name;

    public DTO(int i, String name, Gender gender, State state) {
	this.no = i;
	this.name = name;
	this.gender = gender;
	this.state = state;
    }

    public int getNo() {
	return no;
    }

    public void setNo(int no) {
	this.no = no;
    }

    public Gender getGender() {
	return gender;
    }

    public void setGender(Gender gender) {
	this.gender = gender;
    }

    public State getState() {
	return state;
    }

    public void setState(State state) {
	this.state = state;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return "DTO [no=" + no + ", gender=" + gender + ", state=" + state + ", name=" + name + "]";
    }

}
