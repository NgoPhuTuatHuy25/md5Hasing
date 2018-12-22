/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MD5;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author HuyNgo
 */
public class runApp {
    public static String getmd5(String password)throws NoSuchAlgorithmException{
        //khoi tao doi tuong
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        //tao ma xac thuc
        messageDigest.update(password.getBytes());
        byte[] message = messageDigest.digest();
        //tao mot chuoi trong
        StringBuffer sb = new StringBuffer();
        for(byte b1 :message){
            sb.append(Integer.toHexString(b1 & 0xFF).toString());
        }
        return sb.toString();
}

public static void main(String[] args) throws NoSuchAlgorithmException {
    jFrame_MD5 j  = new jFrame_MD5();
    j.setVisible(true);
    j.setLocationRelativeTo(null);
       // System.out.println(getmd5("password"));
    j.dangNhap.show();
    j.dangKi.hide();
    j.trangChu.hide();
    }
    
}
