import java.awt.Color;
import java.util.ArrayList;
public class DataOfSquare 
{
	
	ArrayList<Color> C =new ArrayList<Color>();
	int color; //2: background , 1: food, 0:snake 
	SquarePanel square;
	public DataOfSquare(int col){
		
		//Lets add the color to the arrayList
		C.add(Color.blue);//0
		C.add(Color.green);    //1
		C.add(Color.black);   //2
		color=col;
		square = new SquarePanel(C.get(color));
	}
	public void lightMeUp(int c){
		square.ChangeColor(C.get(c));
	}
}
