package Services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeServiceTest {


    @Test()
    @DisplayName("Should be able to evaluate if “Rotator” is palindrome")
    void ShouldBeAbleToEvaluateIfIsPalindrome(){
        //Arrange
        String wordTest="Rotator";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(true,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate if “bob” is palindrome")
    void ShouldBeAbleToEvaluateIfbobIsPalindrome(){
        //Arrange
        String wordTest="bob";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(true,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate if “madam” is palindrome")
    void ShouldBeAbleToEvaluateIfmadamIsPalindrome(){
        //Arrange
        String wordTest="madam";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(true,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate if “mAlAyAlam” is palindrome")
    void ShouldBeAbleToEvaluateIfmAlAyAlamIsPalindrome(){
        //Arrange
        String wordTest="mAlAyAlam";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(true,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate if “1” is palindrome")
    void ShouldBeAbleToEvaluateIf1IsPalindrome(){
        //Arrange
        String wordTest="1";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(true,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate if “Madam I’m Adam” is palindrome")
    void ShouldBeAbleToEvaluateIfmadamimadamIsPalindrome(){
        //Arrange
        String wordTest="Madam I’m Adam";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(true,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate if “Step on no pets.” is palindrome")
    void ShouldBeAbleToEvaluateIfsteponnopetsIsPalindrome(){
        //Arrange
        String wordTest="Step on no pets.";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(true,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate if “Top spot!” is palindrome")
    void ShouldBeAbleToEvaluateIftopspotIsPalindrome(){
        //Arrange
        String wordTest="Top spot!";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(true,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate if “02/02/2020” is palindrome")
    void ShouldBeAbleToEvaluateIfdateIsPalindrome(){
        //Arrange
        String wordTest="02/02/2020";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(true,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate if “Able was I, ere I saw Elba” is palindrome")
    void ShouldBeAbleToEvaluateIfbigPhrasePalindrome(){
        //Arrange
        String wordTest="Able was I, ere I saw Elba";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(true,isPalindromeService.isPalindrome(wordTest));
    }


    @Test()
    @DisplayName("Should be able to evaluate that “xyz” is not a palindrome")
    void ShouldBeAbleToEvaluatexyzisnotPalindrome(){
        //Arrange
        String wordTest="xyz";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(false,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate that “elephant” is not a palindrome")
    void ShouldBeAbleToEvaluateelephantisnotPalindrome(){
        //Arrange
        String wordTest="elephant";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(false,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate that “Country” is not a palindrome")
    void ShouldBeAbleToEvaluatecountryisnotPalindrome(){
        //Arrange
        String wordTest="Country";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(false,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate that “Top . post!” is not a palindrome")
    void ShouldBeAbleToEvaluatetoppostisnotPalindrome(){
        //Arrange
        String wordTest="Top . post!";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(false,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate that “Wonderful-fool” is not a palindrome")
    void ShouldBeAbleToEvaluatewonderfulisnotPalindrome(){
        //Arrange
        String wordTest="Wonderful-fool";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(false,isPalindromeService.isPalindrome(wordTest));
    }

    @Test()
    @DisplayName("Should be able to evaluate that “Wild imagination!” is not a palindrome")
    void ShouldBeAbleToEvaluatewildimaginationisnotPalindrome(){
        //Arrange
        String wordTest="Wild imagination!";

        //Act
        var isPalindromeService = new IsPalindromeService();

        //Assert
        assertEquals(false,isPalindromeService.isPalindrome(wordTest));
    }
}