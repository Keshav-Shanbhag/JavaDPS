import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Team2 {
	private String name;
	private ArrayList<Player2> List=new ArrayList<Player2>();
	
	public String getName() {
		return name;
	}
	public Team2(String name) {
		super();
		this.name = name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Player2> getList() {
		return List;
	}
	public void setList(ArrayList<Player2> list) {
		List = list;
	}
	public void addPlayer(String playername){
		this.List.add(new Player2(playername));
	}
	public ArrayList<Player2> getPlayerList()
	{
		Collections.sort(List);
		
		return List;
		
	}
	
}
