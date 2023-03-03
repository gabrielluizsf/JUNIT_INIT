package sistema;

import org.junit.*; 

public class TestOperations {

@Test
public void testAdicao() {
 
Operations op = new Operations();
 
 int num1 = 3;
 int num2 = 5;
 int result; 
 
 result = op.Adicao(num1, num2);

 Assert.assertEquals(result,8); 
} 
///////////////////////////////////////////////////////////////////////////////
@Test
public void testSubtrair() {

Operations op = new Operations();

int num1 = 3;
int num2 = 2;
int result;

result = op.Subtrair(num1, num2);

Assert.assertEquals(result,1);
}
///////////////////////////////////////////////////////////////////////////////
@Test
public void testMultplicar() {

Operations op = new Operations();

int num1 = 5;
int num2 = 3;
int result;

result = op.Multiplicar(num1, num2);

Assert.assertEquals(result,15);
}
///////////////////////////////////////////////////////////////////////////////
@Test
public void testDividir() {

Operations op = new Operations();

int num1 =50;
int num2 = 2;
int result;

result = op.Dividir(num1, num2);

Assert.assertEquals(result,25);
}
}
