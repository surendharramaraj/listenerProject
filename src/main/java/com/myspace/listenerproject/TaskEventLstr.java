package com.myspace.listenerproject;

/**
 * This class was automatically generated by the data modeler tool.
 */
 
import org.kie.api.task.TaskEvent;
import org.kie.api.task.TaskLifeCycleEventListener;

public class TaskEventLstr implements java.io.Serializable,TaskLifeCycleEventListener {

    static final long serialVersionUID = 1L;

    public TaskEventLstr() {
    }

    @Override
    public void afterTaskActivatedEvent(TaskEvent event) {
        System.out.println("-------------afterTaskActivatedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------afterTaskActivatedEvent---------------");
    }

    @Override
    public void afterTaskAddedEvent(TaskEvent event) {
        // long taskId = event.getTask().getId();
        // String taskOwner = event.getTask().getTaskData().getTaskInputVariables().get("GroupId").toString();
        // String taskStatus = "OPEN";
        // System.out.println("-------------AFTER TASK ADDED EVENT---------------");
        // System.out.println("Taskowner -- " + taskOwner);
        // System.out.println("taskstaus -- " + taskStatus);
        // System.out.println("----FINISHED---------AFTER TASK ADDED EVENT---------------");
        System.out.println("-------------afterTaskAddedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------afterTaskAddedEvent---------------");
        
    }

    @Override
    public void afterTaskClaimedEvent(TaskEvent event) {
        System.out.println("-------------afterTaskClaimedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------afterTaskClaimedEvent---------------");
    }

    @Override
    public void afterTaskCompletedEvent(TaskEvent event) {
        
        
        // long taskId = event.getTask().getId();
        // String taskName = event.getTask().getName();
        // String taskOwner = event.getTask().getTaskData().getTaskInputVariables().get("GroupId").toString();
        // // String userAction = event.getTask().getTaskData().getTaskInputVariables().get("userAction").toString();
        // String taskStatus = "COMPLETED";
        // System.out.println("-------------AFTER TASK COMPLETED EVENT---------------");
        // System.out.println("Taskowner -- " + taskOwner);
        // // System.out.println("UserActio -- " + userAction);
        // System.out.println("taskstaus -- " + taskStatus);
        // System.out.println("----FINISHED---------AFTER TASK COMPLETED EVENT---------------");
        
        System.out.println("-------------afterTaskCompletedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------afterTaskCompletedEvent---------------");
        
    }

    @Override
    public void afterTaskDelegatedEvent(TaskEvent event) {
        System.out.println("-------------afterTaskDelegatedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------afterTaskDelegatedEvent---------------");
    }

    @Override
    public void afterTaskExitedEvent(TaskEvent event) {
        System.out.println("-------------afterTaskExitedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------afterTaskExitedEvent---------------");
    }

    @Override
    public void afterTaskFailedEvent(TaskEvent event) {

    }

    @Override
    public void afterTaskForwardedEvent(TaskEvent event) {
        System.out.println("-------------afterTaskForwardedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------afterTaskForwardedEvent---------------");
    }

    @Override
    public void afterTaskNominatedEvent(TaskEvent event) {

    }

    @Override
    public void afterTaskReleasedEvent(TaskEvent event) {
        System.out.println("-------------afterTaskReleasedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------afterTaskReleasedEvent---------------");
    }

    @Override
    public void afterTaskResumedEvent(TaskEvent event) {

    }

    @Override
    public void afterTaskSkippedEvent(TaskEvent event) {

    }

    @Override
    public void afterTaskStartedEvent(TaskEvent event) {


         // Get the task service from the runtime engine
         

         // Get the task instance ID from the event
        //  long taskId = event.getTask().getId();
        
        System.out.println("-------------afterTaskStartedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------afterTaskStartedEvent---------------");

    }

    @Override
    public void afterTaskStoppedEvent(TaskEvent event) {

    }

    @Override
    public void afterTaskSuspendedEvent(TaskEvent event) {

    }

    @Override
    public void beforeTaskActivatedEvent(TaskEvent event) {
        System.out.println("-------------beforeTaskActivatedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------beforeTaskActivatedEvent---------------");
    }

    @Override
    public void beforeTaskAddedEvent(TaskEvent event) {
        System.out.println("-------------beforeTaskAddedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------beforeTaskAddedEvent---------------");
    }

    @Override
    public void beforeTaskClaimedEvent(TaskEvent event) {
        System.out.println("-------------beforeTaskClaimedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------beforeTaskClaimedEvent---------------");
    }

    @Override
    public void beforeTaskCompletedEvent(TaskEvent event) {
        System.out.println("-------------beforeTaskCompletedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("User action + " + event.getTask().getTaskData().getTaskOutputVariables().get("comment").toString());
        System.out.println("------completed-------beforeTaskCompletedEvent---------------");
    }

    @Override
    public void beforeTaskDelegatedEvent(TaskEvent event) {

    }

    @Override
    public void beforeTaskExitedEvent(TaskEvent event) {
        System.out.println("-------------beforeTaskExitedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------beforeTaskExitedEvent---------------");
    }

    @Override
    public void beforeTaskFailedEvent(TaskEvent event) {

    }

    @Override
    public void beforeTaskForwardedEvent(TaskEvent event) {

    }

    @Override
    public void beforeTaskNominatedEvent(TaskEvent event) {

    }

    @Override
    public void beforeTaskReleasedEvent(TaskEvent event) {

    }

    @Override
    public void beforeTaskResumedEvent(TaskEvent event) {

    }

    @Override
    public void beforeTaskSkippedEvent(TaskEvent event) {

    }

    @Override
    public void beforeTaskStartedEvent(TaskEvent event) {
        System.out.println("-------------beforeTaskStartedEvent---------------");
        System.out.println(event.getTask().getName());
        System.out.println("------completed-------beforeTaskStartedEvent---------------");
    }

    @Override
    public void beforeTaskStoppedEvent(TaskEvent event) {

    }

    @Override
    public void beforeTaskSuspendedEvent(TaskEvent event) {

    }


}