Feature: Uzytkownik sprawdza oferty
  Przy pomocy wyszukiwarki ofert na stronie glownej portalu, uzytkownik sprawdza dostepne oferty mieszkan na sprzedaz we Wroclawiu
  Scenario: Uzytkownik korzystajac z wyszukiwarki wyszukuje oferty nieruchomosci we Wroclawiu
    Given Uzytkownik przechodzi na serwis internetowy  dev.beBroker
    And Uzytkownik w wyszukiwarce wybiera typ nieruchomosci mieszkanie
    And Uzytkownik ustawia tryb transakcji na sprzedaz
    And Uzytkownik wybiera miasto Wroclaw
    And Uzytkownik akceptuje wprowadzone kryteria przyciskiem szukaj
    And Uzytkownik wybiera dowolna oferte z listy poprzez przycisk zobacz
    When Uzytkownik uzupelnia formularz kontaktowy i wysyla zapytanie do  klienta
    Then Wiadomosc do klienta zostala wyslana poprzez formularz