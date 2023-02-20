Feature: Examples of cucumber data table implementations

  Scenario: List of fruits I like
    Then User should see fruits I like
      | kiwi        |
      | banana      |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |

    # to beautify the pipes above: control + Alt + L

