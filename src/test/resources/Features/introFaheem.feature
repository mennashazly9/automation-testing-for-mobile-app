Feature: Feature to test google search functionality

  Scenario: Check that after clicking on on search as guest button then educational level screen will display
    When click on تصفح كزائر button
    Then  screen will display مرحلتك الدراسيه


  Scenario Outline: check the salary for the teacher per hour
    When click on تصفح كزائر button
    And click on fifth grade
    And click on math category
    And click on teacher "<teacherName>"
    Then teacher salary per hour should be "<salary>"

    Examples:
      | teacherName | salary           |
      | محمد سيد    | 80 ريال لكل ساعة |