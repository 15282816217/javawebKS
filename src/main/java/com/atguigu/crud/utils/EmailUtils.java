package com.atguigu.crud.utils;

/**
 * @author wzx
 * @date 2019/6/1 - 23:39
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class EmailUtils {
    public static String achieveCode() {
        String[] beforeShuffle= new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",
                "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a",
                "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z" };
        List list = Arrays.asList(beforeShuffle);
        Collections.shuffle(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        String afterShuffle = sb.toString();
        String result = afterShuffle.substring(5, 9);
        System.out.print(result);
        return result;
    }
    // ������֤��
    public static String sendEamilCode(String eamil) {
        HtmlEmail send = new HtmlEmail();
        // ��ȡ�����֤��
        String resultCode = EmailUtils.achieveCode();
        try {
            send.setHostName("smtp.qq.com");
            send.setSmtpPort(465);//�˿ں�
            send.setSSLOnConnect(true); //����SSL����
            send.setCharset("utf-8");
            send.addTo(eamil);//�����ߵ�QQEamil
            send.setFrom("1099393970@qq.com", "�һ�����");//��һ�������Ƿ����ߵ�QQEamil�ڶ��������Ƿ�����QQ�ǳ�
            send.setAuthentication("1099393970@qq.com", "eupcpmbdkikohaef"); //��һ�������Ƿ����ߵ�QQEamil ? �ڶ��������Ǹոջ�ȡ����Ȩ��
            send.setSubject("�޸�������֤��");//Eamil�ı��� ?��һ����������д���ж������磬ɾ������
            send.setMsg("��֤��:" + resultCode );//Eamil������
            send.send();//����

        } catch (EmailException e) {
            e.printStackTrace();
        }
        return resultCode;//ͬ����֤��
    }
//    public static void main(String[] args) {
//        achieveCode();
//        sendEamilCode("1099393970@qq.com");
//   }

}
