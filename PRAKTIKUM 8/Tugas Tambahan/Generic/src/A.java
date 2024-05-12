class Kupu {
    void gerak() {
        // Implementasi gerakan kupu-kupu
    }
}

class Ulat extends Kupu {
    @Override
    void gerak() {
        System.out.println("ulat merayap");
    }
}

class Data<T> {
    private T isi;
    T getIsi() {
        return this.isi;
    }
    void setIsi(T x) {
        this.isi = x;
    }
}

class A {
    public static void main(String[] args) {
        //Kamus
        Ulat K;
        Data<Ulat> anu;
        //Algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
    }
}