/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LlavePublica;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author ingenierias
 */
public class RSA extends CiframientoLlavePublica{
  private PrivateKey pk = null;
	private PublicKey puk = null;
	private Cipher cipher = null;
	private KeyPairGenerator kpg;
	private KeyPair kp;
        String textCifrado;
        String textoDescifrado;
	public RSA() {		
		try {
			kpg = KeyPairGenerator.getInstance("RSA");
		    kp = kpg.generateKeyPair();
		    pk = kp.getPrivate();
		    puk = kp.getPublic();
		    cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		    
		} catch (NoSuchAlgorithmException e) {
			e.getMessage();
		} catch (NoSuchPaddingException e) {
			e.getMessage();
		}
	   
		
	}
	
	@Override
	public String cifrar(String mensaje) {
		try {
			cipher.init(Cipher.ENCRYPT_MODE, puk);
                    textCifrado = Base64.getEncoder().encodeToString(cipher.doFinal(mensaje.getBytes("UTF-8")));

			return textCifrado;
			
		} catch (InvalidKeyException e) {
			e.getMessage();
		} catch (UnsupportedEncodingException ex) {
          Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IllegalBlockSizeException ex) {
          Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
      } catch (BadPaddingException ex) {
          Logger.getLogger(RSA.class.getName()).log(Level.SEVERE, null, ex);
      }
		return "";
	}

	@Override
	public String descifrar(String mensaje) {
		
		try {
			cipher.init(Cipher.DECRYPT_MODE, pk);
            textoDescifrado= new String(cipher.doFinal(Base64.getDecoder().decode(mensaje)));
			return textoDescifrado;
		} catch (InvalidKeyException e) {
			System.out.println(e.getMessage());
		} catch (IllegalBlockSizeException e) {
			System.out.println(e.getMessage());
		} catch (BadPaddingException e) {
			System.out.println(e.getMessage());
		}	
		
		
		return null;
	}
        

}
