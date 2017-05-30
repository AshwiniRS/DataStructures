import java.util.*;

public class OrignalOriginAndDestination {

	public static void findOriginDestination(List<BoardingPass> listBP){
		HashSet<String> source = new HashSet<String>();
		HashSet<String> destination = new HashSet<String>();
		
		for(BoardingPass bp : listBP){
			if(!source.contains(bp.source))
				source.add(bp.source);
			if(!destination.contains(bp.destination))
				destination.add(bp.destination);			
		}
		HashSet<String> temp = new HashSet<String>();
		temp.addAll(source);
		source.removeAll(destination);
		System.out.println(source.toString());
		destination.removeAll(temp);
		System.out.println(destination.toString());
		
}
	
	
	public static void main(String[] args) {
		List<BoardingPass> listBP = new ArrayList<BoardingPass>();
		listBP.add(new BoardingPass("Pune","Mumbai"));
		listBP.add(new BoardingPass("Mumbai","Gujarat"));
		listBP.add(new BoardingPass("Gujarat","Hydrebad"));
		listBP.add(new BoardingPass("Hydrebad","Bihar"));
		
		findOriginDestination(listBP);
	}

}
class BoardingPass{
	String source;
	String destination;
	
	BoardingPass(String source,String destination){
		this.source = source;
		this.destination = destination;
	}
}