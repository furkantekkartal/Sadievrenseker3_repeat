package sadievrenseker3_repeat;

public class Sadievrenseker3_repeat {
    public static void main(String[] args) {
        insan billur = new insan(48);
        calisan betul = new calisan(27,10000);
        muhendis furkan = new muhendis(32,15000,30);
        mudur mustafa = new mudur(65,30000,20);
        satisci volkan = new satisci(40,20000,25);
        
        System.out.println("Billur'un yasi: "+ billur.yas);
        System.out.println("Betul'un maasi: "+ betul.maas);        
        System.out.println("Furkan'in maasi: "+ furkan.maas);
        System.out.println("Volkan'in maasi: "+ volkan.maas);
        System.out.printf("Mustafa'in maasi: "+ mustafa.maas + "\n\n");
        
        volkan.ciro = 1000000;
        
        volkan.prim();
        mustafa.prim();
        
        System.out.println("Volkan'in primi: "+ volkan.prim);
        System.out.printf("Mustafa'in primi: "+ mustafa.prim + "\n\n");
        
        furkan.zam();
        volkan.zam();  
        mustafa.zam();

        System.out.println("Furkan'in yeni maasi: "+ furkan.maas);
        System.out.println("Volkan'in yeni maasi: "+ volkan.maas);
        System.out.printf("Mustafa'in yeni maasi: "+ mustafa.maas + "\n\n");        
             
    }
}

class insan{
    int yas;
    
    public insan(){
        
    }
    
    public insan(int yas){
        this.yas = yas;
    }
}

class calisan extends insan{
    int maas;
    
    public calisan(){
        
    }
    
    public calisan(int yas, int maas){
        this.yas = yas;
        this.maas= maas;
    }
}

class muhendis extends calisan{
    int zam;
    
    public muhendis(){
        
    }
    public muhendis(int yas,int maas, int zam){
        this.yas= yas;
        this.maas= maas;
        this.zam= zam;
    }
    
    int zam(){
        maas = maas + maas * zam / 100;
        return maas;
    }
}

class mudur extends muhendis{
    int prim;
    
    public mudur(){
        
    }
    
    public mudur(int yas, int maas, int zam){
        this.yas= yas;
        this.maas=maas;
        this.zam= zam;
    }
    
    @Override
    int zam(){
        maas = maas + maas * zam / 100;
        return maas;
    }

    int prim(){
        prim = maas * 3;
        return prim;
    }    
}

class satisci extends calisan{
    int zam;
    int prim;
    int ciro;
    
    public satisci(){
        
    }
    
    public satisci(int yas,int maas, int zam){
        this.yas= yas;
        this.maas=maas;
        this.zam= zam;
    }

    int zam(){
        maas = maas + maas * zam / 100;
        return maas;
    }

    int prim(){
        prim = (int) (ciro * 0.05);
        return prim;
    }
}