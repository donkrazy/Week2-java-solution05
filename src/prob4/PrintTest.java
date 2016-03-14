package prob4;

public class PrintTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		printer.println( 10 );
		printer.println( true );
		printer.println( 5.7 );
		printer.println( "홍길동" );
		
		printer.printObjects( "1" );
		System.out.println( "" );
		printer.printObjects( "2", 10 );
		System.out.println( "" );
		printer.printObjects( "2", 10, new Printer() );
		
	}
}
