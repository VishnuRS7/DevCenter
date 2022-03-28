import com.BikeModel.BikeModel;
import com.BikeModel.Model;

public class BikesMain 
{
	public static void main(String args[])
	{
		BikeModel BM=new BikeModel();
		Model M=BM.getInstance("BAJAJ");
		M.specs();
	}
}
