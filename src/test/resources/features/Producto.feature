#AUTOMATION: elionavarretev@gmail.com

@tag
Feature: AUTOMATION

  @caso
  Scenario Outline: Flujo de compra de Producto
    Given I select my <country> and put my <user> and my <password>
    When I find the <type> and <product> select the details
    And I add <counts> and select the add
    Then I verify my product is correct add
    And   I logout on system
    Examples:
      | country | user |password| type| product | counts |
      | Perú | 041702206 | 1 |  perfumes |Talco Perfumado Expression |  3  |



