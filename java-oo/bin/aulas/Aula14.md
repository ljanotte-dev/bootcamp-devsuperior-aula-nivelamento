Aula11:

Espressão condicional ternária

( condição ) ? valor_se_verdadeiro : valor_se_falso

( 2 > 4 ) ? 50 : 80 = 80
( 10 != 3 ) ?

double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.10;
		} else {
			desconto = preco * 0.05;
		}
		
double preco = 34.5;
double desconto = (preco < 20.0) ? preco * 0.10 : preco * 0.05;