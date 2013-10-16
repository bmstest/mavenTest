/**
 * 
 */
package foo;

public enum EActionFileFolder {

	MOVE,
	DELETE;
	
	public String value() {
        return name();
    }
	
	public static EActionFileFolder fromValue(String v){
		return valueOf(v);
	}
}
