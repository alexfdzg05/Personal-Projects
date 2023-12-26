package CacharreoString;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String linea = "Hola caracola";
        String vacio = "";
        System.out.println("Utilidad del charAt():");
        System.out.println(linea.charAt(0));
        System.out.println(linea.charAt(1));
        System.out.println(linea.charAt(4));
        System.out.println("Utilidad del length():");
        System.out.println(linea.length());
        System.out.println("Vacío: ");
        System.out.println(linea.isEmpty());
        System.out.println(vacio.isEmpty());
        System.out.println(linea.isBlank());
        System.out.println(vacio.isBlank());
        System.out.println("equals: ");
        System.out.println(linea.equals(vacio));
        System.out.println("startswith:");
        System.out.println(linea.startsWith("Ho"));
        System.out.println(linea.startsWith("asdfjas"));
        System.out.println(vacio.startsWith(" "));
        System.out.println("endswith:");
        System.out.println(linea.endsWith("la"));
        System.out.println(linea.endsWith("lasdf"));
        System.out.println(vacio.endsWith(" "));
        System.out.println("indexOf:");
        System.out.println(linea.indexOf("Hola"));
        System.out.println(vacio.indexOf("Hola"));
        System.out.println("CompareTo:");
        System.out.println(linea.compareTo(linea));
        System.out.println(linea.compareTo(vacio));
        System.out.println("substring:");
        System.out.println(linea.substring(2));
        System.out.println(linea.substring(1,2));
        System.out.println("trim:");
        System.out.println(linea.trim());
        System.out.println("toUpperCase:");
        System.out.println(linea.toUpperCase());
        System.out.println("toLowerCase:");
        System.out.println(linea.toLowerCase());
        System.out.println("format:");
        System.out.println();

        System.out.println("split:");
        System.out.println(linea.split(""));
        System.out.println("replaceAll:");
        System.out.println(linea.replaceAll(vacio,linea));



    }
}
