import controller.ContactController;

public class Main {
    public static void main(String[] args) {
        ContactController controller = new ContactController();
        controller.startApplication();
    }
}


// odsluzxyc exceptiony (jezeli uzytwkonik wprowadzi np liczby a powinien litery, to dostanie odpowiedni komunikat w stylu "prosze wpisac litery"
// obsluzyc to, ze uzytkownik moze wprowadzic nulla albo puste pole. jesli pole jest puste, lub string jest pusty to niech wyrzuci exceptiona
// zapis i odczyt z pliku CSV (jako kolejna opcja w menu) jak uzytkownik wybierze te opcje  to czysci hashmape i wpisuje wskakuja kontakty.
// Poczytac o bibliotekach do CSV String.split

/*

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Podaj nazwe pliku");

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Path pathToFile = Path.of("C:/Users/oskar/IdeaProjects/JavaClass/FileLineCounter/Files/TextFiles/" + path);
        System.out.println(pathToFile.getFileName());

        try (Stream <String> stream = lines(pathToFile)){
            System.out.println(stream.count());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//        C:\Users\oskar\IdeaProjects\JavaClass\FileLineCounter\Files\XDDD\example.txt
//        Stwórz program który zliczy liczbę linii tekstu dla wszystkich plików w wskazanym folderze
//        Wynikiem powinna być lista plików wraz z informacją o liczbie linii oraz suma wszystkich linii w folderze.
//        Generalnie wypakuj i wrzuć do classpath
//        Procesowanie plikow
//        instancja klasy
//        program sie zaczyna i wyswietla sie komunikat "podaj sciezke do folderu, ktory ma byc przeskanowany"
//        ten plik musze patha skopiowac.
//        ZROBIC sama metode ktora procesuje linijki, ktora na sztywno sprawdzi jakas sciezke string path = nazwa ciezki
//        i z tego patha zrobic plik i sprawdzac  czy ten plik istnieje lub przejsc od razu do czytania linije
//
//        STAGE 2 dodac petle
//        ktora czeka az wprowadze nazwe pliku i patrzylbym qwteey czy ten plik jestw  pathie
//        dopisac obsluge bledow, wyjatki, plik nie istnieje itp
//        git push -u origin feature/ex1*/
