package com.company;

import java.util.Scanner;

public class switch_tanlash {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("a = ");
        int a=scanf.nextInt();
        System.out.print("b = ");
        int b=scanf.nextInt();
        System.out.println("amalni kiriting : ");
        String amal=scanf.next();
        //1-masala
        /*
        switch (a){
            case 1 :
                System.out.println("do'shanba");break;
            case 2:
                System.out.println("seshanba");break;
            case 3 :
                System.out.println("chorshanba");break;
            case 4 :
                System.out.println("payshanba");break;
            case 5 :
                System.out.println("juma");break;
            case 6 :
                System.out.println("shanba");break;
            case 7 :
                System.out.println("yakshanba");break;
            default:
                System.out.println("bunday hafta kuni yo'q");break; }
    //2-masala
        switch (a){
            case 1 :
                System.out.println("yomon");break;
            case 2 :
                System.out.println("qoniqarsiz");break;
            case 3 :
                System.out.println("qoniqarli");break;
            case 4 :
                System.out.println("yaxshi");break;
            case 5 :
                System.out.println("a'lo");break;
            default:
                System.out.println("xato"); break;}
     //3-masala
        switch (a){
            case 1 :
            case 2 :
            case 12 :
                System.out.println("qish");break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("bahor");break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("yoz");break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("kuz");break;
            default:
                System.out.println("bunday oy yo'q"); }
     //4-masala
        switch (a){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("31 kun");break;
            case 2 :
                System.out.println("28 kun");break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("30 kun");break;
            default:
                System.out.println("bunday oy yo'q"); }
     //5-masala
        switch (amal){
            case "qoshish" :
                System.out.print("yig'indi : "+(a+b));break;
            case "ayirish" :
                System.out.print("ayirma : "+(a-b));break;
            case "kopaytirish" :
                System.out.print("kopaytma : "+(a*b));break;
            case "bolish" :
                System.out.print("bolinma : "+(a/b));break;
            case "+" :
                System.out.print("yig'indi : "+(a+b));break;
            case "-" :
                System.out.print("ayirma : "+(a-b));break;
            case "*" :
                System.out.print("kopaytma : "+(a*b));break;
            case "/" :
                System.out.print("bolinma : "+(a/b));break;
            default:
                System.out.print("bunday amal topilmadi");break;}
     //6-masala
        switch (amal){
            case "ditsemetr" :
                System.out.println("1 m = 10 dtm");break;
            case "kilometr" :
                System.out.println("1 km = 1000 m ");break;
            case "santimetr" :
                System.out.println("1 m = 100 sm");break;
            case "milimetr" :
                System.out.println("1 m = 1000 mm");break;
            default:
                System.out.println("bunday birlik topilmadi");}
     //7-masala
        switch (amal){
            case "tonna " :
                System.out.println("1 t = 1000 kg");break;
            case "miligramm" :
                System.out.println("1 kg = 1000000 mg");break;
            case "gramm" :
                System.out.println("1 kg = 1000 g");break;
            case "sentner" :
                System.out.println("1 s = 100 kg");break;
            default:
                System.out.println("bunday birlik topilmadi"); }
     //8-masala
     switch (b){
         case 1 :
             System.out.println(a+" yanvar");break;
         case 2 :
             System.out.println((a-31)+" fevral");break;
         case 3 :
             System.out.println((a-31-28)+" mart");break;
         case 4 :
             System.out.println((a-31-28-31)+" aprel");break;
         case 5 :
             System.out.println((a-31-28-31-30)+" may");break;
         case 6 :
             System.out.println((a-31-28-31-30-31)+" iyun");break;
         case 7 :
             System.out.println((a-31-28-31-30-31-30)+" iyul");break;
         case 8 :
             System.out.println((a-31-28-31-30-31-30-31)+" avgust");break;
         case 9 :
             System.out.println((a-31-28-31-30-31-30-31-31)+" sentabr");break;
         case 10 :
             System.out.println((a-31-28-31-30-31-30-31-31-30)+" oktabr");break;
         case 11 :
             System.out.println((a-31-28-31-30-31-30-31-31-30-31)+" noyabr");break;
         case 12 :
             System.out.println((a-31-28-31-30-31-30-31-31-30-31-30)+" dekabr");break;
         default:
             System.out.println("bunday oy yo'q"); }
      //9-masala
             switch (b){
         case 1 :
             System.out.println((a+1)+" yanvar");break;
         case 2 :
             System.out.println((a-31+1)+" fevral");break;
         case 3 :
             System.out.println((a-31-28+1)+" mart");break;
         case 4 :
             System.out.println((a-31-28-31+1)+" aprel");break;
         case 5 :
             System.out.println((a-31-28-31-30+1)+" may");break;
         case 6 :
             System.out.println((a-31-28-31-30-31+1)+" iyun");break;
         case 7 :
             System.out.println((a-31-28-31-30-31-30+1)+" iyul");break;
         case 8 :
             System.out.println((a-31-28-31-30-31-30-31+1)+" avgust");break;
         case 9 :
             System.out.println((a-31-28-31-30-31-30-31-31+1)+" sentabr");break;
         case 10 :
             System.out.println((a-31-28-31-30-31-30-31-31-30+1)+" oktabr");break;
         case 11 :
             System.out.println((a-31-28-31-30-31-30-31-31-30-31+1)+" noyabr");break;
         case 12 :
             System.out.println((a-31-28-31-30-31-30-31-31-30-31-30+1)+" dekabr");break;
         default:
             System.out.println("bunday oy yo'q"); }
     //10-masala
            switch (amal){
                case "g" :
                    System.out.print("g'arbga ");break;
                case "j" :
                    System.out.print("janubga ");break;
                case "sh" :
                    System.out.print("sharqga ");break;
                case "s" :
                    System.out.print("shimolga ");break;
                default:
                    System.out.println("bunday buyruq yo'q");
            }
            switch (a){
                case 0 :
                    System.out.print("harakatni davom ettir");break;
                case 1 :
                    System.out.print("chapga buril");break;
                case 2 :
                    System.out.print("o'ngga buril");break;
                default:
                    System.out.println("bunday harakat yo'q"); }
     //11-masala
            switch (amal){
                case "g" :
                    System.out.print("g'arbga ");break;
                case "j" :
                    System.out.print("janubga ");break;
                case "sh" :
                    System.out.print("sharqga ");break;
                case "s" :
                    System.out.print("shimolga ");break;
                default:
                    System.out.println("bunday buyruq yo'q");
            }
            switch (a){
                case 0 :
                    System.out.print("harakatni davom ettir");break;
                case 1 :
                    System.out.print("chapga buril");break;
                case 2 :
                    System.out.print("burilish 180 gradus");break;
                default:
                    System.out.println("bunday harakat yo'q"); }
     //12-masala
        switch (a){
            case 1 :
                System.out.println("radius : "+b);break;
            case 2 :
                System.out.println("diametr :"+(2*b));break;
            case 3 :
                System.out.println("uzunligi : "+(2*b*Math.PI));break;
            case 4 :
                System.out.print("yuza : "+(Math.PI*b*b));break;
            default:
                System.out.println("bunday amal yoq"); }
    //13-14-masala
        switch (a){
            case 1 :
                System.out.println("kateti" + a);break;
            case 2 :
                System.out.println("gipotenuzasi "+(a*Math.sqrt(2)));break;
            case 3 :
                System.out.println("balandlik "+(a*Math.sqrt(2)*1./2));break;
            case 4 :
                System.out.println("yuza "+(a*a*1./2));break;
            default:
                System.out.println("bunday amal yoq"); }
    //15-masala
        switch (a){
            case 6 :
                System.out.println("olti ");break;
            case 7 :
                System.out.println("yetti");break;
            case 8 :
                System.out.println("sakkiz");break;
            case 9 :
                System.out.println("to'qqiz");break;
            case 10 :
                System.out.println("o'n ");break;
            case 11 :
                System.out.println("valet");break;
            case 12 :
                System.out.println("dama");break;
            case 13 :
                System.out.println("karol");break;
            case 14:
                System.out.println("tuz");break;
            default:
                System.out.println("bunday karta nomi yo`q"); }
         switch (b){
             case 1 :
                 System.out.println("g'isht");break;
             case 2 :
                 System.out.println("olma");break;
             case 3 :
                 System.out.println("chillak");break;
             case 4 :
                 System.out.println("qarg'a");break;
             default:
                 System.out.println("bunday karta yo'q"); }
     //16-masala
        switch (a-a%10){
            case 20 :
                System.out.print("yigirma");break;
            case 30 :
                System.out.print("o'ttiz");break;
            case 40 :
                System.out.print("qirq");break;
            case 50 :
                System.out.print("ellik");break;
            case 60 :
                System.out.print("oltimish");break;
            default:
                System.out.println("xato");}
         switch (a%10) {
             case 1 :
                 System.out.print(" bir");break;
             case 2 :
                 System.out.print(" ikki");break;
             case 3 :
                 System.out.print(" uch");break;
             case 4 :
                 System.out.print(" tort");break;
             case 5 :
                 System.out.print(" besh");break;
             case 6 :
                 System.out.print(" olti");break;
             case 7 :
                 System.out.print(" yetti");break;
             case 8 :
                 System.out.print(" sakkiz");break;
             case 9 :
                 System.out.print(" to'qqiz");break;
             default:
                 System.out.println("xato");}
        System.out.println(" yosh");
     //17-masala
        switch (a-a%10){
            case 10 :
                System.out.print("o'n");break;
            case 20 :
                System.out.print("yigirma");break;
            case 30 :
                System.out.print("o'ttiz");break;
            case 40 :
                System.out.print("qirq");break;
            default:
                System.out.println("xato");}
         switch (a%10) {
             case 1 :
                 System.out.print(" bir");break;
             case 2 :
                 System.out.print(" ikki");break;
             case 3 :
                 System.out.print(" uch");break;
             case 4 :
                 System.out.print(" tort");break;
             case 5 :
                 System.out.print(" besh");break;
             case 6 :
                 System.out.print(" olti");break;
             case 7 :
                 System.out.print(" yetti");break;
             case 8 :
                 System.out.print(" sakkiz");break;
             case 9 :
                 System.out.print(" to'qqiz");break;
             default:
                 System.out.println("xato");}
        System.out.println("ta masala");*/
     //18-masala
        switch (a - a%100){
            case 100 :
                System.out.print("bir yuz");break;
            case 200 :
                System.out.print("ikki yuz");break;
            case 300 :
                System.out.print("uch yuz");break;
            case 400 :
                System.out.print("tort yuz");break;
            case 500 :
                System.out.print("besh yuz");break;
            case 600 :
                System.out.print("olti yuz");break;
            case 700 :
                System.out.print("yetti yuz");break;
            case 800 :
                System.out.print("sakkiz yuz");break;
            case 900 :
                System.out.print("to'qqiz yuz");break; }
        switch (a%100/10){
            case 0 :
                System.out.print("");break;
            case 1 :
                System.out.print(" o'n");break;
            case 2 :
                System.out.print(" yigirma");break;
            case 3 :
                System.out.print(" o'ttiz");break;
            case 4 :
                System.out.print(" qirq");break;
            case 5 :
                System.out.print(" ellik");break;
            case 6 :
                System.out.print(" oltimish");break;
            case 7 :
                System.out.print(" yetimish");break;
            case 8 :
                System.out.print(" sakson");break;
            case 9 :
                System.out.print(" to'qson");break;}
        switch (a%10){
            case 1 :
                System.out.print(" bir");break;
            case 2 :
                System.out.print(" ikki");break;
            case 3 :
                System.out.print(" uch");break;
            case 4 :
                System.out.print(" tort");break;
            case 5 :
                System.out.print(" besh");break;
            case 6 :
                System.out.print(" olti");break;
            case 7 :
                System.out.print(" yeti");break;
            case 8 :
                System.out.print(" sakkiz");break;
            case 9 :
                System.out.print(" to'qqiz");break;}
    }
}
