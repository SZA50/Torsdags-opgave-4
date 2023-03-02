// 1a Create a class Main with a main method.
class Main {
	public static void main (String [] args){
		Team Team1 = new Team ("Phone ");
		Team Team2 = new Team (" Animal");
		Team Team3 = new Team (" Koffe ");
		Team Team4 = new Team (" World ");
		Team Team5 = new Team (" Capital ");

		Team1.setRank  (2);
		Team2.setRank  (1);
		Team3.setRank  (3);
		Team4.setRank  (4);
		Team5.setRank  (5);

		System.out.println(Team1.toString ());
		System.out.println(Team2.toString ());
		System.out.println(Team3.toString ());
		System.out.println(Team4.toString ());
		System.out.println(Team5.toString ());


	}



	
}