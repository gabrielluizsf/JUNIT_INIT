# Testes Unitários


## Execução dos testes

## Dúvidas
- Sem dúvidas excelente explicação

## Feedback
### 1 ponto a melhorar --> Substituir a palavra automatizados por unitários
- introdução sobre como realizar testes automatizados utilizando a linguagem Java e o framework JUnit 4 --> introdução sobre como realizar testes unitários utilizando a linguagem Java e o framework JUnit 4.
- Agora vamos iniciar o nosso projeto de testes automatizados --> Agora vamos iniciar o nosso projeto de testes unitários

### 2 ponto a melhorar --> Mudar o nome de variáveis sem sentido 

#### Como estava no artigo:

```java

package sistema;

import org.junit.*; 

public class TestOperations {

@Test
public void testAdicao() {
 
Operations a = new Operations();
 
 int num1 = 3;
 int num2 = 5;
 int result; 
 
 result = a.Adicao(num1, num2);

 Assert.assertEquals(result,8); 
} 
///////////////////////////////////////////////////////////////////////////////
@Test
public void testSubtrair() {

Operations s = new Operations();

int num1 = 3;
int num2 = 2;
int result;

result = s.Subtrair(num1, num2);

Assert.assertEquals(result,1);
}
///////////////////////////////////////////////////////////////////////////////
@Test
public void testMultplicar() {

Operations m = new Operations();

int num1 = 5;
int num2 = 3;
int result;

result = m.Multiplicar(num1, num2);

Assert.assertEquals(result,15);
}
///////////////////////////////////////////////////////////////////////////////
@Test
public void testDividir() {

Operations d = new Operations();

int num1 =50;
int num2 = 2;
int result;

result = d.Dividir(num1, num2);

Assert.assertEquals(result,25);
}
}

```

#### Mais legível

```java

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

```

### 3 ponto a melhorar --> Substituir os Prints de código pelo código escrito para facilitar na hora de copiar