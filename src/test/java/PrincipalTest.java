import org.junit.jupiter.api.*;

public class PrincipalTest {
    @Test
    public void verificaNumeroParVerdadeiroTest(){
        //Arrange
      boolean esperado = true;
      //Act
        boolean resultado = Principal.verificaNumeroPar(2);
        //Assert
        Assertions.assertEquals(esperado, resultado);
    }

}
