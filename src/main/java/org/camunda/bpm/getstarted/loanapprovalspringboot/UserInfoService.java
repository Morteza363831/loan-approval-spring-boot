package org.camunda.bpm.getstarted.loanapprovalspringboot;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class UserInfoService implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) {
        String name = (String) execution.getVariable("name");
        Integer age = Integer.parseInt(execution.getVariable("age").toString());
        String job = (String) execution.getVariable("job");

        // Process the data (e.g., print to console, save to database, etc.)
        System.out.println("User Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Job Position: " + job);

        // You can also send this information to a client or save it as needed

        
    }
}
