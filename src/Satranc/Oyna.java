package Satranc;

import java.util.Scanner;

public class Oyna {

	public static void main(String[] args) {
		
		
		boolean hata1=false;
		boolean hata2=false;
		Tahta tahta =new Tahta();
		Koordinat koordinat=new Koordinat();
		Oyuncu beyaz=new Oyuncu();
		Oyuncu siyah=new Oyuncu();
		
		
		while(true)
		{

			if(hata2!=true)  
			{

		    tahta.yazdir(); System.out.println();
			System.out.println("Beyaz ta�l� oyuncumuz s�ra sizin,oynatmak istedi�iniz ta��n X koordinat�?");
	    	koordinat.setbasX(new Scanner(System.in).nextByte());
	    	System.out.println("Y koordinat� l�tfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
	    	System.out.println("G�t�rmek istedi�iniz x koordinat�?"); koordinat.setsonX(new Scanner(System.in).nextByte());
	    	System.out.println("G�t�rmek istedi�iniz y koordinat� ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
			
	    	if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0'
	    			|| Character.isUpperCase(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()])==true)  //bo� koordiinat veya rakip ta�� se�me durumunda 
	    		{ hata1=true;  System.out.println("Hatal� koordinat se�imi"); System.out.println(); }
	    	
	    	if(hata1!=true && tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
	    	  {
	    		hata1=false; 
	    		beyaz.koordinatiAl(koordinat);    
	    		beyaz.tahtayiAl(tahta);      
	    		
	    		   if(beyaz.tahtayaGonder()) 
	    		      {
	    			    System.out.println("hatal� koordinat giriyorsunuz "); 
	    			    hata1=true;  
	    		      }
	    	  }
	    	
	      }
	    		
			
			

			 
			//Siyah i�in beyaz hata yapmamal�
			
	    	if(hata1!=true)
	    	{

				tahta.yazdir(); System.out.println();
	    		System.out.println("Siyah ta�l� oyuncumuz s�ra sizin,oynatmak istedi�iniz ta��n X koordinat�?");
		    	koordinat.setbasX(new Scanner(System.in).nextByte());
		    	System.out.println("Y koordinat� l�tfen ?"); koordinat.setbasY(new Scanner(System.in).nextByte());
		    	System.out.println("G�t�rmek istedi�iniz x koordinat�?"); koordinat.setsonX(new Scanner(System.in).nextByte());
		    	System.out.println("G�t�rmek istedi�iniz y koordinat� ?"); koordinat.setsonY(new Scanner(System.in).nextByte());
	    	  	
	    		     if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='\0' 
	    		    		 || Character.isLowerCase(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()])==true)
	    		     { hata2=true;   System.out.println("Hatal� koordinat"); System.out.println();}
	    		
	    		      if(hata2!=true && tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]!='\0')
		    	          {
		    		        hata2=false; 
		    		        siyah.koordinatiAl(koordinat);  
		    		        siyah.tahtayiAl(tahta);     
		    		
		    		             if(siyah.tahtayaGonder())
		    		                {
		    			                System.out.println("hatal� koordinat giriyorsunuz "); 
		    		                    hata2=true; //yanl�� koordinat girmi�se 
		    		                }
		    		
		    	          }
	 
	    		
	    	 }
	    	
	    	 
		}
	
		
	}
}
