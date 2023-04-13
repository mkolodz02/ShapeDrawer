# ShapeDrawer 
[English version below](#what-is-shapedrawer)

## Czym jest ShapeDrawer
ShapeDrawer jest prostym edytorem graficznym, napisanym w języku Java, przy użyciu technologii Java FX. Umożliwia on  tworzenie kształtów, dopasowanych swoimi właściwościami do wymagań użytkownika oraz wyświetlanie ich na centralnym panelu aplikacji. Każdemu stworzonemu obiektowi przyznawana jest możliwość jego modyfikacji, w kwestiach takich jak ich kolor, położenie i kąt obrotu.

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
- Kąta obrotu figury

## Uruchomienie aplikacji
(Poniższe instrukcje są kompatybilne ze środowiskiem **IntelliJ IDEA**)

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

<img align="top" src="https://user-images.githubusercontent.com/127616434/228631845-7cb7266e-a720-42ce-810e-c165625f5cb0.jpg">

## What is ShapeDrawer
ShapeDrawer is a simple graphic editor, written in Java, with Java FX libraries. It allows to create shapes, adjust their properties to user's expectations and display them in the central panel of the application. Each created object can be modified in matters of its colour, placing and rotation angle.

## Used technologies
Application was written in Java, based on Java FX components and FXML format. GUI implementation was created with the help of SceneBuilder tool, that optimized the creation of FXML files.

## Main features
ShapeDrawer enables creating:
- A rectangle with dimensions specified by the user
- A circle with certain radius
- A regular polygon with defined number of sides
- A star shape with specified number of arms
- An arrow
- A sector of a circle with defined angle and size

Shape parameters can be provided by passing values into a dialog window, displayed after pressing the 'add' button.

The table in the left part of the screen displays all created objects, with basic information about them. Element to edit can be selected by clicking on the specific row in the table. 

For every shape, application provides modification of its:
- Fill colour
- Outline colour
- Position on X axis (horizontally)
- Position on Y axis (vertically)
- Angle of rotation

## Application start-up
(Following instructions are consistent with **IntelliJ IDEA** IDE)

```resources``` directory, located in the project catalogue, contains required Java FX libraries. That is why the only necessary configuration, is to connect proper path to them in project structure. These are a few steps how to achieve that:
1. Click on the ```File``` tab
2. Project Structure
3. Libraries -> lib
4. Add path to the 'lib' directory of ```javafx-sdk-18.0.1``` library, by clicking '+' symbol

## Screenshots
Usage example:

<img align="right" src="https://user-images.githubusercontent.com/127616434/228668895-9d84d9d7-1399-40ff-90ab-59fdd8c3e712.jpg">

Initial view:

<img align="left" src="https://user-images.githubusercontent.com/127616434/228630668-36948e00-e924-4598-913e-7e414ee68d02.jpg">

Dialog window:

<img align="top" src="https://user-images.githubusercontent.com/127616434/228630845-d6a34b1f-ece0-4314-90a2-b84b1fc026f7.jpg">

Object table:

<img align="top" src="https://user-images.githubusercontent.com/127616434/228631845-7cb7266e-a720-42ce-810e-c165625f5cb0.jpg">
