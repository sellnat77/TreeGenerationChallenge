package dailyProgrammer;

public class treeCaller
{

	public static void main(String[] args) 
	{
		treeInputs christmasTree = new treeInputs();
		displayTree theTree = new displayTree();
		
		christmasTree.getInputs();
		theTree.createLeaves();
		theTree.createTrunk();


	}

}
