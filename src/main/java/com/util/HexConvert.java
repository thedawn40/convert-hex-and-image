package com.util;

public class HexConvert {

    public static String byteToHex(byte[] b) throws Exception {
		String result = "";
		for (int i=0; i < b.length; i++) {
		  result +=
				Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
		}
		return result;
	  }

    public static String stringToHex(String str){
		StringBuffer sb = new StringBuffer();
        char ch[] = str.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			String hexString = Integer.toHexString(ch[i]);
			sb.append(hexString);
		}
		String result = sb.toString();
		return result;
    }

	public static String hexToString(String str){
		String result = new String();
		char[] charArray = str.toCharArray();
		for(int i = 0; i < charArray.length; i=i+2) {
			String st = ""+charArray[i]+""+charArray[i+1];
			char ch = (char)Integer.parseInt(st, 16);
			result = result + ch;
		}
		return result;
	}

	public static byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
								 + Character.digit(s.charAt(i+1), 16));
		}
		return data;
	}
    
}
