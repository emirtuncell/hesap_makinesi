package hesap_makinesi;

public class hesap_makinesi {
	int sayi1;
    int sayi2;
    int sayi;
    int us;
    
    hesap_makinesi(int sayi1,int sayi2){
    this.sayi1=sayi1;
  	  this.sayi2= sayi2;
  	  
    }
    
    public int toplama() {
  	  return this.sayi1 + this.sayi2;
    }
    
    public int cikarma() {
  	  return this.sayi1 - this.sayi2;
    }
    
    public int carpma() {
  	  return this.sayi1 * this.sayi2;
    }
    
    public double bolme() {
  	  return (double)this.sayi1 / this.sayi2;//burada virgülden sonrasını eklemesi için double dönüşümü yaptım.
    }
    
    
    public int power() {
    	   int	sayi=sayi1;
    	for(int i=2; i<=sayi2; i++) {
    		sayi1=sayi*sayi1;//üs alabilmek için yen bir değişken oluşturup(sayi) sayi1'e eşitledim.
    		//eğer bu adımı yapmasaydım üs alırken aldığı üssün üssünü alarak devam edecekti.bu adımı yaptığım için
    		//en başta üssünü almak istediğimiz sayı ile çarparak düzgün bir şekilde sonuca ulaştım.
    	}
    	if(sayi2==0) {//üssü 0 olan sayı 1'e eşittir.
    		sayi1=1;
    	}
    	return sayi1;
    	
    }
    
}
