package com.javarush.task.task21.task2101;

/*
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = {(byte) 192, (byte) 168, 1, 2};
        byte[] mask = {(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        int minByteLength = ip.length < mask.length ? ip.length : mask.length;
        byte[] netAddress = new byte[minByteLength];
        for (int i = 0; i < minByteLength; i++) {
            netAddress[i] = (byte) (ip[i] & mask[i]);
        }
        return netAddress;
    }

    public static void print(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(Integer.toBinaryString(bytes[i] & 255 | 256).substring(1) + " ");
        }
        System.out.println();
    }
}
