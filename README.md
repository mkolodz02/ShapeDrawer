# ShapeDrawer

## Czym jest ShapeDrawer?
ShapeDrawer jest prostym edytorem graficznym, napisanym w języku Java, przy użyciu technologii Java FX. Umożliwia on  tworzenie kształtów, dopasowanych swoimi właściwościami do wymagań użytkownika oraz wyświetlanie ich na centralnym panelu aplikacji. Każdemu stworzonemu obiektowi przyznawana jest możliwość jego modyfikacji, w kwestiach takich jak ich kolor, położenie itd.

## Wykorzystane technologie
Aplikacja powstała w języku Java, w oparciu o technologię Java FX oraz format FXML. Do implementacji GUI użyte zostało również oprogramowanie Scene Builder, usprawniające konstruowanie pliku z instrukcjami FXML.

## Działanie aplikacji
Program umożliwia tworzenie:
- Prostokąta o określonych przez użytkownika wymiarach
- Koła o podanym promieniu
- Figury foremnej, o określonej liczbie boków
- Gwiazdy, o wybranej przez użytkownika, liczbie ramion
- Strzałki
- Wycinka koła o zadanym kącie i rozmiarze

Wprowadzenie parametrów tworzonego kształtu odbywa się po wciśnięciu przycisku dodającego figurę, poprzez pojawienie się okna dialogowego, w którym należy umieścić dane.

Tabela w lewej części ekranu wyświetla wszystkie utworzone obiekty, wraz z podstawowymi informacjami o każdym z nich. Aby wybrać element do modyfikacji, należy kliknąć na niego w tej sekcji.

Dla każdego kształtu możliwa jest modyfikacja:
- Koloru wypełnienia
- Koloru konturu
- Pozycji w osi X (poziomo)
- Pozycji w osi Y (pionowo)
- Kątu obrotu figury

## Uruchomienie aplikacji

Folder ```resources``` znajdujący się w katalogu projektu zawiera wymaganą bibliotekę Java FX, stąd jedyna potrzebna konfiguracja to podłączenie odpowiedniej ścieżki do niej w strukturze projektu. W tym celu należy:
1. Wejść w zakładkę File
2. Project Structure
3. Libraries -> lib
4. Przy pomocy '+' dodać ścieżkę prowadzącą do katalogu "lib" biblioteki ```javafx-sdk-18.0.1```

## Graficzna prezentacja
Przykładowe działanie:

<img align="right" src="https://user-images.githubusercontent.com/127616434/228668895-9d84d9d7-1399-40ff-90ab-59fdd8c3e712.jpg">

Widok początkowy:

<img align="left" src="https://user-images.githubusercontent.com/127616434/228630668-36948e00-e924-4598-913e-7e414ee68d02.jpg">

Okno dialogowe:

<img align="top" src="https://user-images.githubusercontent.com/127616434/228630845-d6a34b1f-ece0-4314-90a2-b84b1fc026f7.jpg">

Tabela obiektów:

<img align="left" src="https://user-images.githubusercontent.com/127616434/228631845-7cb7266e-a720-42ce-810e-c165625f5cb0.jpg">


