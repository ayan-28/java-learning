import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {

	public static void main(String[] args) {
		//Sorting simple class objects with single value
		List<Integer> randomList = new ArrayList<>();
		randomList.add(10);
		randomList.add(30);
		randomList.add(50);
		randomList.add(40);
		
		System.out.println("Before Sorting : " + randomList);
		Collections.sort(randomList);
		System.out.println("After Sorting : " + randomList);
		
		//sorting Objects having multiple attributes
		List<Player> footballTeam = new ArrayList<>();
		Player player1 = new Player(59, "St. John", 20);
		Player player2 = new Player(67, "Roger", 22);
		Player player3 = new Player(45, "Anthony Steven", 24);
		footballTeam.add(player1);
		footballTeam.add(player2);
		footballTeam.add(player3);
		
		System.out.println("Before Sorting : " + footballTeam);
		PlayerRankingComparator playerRankingComparator = new PlayerRankingComparator();
		Collections.sort(footballTeam, playerRankingComparator);
		System.out.println("After Ranking Sort  : " + footballTeam);
		//executing some statements
		
		PlayerNameComparator playerNameComparator = new PlayerNameComparator();
		Collections.sort(footballTeam, playerNameComparator);
		
		System.out.println("After Name Sort  : " + footballTeam);

	}

}


class PlayerRankingComparator implements Comparator<Player>{
	@Override
	public int compare(Player player1, Player player2) {
		return player1.getRanking() - player2.getRanking();
	}
}

class PlayerNameComparator implements Comparator<Player>{
	@Override
	public int compare(Player player1, Player player2) {
		return player1.getName().compareToIgnoreCase(player2.getName());
	}
}

class Player implements Comparable<Player>{
	private int ranking;
	private String name;
	private int age;
	
	public Player(int ranking, String n, int age) {
		this.ranking = ranking;
		this.name = n;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "ranking = " +ranking + ", name = " + name + ", age = " + age;
	}

	public int getRanking() {
		return ranking;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Player otherPlayer) {
		return otherPlayer.getRanking() - this.getRanking();
	}
	
}
