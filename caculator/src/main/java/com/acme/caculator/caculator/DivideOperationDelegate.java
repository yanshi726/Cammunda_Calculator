package com.acme.caculator.caculator;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("DivideOperation")
public class DivideOperationDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Long operA=(Long) execution.getVariable("OperandA");
		Long operB=(Long) execution.getVariable("OperandB");
		Long result=operA / operB;
		
		execution.setVariable("result", result);


	}

}
