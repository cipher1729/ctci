package ctci;

public class BitManip {

	public static char swapTwoNibblesInByte(char x)
	{
		return (char) ( (x&0b11110000>>4) | (x&0b00001111<<4));
	}
}
