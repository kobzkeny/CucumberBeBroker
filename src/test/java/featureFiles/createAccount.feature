Feature: Stworz konto uzytkownika
  Tworzenie od podstaw konta dla nowego uzytkownika
  Scenario: Uzytkownik od podstaw tworzy konto na serwisie beBroker
    Given Uzytkownik przechodzi na serwis dev.beBroker
    And Uzytkownik klika w przycisk Darmowe Konto
    And Uzytkownik klika w przycisk Zarejestruj sie
    And Uzytkownik uzupelnia formularz korzystajac z  poprawnych danych
    When Uzytkownik uruchamia link aktywacyjny w fikcyjnym mailu
    Then Uzytkownik poprawnie zarejestrowal konto
