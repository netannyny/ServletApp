package scopedata;
public class UserData {
	private String id;
	private String pass;
	private String name;
	public UserData() {}
	public UserData(String _id,String _pass,String _name) {
		id = _id; pass = _pass; name = _name;
	}
	public String getId() {return id;}
	public String getPass() {return pass;}
	public String getName() {return name;}
}