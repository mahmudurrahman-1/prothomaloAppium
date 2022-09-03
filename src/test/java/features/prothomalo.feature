Feature: ProthamAlo app feature
  Scenario: section feature validation
    Given Sujon open the prothomalo app
    And Sujon Selects Section
    And Sujon choose ধর্ম from sections
    And Sujon filter news by Islam
    And Sujon finds "headline" and clicked on that
    When Sujon click on top right font
    Then Sujon selects first and click ok

