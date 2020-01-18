Feature: Dodaj oferte mieszkania
  Wystawienie oferty sprzedazy mieszkania
  Scenario: Zalogowany uzytkownik wystawia oferte sprzedazy  mieszkania
    Given Uzytkownik przechodzi na serwisik  dev.beBroker
    And Uzytkownik klika w przycisk dodaj ogloszenie
    And Uzytkownik loguje sie na swoje konto
    And Uzytkownik klika panel dodaj oferte
    And Uzytkownik wybiera opcje mieszkania na sprzedaz
    And Uzytkownik uzupelnia dane podstawowe mieszkania oraz akceptuje oferte przyciskiem przejdz dalej
    When Uzytkownik akceptuje oferte przyciskiem przejdz dalej
    Then Uzytkownik akceptuje oferte oraz przechodzi na strone platnosci
