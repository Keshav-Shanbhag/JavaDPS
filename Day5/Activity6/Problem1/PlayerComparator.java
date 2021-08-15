import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	@Override
	public int compare(Player arg0, Player arg1) {
		// TODO Auto-generated method stub
		if(arg0.getSkill().compareTo(arg1.getSkill())==0)
		{
			return arg0.getName().compareTo(arg1.getName());
		}
		else
			return arg0.getSkill().compareTo(arg1.getSkill());
	}

}
