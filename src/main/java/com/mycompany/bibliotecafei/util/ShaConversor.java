package com.mycompany.bibliotecafei.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Zinedinne
 */
public class ShaConversor {
    
    public String convertir (String cadena){
 
        String sha256 = DigestUtils.sha256Hex(cadena);
 
        return sha256;  
    }
}