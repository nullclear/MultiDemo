package ENUM;

/**
 * 错误枚举类
 * 
 * @author Nuclear
 *
 */
public enum ErrorIndex {
	ClientError(302, "ClientError"), NotFound(404, "NotFount"), SeverError(500, "SeverError");
	
	private int index;
	private String value;

	private ErrorIndex(int index, String value) {
		this.index = index;
		this.value = value;
	}

	/**
	 * 传入index返回对应的value
	 * 
	 * @param index
	 * @return String
	 */
	public static String Value(int index) {
		for (ErrorIndex e : ErrorIndex.values()) {
			if (e.index == index) {
				return e.value;
			}
		}
		return null;
	}

	/**
	 * 传入value 返回对应的index
	 * 
	 * @param value
	 * @return int
	 */
	public static int Index(String value) {
		for (ErrorIndex e : ErrorIndex.values()) {
			if (e.value == value) {
				return e.index;
			}
		}
		return 0;
	}
}
