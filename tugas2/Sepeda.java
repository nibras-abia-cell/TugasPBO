package tugas2;


public class Sepeda {
     // Property / Atribut
    String merk;
    int jarak = 0; // Jarak awal sebelum digunakan adalah 0 km
    
    // Method untuk bergerak maju 
    public void bergerakMaju() {
        jarak += 10;
    }
    
    // Method untuk bergerak mundur 
    public void bergerakMundur() {
        jarak -= 5;
    }
    
    // Method untuk berhenti 
    public void berhenti() {
        // Method berhenti menandai sepeda tidak lagi bergerak
    }
} 

