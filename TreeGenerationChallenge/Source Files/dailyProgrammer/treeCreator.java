package dailyProgrammer;
import java.util.Scanner;

public class treeCreator 
{
	
	treeCreator(){}
	treeCreator(int A, char B, char C)
	{
		treeBase = A;
		trunkStyle = B;
		leafStyle = C;
	}
	
	public int getTreeBase()
	{
		return treeBase;
	}
	public char getTrunkStyle()
	{
		return trunkStyle;
	}
	public char getLeafStyle()
	{
		return leafStyle;
	}
	
	public void setTreeBase(int A)
	{
		treeBase = A;
	}
	public void setTrunkStyle(char A)
	{
		trunkStyle = A;
	}
	public void setLeafStyle(char A)
	{
		leafStyle = A;
	}
	
	public void recieveTreeBase()
	{
		System.out.println("How large will the base of your tree be?");
		this.setTreeBase(userInput.nextInt());
	}
	
	public void recieveTrunkStyle()
	{
		String tempTrunk;
		System.out.println("Enter a char for the trunk of your tree.");
		tempTrunk = userInput.next();
		this.setTrunkStyle(tempTrunk.charAt(0));
	}
	
	public void recieveLeafStyle()
	{
		String tempLeaf;
		System.out.println("Enter a char for the leaves of your tree.");
		tempLeaf = userInput.next();
		this.setLeafStyle(tempLeaf.charAt(0));
	}
	
	
	private int treeBase;
	private char trunkStyle;
	private char leafStyle;
	private Scanner userInput = new Scanner(System.in);
}
