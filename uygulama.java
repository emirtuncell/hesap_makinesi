package hesap_makinesi;

import java.util.Scanner;

public class uygulama {
      public static void main(String[] args) {
		
    	  Scanner scan=new Scanner(System.in);
    	  int islem,sayi1,sayi2,sayi,us; 
    	  
    	  System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ: \n 1-TOPLAMA \n 2-ÇIKARMA"
    	  		+ "\n 3-ÇARPMA \n 4-BÖLME \n 5-ÜS ALMA \n");
    	 islem=scan.nextInt();
    	 
    	 System.out.println("SAYI 1= ");
    	 sayi1=scan.nextInt();
    	 
    	 System.out.println("SAYI 2= ");
    	 sayi2=scan.nextInt();
    	 
    	 
    	 
    	
    	 hesap_makinesi m1=new hesap_makinesi(sayi1,sayi2);
    	 
    	 switch(islem) {
    	 case 1: System.out.println("TOPLAMA SONUCU=  "+m1.toplama());
    	 break;
    	 case 2: System.out.println("ÇIKARMA SONUCU=  "+m1.cikarma());
break;
    	 case 3: System.out.println("ÇARPMA SONUCU=  "+m1.carpma());
break;
    	 case 4: System.out.println("BÖLME SONUCU=  "+m1.bolme());
break;
    	 case 5: System.out.println("ÜS SONUCU= "+m1.power());
    	 break;
    	 
    	 }
	}
	
      
}
