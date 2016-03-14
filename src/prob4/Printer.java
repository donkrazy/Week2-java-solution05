package prob4;

public class Printer {
//	public void println( int value ) {
//		System.out.println( value );
//	}
//	
//	public void println( boolean value ) {
//		System.out.println( value );
//	}
//
//	public void println( double value ) {
//		System.out.println( value );
//	}
//	
//	public void println( String value ) {
//		System.out.println( value );
//	}
	
	public <T> void println( T t ) {
		System.out.println( t );
	}
	
	public void printObjects( Object... objects ){
		for( Object object : objects ) {
			System.out.print( object );
		}
	}
}
