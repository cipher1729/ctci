package ctci;

public class People {

	public int weight;
	public int height;
	People(int height, int weight)
	{
		this.weight= weight;
		this.height= height;
	}
	public int compare(People people)
	{
		if(this.weight >= people.weight && this.height >= people.height)
			return 1;
		else if(this.weight < people.weight && this.height < people.height)
			return -1;
		else
			return 0;
		
	}
}
