package javaLec.enums;

enum Direction{
	EAST(6, ">"), WEST(4, "<"), SOUTH(2,"v"), NORTH(8,"^");
	
	private final int num;
	private String symbol;
	//private?´ ?ƒ?žµ?˜?–´ ?žˆ?Œ
	Direction(int num ,String symbol){
		this.num = num;
		this.symbol = symbol;
	}
	
	public int getNum() {
		return num;
	}
	public String getSymbol() {
		return symbol;
	}
}

public class EnumDefinition {
	public static void main(String[] args) {
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr) {
			System.out.println(d.name() + " : " + d.getNum() + " : "+d.getSymbol());
		}
	}
}
