package Basic;

public class bottlesofbeeronthewall {
	public static void main(String[] args) {
	
	for(int beers = 99; beers > 0; beers--){
		System.out.printf("%d bottles of beer on the wall, ", beers);
		System.out.printf("%d botles of beer. take one down pass it around ", beers);
		System.out.printf("%d bottles of beer on the wall! \n", beers-1);
		
	}
}
}
