package Java;

public class ZmienneString {
    public static void main(String[] args) { 
        String text = "   Nauka Java od podstaw ";
        
        text = text.trim();
        text = text.toUpperCase();
        System.out.println(text.substring(6));
    }
}
