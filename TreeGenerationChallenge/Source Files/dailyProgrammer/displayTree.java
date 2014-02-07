package dailyProgrammer;

public class displayTree extends treeCreator
{
	displayTree(){}
	
	public void createLeaves()
	{
		int k;
		for(k = 0; k < 65; k++)
		{
			System.out.print("*");
		}
	}
	
	public void createTrunk()
	{
		int k;
		for(k = 0; k < 3; k++)
		{
			System.out.print(super.getTrunkStyle());
		}
	}

}
