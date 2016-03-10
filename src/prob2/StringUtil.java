package prob2;

public class StringUtil {
    public static String concatenate( String[] str ){
        //문자열을 결합하여 리턴하는 메소드 구현
    	if( str == null || str.length == 0 ) {
    		return null;
    	}
    	
    	StringBuffer sb = new StringBuffer( str[0] );
    	for( int i = 1; i < str.length; i++ ) {
    		sb.append( str[ i ] );
    	}
    	
    	return sb.toString();
    }

    public static void main(String args[])  {         
        String[] strArr = { "SuperMan", "BatMan", "SpiderMan" };
        String resultStr = concatenate( strArr );
        System.out.println( "결과 문자열 : " + resultStr ); 
    }
}

