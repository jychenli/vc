package cc.chli.vc.util;

import java.util.UUID;

import org.springframework.util.StringUtils;

public class StringUtilsExtend extends StringUtils{

	/**
	 * uuid
	 * @return
	 */
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString();
		return uuid.toUpperCase().replace("-", "");
	}
	
	/**
	 * md5
	 * @param source
	 * @return
	 */
	public static String getMD5(String source) {
		if (source == null || source == "") {
			return null;
		}
		String str = null;
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			java.security.MessageDigest md = java.security.MessageDigest
					.getInstance("MD5");
			md.update(source.getBytes());
			byte tmp[] = md.digest();
			char chstr[] = new char[16 * 2];
			int k = 0;
			for (int i = 0; i < 16; i++) {
				byte byte0 = tmp[i];
				chstr[k++] = hexDigits[byte0 >>> 4 & 0xf];
				chstr[k++] = hexDigits[byte0 & 0xf];
			}
			str = new String(chstr);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return str;
	}
}
