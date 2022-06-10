import controller.ContactController;

public class Main {
    public static void main(String[] args) {
        ContactController controller = new ContactController();
        controller.startApplication();
    }
}


// odsluzxyc exceptiony (jezeli uzytwkonik wprowadzi np liczby a powinien litery, to dostanie odpowiedni komunikat w stylu "prosze wpisac litery"
// obsluzyc to, ze uzytkownik moze wprowadzic nulla albo puste pole. jesli pole jest puste, lub string jest pusty to niech wyrzuci exceptiona, ze nie moze byc puste
// zapis i odczyt z pliku CSV (jako kolejna opcja w menu) jak uzytkownik wybierze te opcje  to czysci hashmape i wpisuje nowe kontakty.
// Poczytac o bibliotekach do CSV String.split