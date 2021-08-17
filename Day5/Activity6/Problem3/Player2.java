
public class Player2 implements Comparable<Player2>{
 private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Player2(String name) {
	super();
	this.name = name;
}

@Override
public int compareTo(Player2 arg0) {
	// TODO Auto-generated method stub
	return this.name.compareTo(arg0.getName());
}
 
}
