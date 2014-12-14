package Satranc;

public class Sah extends Tas{

	
	public boolean hamleYap(Koordinat koordinat,Tahta tahta) {
		
		
		int xFark =(koordinat.getbasX() - koordinat.getsonX());
		int yFark = (koordinat.getbasY() - koordinat.getsonY());
		boolean yanlis_koordinat=false;
		int Degistir = 0;
		int Degistir2=0;
		
		//1.oyuncu i�in
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == '�')
		{
			
			//�ah�n oynama durumlar�
			if((xFark == 0 && yFark == 1) || (xFark == 1 && yFark == 1) || (xFark == 1 && yFark == 0) || (xFark == 1 && yFark == -1) || (xFark == 0 && yFark == -1) || (xFark == -1 && yFark == -1) || (xFark == -1 && yFark == 0) || (xFark == -1 && yFark == 1))
			{
				
				
				if(tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] == ' ')
				{
					Degistir = 1;
					
				}
				
				//oynanacak pozisyonda ta� varsa ve yiyebilece�i ta�lar varsa 
				else if((tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] != ' ' ) || ((tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='P') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='K') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='A') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='F') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=='V')))
				{
					Degistir = 1;
					
				}

			}
			
			//Beyaz i�in rok (1. durum)
			if(((koordinat.getbasY() == 7 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 7 && koordinat.getsonX() == 6)) && (tahta.tahta[7][7] == 'k') && 
					(tahta.tahta[5][7] == ' ' && tahta.tahta[6][7] == ' ') && tahta.tahta[4][7] == '�')
			{
				Degistir2 = 3;
				
			}
			//Beyaz i�in rok (2.durum)
			else if(((koordinat.getbasY() == 7 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 7 && koordinat.getsonX() == 2)) && (tahta.tahta[0][7] == 'k') && 
					(tahta.tahta[1][7] == ' ' && tahta.tahta[2][7] == ' ' && tahta.tahta[3][7] == ' ') && tahta.tahta[4][7] == '�')
			{
				Degistir2 = 4;
			}
			
		}
		
		//2.oyuncu i�in
		if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == '�')
		{
			//�ah�n oynama durumlar�
			if((xFark == 0 && yFark == 1)|| (xFark == 1 && yFark == 1) || (xFark == 1 && yFark == 0) || (xFark == 1 && yFark == -1) || (xFark == 0 && yFark == -1) || (xFark == -1 && yFark == -1) || (xFark == -1 && yFark == 0) || (xFark == -1 && yFark == 1) )
			{
				
				if(tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] != ' ')
				{
					Degistir = 2;
				}
				//oynanacak pozisyonda ta� varsa ve yiyebilece�i ta�lar varsa 
				else if((tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] != ' ' ) && ((tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='p') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='k') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='a') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] == 'f') || (tahta.tahta[koordinat.getbasY()][koordinat.getbasX()] =='v')))
				{
					Degistir = 2;
				}

				
			}
			
			
			// Siyah i�in rok(1.durum)
			if(((koordinat.getbasY() == 0 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 0 && koordinat.getsonX() == 6)) && (tahta.tahta[7][0] == 'K') && 
					(tahta.tahta[5][0] == ' ' && tahta.tahta[6][0] == ' ') && tahta.tahta[4][0] == '�')
			{
				Degistir2 = 5;
				
			}
			
			//Siyah oyuncu i�in rok(2.durum)
			else if(((koordinat.getbasY() == 0 && koordinat.getbasX() == 4) && (koordinat.getsonY() == 0 && koordinat.getsonX() == 2)) && (tahta.tahta[0][0] == 'K') && 
					(tahta.tahta[1][0] == ' ' && tahta.tahta[2][0] == ' ' && tahta.tahta[3][0] == ' ') && tahta.tahta[4][0] == '�')
			{
				Degistir2 = 6;
				
			}
			
		}
		
		if(Degistir == 0)  yanlis_koordinat=true;
		
		if(Degistir == 1)
		{
			tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] = '�';
		}
		else if(Degistir == 2)
		{
			tahta.tahta[koordinat.getbasY()][koordinat.getbasX()]=' ';
			tahta.tahta[koordinat.getsonY()][koordinat.getsonX()] = '�';
		
		}
		
		//Beyaz i�in rok(Durum 1)
		if(Degistir2 == 3)
		{
			tahta.tahta[6][7] = '�';
			tahta.tahta[5][7] = 'k';
			tahta.tahta[4][7] = ' ';
			tahta.tahta[7][7] = ' '; 
			System.out.println("Beyaz oyuncu Rok yapt�");
		}
		
		//Beyaz i�in rok(Durum 2)
		else if(Degistir2 == 4)
		{
			tahta.tahta[2][7] = '�';
			tahta.tahta[2][7] = 'k';
			tahta.tahta[4][7] = ' ';
			tahta.tahta[0][7] = ' '; 
			System.out.println("Beyaz oyuncu Rok yapt�");
		}
		//Siyah i�in rok(Durum 1)
		else if(Degistir2 == 5)
		{
			tahta.tahta[6][0] = '�';
			tahta.tahta[5][0] = 'K';
			tahta.tahta[4][0] = ' ';
			tahta.tahta[7][0] = ' '; 
			System.out.println("Siyah oyuncu Rok yapt�");
		}
		
		//Siyah i�in rok(Durum 2) 
		else if(Degistir2 == 6)
		{
			tahta.tahta[2][0] = '�';
			tahta.tahta[3][0] = 'K';
			tahta.tahta[4][0] = ' ';
			tahta.tahta[0][0] = ' '; 
			System.out.println("Siyah oyuncu Rok yapt�");
		}
		
		System.out.println();
		return yanlis_koordinat;
		
	}

}
