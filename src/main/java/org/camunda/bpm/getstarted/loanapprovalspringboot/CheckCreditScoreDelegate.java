package org.camunda.bpm.getstarted.loanapprovalspringboot;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckCreditScoreDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // Simulate a credit score check
        int creditScore = (int) (Math.random() * 850); // Random credit score between 0 and 850
        execution.setVariable("creditScore", creditScore);

        // Decision logic based on credit score
        if (creditScore < 600) {
            execution.setVariable("decision", "reject");
        } else if (creditScore < 700) {
            execution.setVariable("decision", "managerApproval");
        } else {
            execution.setVariable("decision", "approve");
        }
    }
}
