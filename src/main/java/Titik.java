import java.util.Scanner;
class Titik {
    private int x;
    private int y;

    public Titik(){
        this.x = 0;
        this.y = 0;
    }
    public void inisialisasiTitik(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void tampilTitik() {
        System.out.println("(" + x + "," + y + ")");
    }
    public void perkalianSkalar(int skalar){
        this.x *= skalar;
        this.y *= skalar;
    }
    public void pencerminanSumbuX(){
        this.y *= -1;
    }
    public void pencerminanSumbuY(){
        this.x *= -1;
    }
    public int jarak(Titik t2){
        int deltaX = this.x - t2.x;
        int deltaY = this.y - t2.y;
        int jarak = (int) Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2));
        return jarak;
    }
    public void keluarMenu(){
        System.out.println("\tAnda telah keluar dari menu...");
        System.out.println("\tSampai Jumpa!!!");
    }
}