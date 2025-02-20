package labpadroes.gof;

import labpadroes.gof.facade.Facade;
import labpadroes.gof.singleton.SingletonEager;
import labpadroes.gof.singleton.SingletonLazy;
import labpadroes.gof.singleton.SingletonLazyHolder;
import labpadroes.gof.strategy.Comportamento;
import labpadroes.gof.strategy.ComportamentoAgressivo;
import labpadroes.gof.strategy.ComportamentoDefensivo;
import labpadroes.gof.strategy.ComportamentoNormal;
import labpadroes.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyholder);
		
		//Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();

		// Facade
		Facade facade = new Facade();
		facade.migrarCliente("Ana Julia", "06714230");
	}

}
