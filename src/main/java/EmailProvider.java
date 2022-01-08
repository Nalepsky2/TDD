import resource.NameReaderImpl;

import java.util.List;

/*Zaimplementuj zgodnie z załozeniami TDD klasę która przyjmuje ścieżkę do pliku txt
zawierajacego listę imion i nazwisk, a zwraca listę adresów email w formacie
imie.nazwisko@example.com
dodatkowe kryteria
1)wszytskie znaki z małych liter
2)brak polskich znaków
3)w przypadku zdublowanych imion wstaw cyfrę przed @, począwszy od '2'
4)2 członowe nazwiska (w formacie "Imie Nazwisko-Nazwisko2") zapisz w formacie:
        imie.nazwisko1.nazwisko2
5)jeżeli plik jest pusty zwróc pustą listę
6)jezeli dowolna linia reprezentujaca imię pracownika zawiera cfry, znaki lub nie jest w formacie
        Imie Nazwisko lub Imie Nazwisko-Nazwisko
  zwróc informujący o tym bład

  1pkt - implementacja działajacego rozwiazania przy użyciu TDD
  1pkt - implementacja kalsy testowej z uzyciem faków
  1pkt - implemenacja klasy testowej z użyciem Mocków
  2pkt - w zależnosci od ilosci pokrytych przypadków testowych
*/

public class EmailProvider {

    private final NameReaderImpl reader;

    public EmailProvider(NameReaderImpl reader) {
        this.reader = reader;
    }

    private List<String> generate(String path) {
        return null;
    }

}
