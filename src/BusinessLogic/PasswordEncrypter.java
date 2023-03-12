package BusinessLogic;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncrypter {

    public static String encrypt(String password) {
        try {
            // Obtener una instancia de MessageDigest con el algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Convertir la contraseña en bytes y pasarla a MessageDigest para ser encriptada
            md.update(password.getBytes());
            
            // Obtener el hash resultante como un arreglo de bytes y convertirlo a hexadecimal
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            // Si el algoritmo MD5 no está disponible, lanzar una excepción
            throw new RuntimeException("Error al encriptar la contraseña", e);
        }
    }
}