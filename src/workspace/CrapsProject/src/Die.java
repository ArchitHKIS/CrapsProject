package workspace.CrapsProject.src;

public class Die {
private int numDots = 1; //numbers of dots on the die facing tops
public void roll(){
	numDots=(int)((Math.random()*6)+1);
	}
public int getNumDots(){
	return numDots;
	}



}

