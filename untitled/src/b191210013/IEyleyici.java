package b191210013;

public interface IEyleyici {
    IObserver kritikSogutma = new KritikSogutma();

    int sogutucuAc(int sicaklik, String tür) throws InterruptedException;

    void sogutucuKapat() throws InterruptedException;

}
