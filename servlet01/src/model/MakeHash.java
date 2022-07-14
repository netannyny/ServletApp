package model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class  MakeHash {
	String  hashstring;
	MakeHash( String pass ) {
		// SHA-256（SHA-2）  MessageDigestクラスは、メッセージダイジェストのアルゴリズムを提供するクラス
		MessageDigest sha256;
		hashstring ="";
		try {
			sha256 = MessageDigest.getInstance("SHA-256");            //アルゴリズムを指定
			byte[] sha256_result = sha256.digest( pass.getBytes() );   //バイトに変換しハッシュ値を取得する
            hashstring = String.format("%x", new BigInteger(1, sha256_result)); //64文字出力
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
	String   getHash() {  return hashstring; }
}