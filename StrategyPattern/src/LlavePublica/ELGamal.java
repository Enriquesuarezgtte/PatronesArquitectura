/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LlavePublica;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
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
public class ELGamal extends CiframientoLlavePublica{
    private PrivateKey pk ;
	private PublicKey puk;
	private Cipher cipher ;
	private KeyPairGenerator kpg;
	private KeyPair kp;
        private String textoDescifrado;
        private String textCifrado;
	SecureRandom random; 
	
	
	public ELGamal() {		
		try {

			random = new SecureRandom();
			kpg = KeyPairGenerator.getInstance("ElGamal");
		    kp = kpg.generateKeyPair();
		    pk = kp.getPrivate();
		    puk = kp.getPublic();
                    cipher = Cipher.getInstance("ElGamal/None/NoPadding");

		    
		    
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			e.getMessage();
		}
		
	}
	
	@Override
	public String cifrar(String mensaje) {
		try {
			cipher.init(Cipher.ENCRYPT_MODE, puk, random);
			textCifrado = Base64.getEncoder().encodeToString(cipher.doFinal(mensaje.getBytes("UTF-8")));

			return textCifrado;
			
		} catch (InvalidKeyException e) {
			e.getMessage();
		} catch (UnsupportedEncodingException ex) {
                        System.out.println("Error en LlavePublica.ELGamal.descifrar()");

                } catch (IllegalBlockSizeException ex) {
                    System.out.println("Error en LlavePublica.ELGamal.descifrar()");
        } catch (BadPaddingException ex) {
                    System.out.println("Error en LlavePublica.ELGamal.descifrar()");
        }
		return null;
	}

	@Override
	public String descifrar(String mensaje) {
		
		try {
			cipher.init(Cipher.DECRYPT_MODE, pk);
			textoDescifrado= new String(cipher.doFinal(Base64.getDecoder().decode(mensaje)));
			return textoDescifrado;
		} catch (InvalidKeyException e) {
			System.out.println(e.getMessage());
		} catch (IllegalBlockSizeException | BadPaddingException ex) {
                    System.out.println("Error en LlavePublica.ELGamal.descifrar()");
                }
		
		
		return null;
	}
    
}
